package com.quipa.common.utility;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

import com.quipa.common.constants.AppBaseConstantsWeb;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import sun.misc.BASE64Decoder;

public class AppBaseUtilsWeb {
	private static Logger LOGGER = Logger.getLogger(AppBaseUtilsWeb.class);
	
	public static boolean sendMessage(String phoneNumber, String message) {
		System.out.println("Sending message " + message + " to " + phoneNumber);
		String value = "curl 'https://api.twilio.com/2010-04-01/Accounts/AC83bfd7083ce440a382237364325ab8c5/Messages.json' -X POST \\--data-urlencode 'To=+" + phoneNumber + "' \\--data-urlencode 'From=+12244125879' \\--data-urlencode 'Body=" + message + "' \\-u AC83bfd7083ce440a382237364325ab8c5:210983586ab819afb1d48e38ee23823e";
		try {
			Runtime.getRuntime().exec(value);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static BufferedImage decodeToImage(String imageString) {

		BufferedImage image = null;
		byte[] imageByte;
		try {
			BASE64Decoder decoder = new BASE64Decoder();
			imageByte = decoder.decodeBuffer(imageString);
			ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
			image = ImageIO.read(bis);
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}

	public static boolean saveImageToServer(BufferedImage image, String fileName) {
		try {
			File file = new File(AppBaseConstantsWeb.IMAGES_PATH + fileName + AppBaseConstantsWeb.PROFILE_PICTURE_EXTENSION);
			ImageIO.write(image, "png", file);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static String getFileName(MultivaluedMap<String, String> header) {

		String[] contentDisposition = header.getFirst("Content-Disposition").split(";");

		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {

				String[] name = filename.split("=");

				String finalFileName = name[1].trim().replaceAll("\"", "");
				return finalFileName;
			}
		}
		return "unknown";
	}

	public static void setContentTypeHelper(HttpServletResponse response, String fileType, String fileName) {
		if (fileType.trim().equalsIgnoreCase("txt")) {
			response.setContentType("text/plain");
		} else if (fileType.trim().equalsIgnoreCase("htm")) {
			response.setContentType("text/html");
		} else if (fileType.trim().equalsIgnoreCase("html")) {
			response.setContentType("text/html");
		} else if (fileType.trim().equalsIgnoreCase("doc")) {
			response.setContentType("application/msword");
		} else if (fileType.trim().equalsIgnoreCase("xls")) {
			response.setContentType("application/vnd.ms-excel");
		} else if (fileType.trim().equalsIgnoreCase("pdf")) {
			response.setContentType("application/pdf");
		} else if (fileType.trim().equalsIgnoreCase("ppt")) {
			response.setContentType("application/ppt");
		} else if (fileType.trim().equalsIgnoreCase("gif")) {
			response.setContentType("image/gif");
		} else if (fileType.trim().equalsIgnoreCase("bmp")) {
			response.setContentType("image/bmp");
		} else if (fileType.trim().equalsIgnoreCase("jpe")) {
			response.setContentType("image/jpeg");
		} else if (fileType.trim().equalsIgnoreCase("jpg")) {
			response.setContentType("image/jpeg");
		} else if (fileType.trim().equalsIgnoreCase("jpeg")) {
			response.setContentType("image/jpeg");
		} else if (fileType.trim().equalsIgnoreCase("rtf")) {
			response.setContentType("application/rtf");
		} else if (fileType.trim().equalsIgnoreCase("tiff")) {
			response.setContentType("image/tiff");
		} else if (fileType.trim().equalsIgnoreCase("tif")) {
			response.setContentType("image/tiff");
		} else {
			response.setContentType("application/octet-stream");
		}
		response.setHeader("Content-Disposition", "inline; filename=\"" + fileName + "\"");
	}

	public static Date stringToDate(String date, String format) {
		try {
			return new SimpleDateFormat(format).parse(date);
		} catch (Exception e) {
			printException(LOGGER, e);
			return null;
		}

	}

	public static String dateToString(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}

	public static BigDecimal StringToBigDecimal(String value) {
		try {
			return new BigDecimal(value);
		} catch (Exception e) {
			printException(LOGGER, e);
			return null;
		}

	}

	public static BigDecimal IntToBigDecimal(int value) {
		try {
			return new BigDecimal(value);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static int StringToInt(String value) {
		return Integer.parseInt(value);
	}

	public static Calendar getCurrentTime() {
		return Calendar.getInstance();
	}

	public static Date getCurrentDate() {
		return new Date();
	}

	public static String CalendarToString(Calendar value, String format) {
		return new SimpleDateFormat(format).format(value.getTime());
	}

	public static Calendar StringToCalendar(String value, String format) {
		Calendar cal = Calendar.getInstance();
		try {
			cal = Calendar.getInstance();
			cal.setTime(new SimpleDateFormat(format).parse(value));
		} catch (ParseException e) {
			printException(LOGGER, e);
		}
		return cal;
	}

	public static Calendar DateToCalendar(Date value) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(value);
		return cal;
	}

	public static String encriptText(String value) {
		ShaPasswordEncoder shaPwdEncd = new ShaPasswordEncoder(AppBaseConstantsWeb.BYTES_FOR_ENCRIPTION);
		String newValue = shaPwdEncd.encodePassword(value, AppBaseConstantsWeb.KEY_FOR_ENCRIPTION);
		shaPwdEncd = new ShaPasswordEncoder();
		newValue = shaPwdEncd.encodePassword(newValue, AppBaseConstantsWeb.KEY_FOR_ENCRIPTION);
		return newValue;
	}

	public static void printException(Logger localLogger, Exception e) {
		localLogger.error("Exception found : " + e.getMessage());
		localLogger.error("Cause : " + e.getCause());
		localLogger.error("Message : " + e.getLocalizedMessage());
		localLogger.error("***********************");
		for (int j = 0; j < e.getStackTrace().length; j++) {
			localLogger.error(e.getStackTrace()[j]);
		}
		localLogger.error("***********************");
	}

	public static double roundTo(double value, int numDecimales) {
		double mult = 1;
		for (int i = 0; i < numDecimales; i++) {
			mult = mult * 10;
		}
		int newValue = (int) (value * mult);

		return ((double) newValue) / mult;
	}

	public static BigDecimal roundTo(BigDecimal bdValue, int numDecimales) {
		double mult = 1;
		for (int i = 0; i < numDecimales; i++) {
			mult = mult * 10;
		}
		int newValue = (int) (bdValue.doubleValue() * mult);

		return BigDecimal.valueOf(((double) newValue) / mult);
	}

	public static Object[] listToArray(List<?> list) {
		Object[] result = new Object[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static List<Object> mergeTwoLists(List<Object> resultList, List<Object> addList) {
		for (Object obj : addList) {
			if (!resultList.contains(obj)) {
				resultList.add(obj);
			}
		}
		return resultList;
	}

	public static JasperReport getJasperReportAsStream(String reportName) {
		try {
			return JasperCompileManager
					.compileReport(JRXmlLoader.load(AppBaseUtilsWeb.class.getResourceAsStream(reportName)));
		} catch (JRException e) {
			printException(LOGGER, e);
			return null;
		}
	}

	public static final Integer getInteger(Object obj) {
		Integer rv = null;
		try {
			if ((obj.getClass() == Double.class)) {
				rv = Integer.parseInt(String.valueOf(Math.round((Double.parseDouble(String.valueOf(obj))))));
			} else {
				if ((obj.getClass() == Integer.class) || (obj.getClass() == Long.class)
						|| (obj.getClass() == Double.class)) {
					rv = Integer.parseInt(obj.toString());
				} else if ((obj.getClass() == int.class) || (obj.getClass() == long.class)
						|| (obj.getClass() == double.class)) {
					rv = (Integer) obj;
				} else if (obj.getClass() == String.class) {
					rv = Integer.parseInt(obj.toString());
				}
			}
		} catch (Exception e) {
			printException(LOGGER, e);
		}
		return rv;
	}

	public static final Double getDouble(Object obj) {
		Double rv = null;
		try {
			if ((obj.getClass() == Integer.class) || (obj.getClass() == Long.class)
					|| (obj.getClass() == Double.class)) {
				rv = Double.parseDouble(obj.toString());
			} else if ((obj.getClass() == int.class) || (obj.getClass() == long.class)
					|| (obj.getClass() == double.class)) {
				rv = (Double) obj;
			} else if (obj.getClass() == String.class) {
				rv = Double.parseDouble(obj.toString());
			}
		} catch (Exception e) {
			printException(LOGGER, e);
		}
		return rv;
	}
}
