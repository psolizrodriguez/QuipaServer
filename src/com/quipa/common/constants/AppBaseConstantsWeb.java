package com.quipa.common.constants;

public class AppBaseConstantsWeb {
	// Application Constants
	public static int BYTES_FOR_ENCRIPTION = 512;
	public static String KEY_FOR_ENCRIPTION = "EBookStore";
	public static String DATE_FORMAT = "MM/dd/yy";
	public static String DATETIME_FORMAT = "MM/dd/yy HH:mm:ss";
	public static String SYSTEM_SEPARATOR = System.getProperty("file.separator");
	public static String IMAGES_PATH = SYSTEM_SEPARATOR + "opt" + SYSTEM_SEPARATOR + "img" + SYSTEM_SEPARATOR;
	public static String PROFILE_PICTURE_EXTENSION = ".png";
	public static String SERVER_URL = "54.152.63.102";

	// PROFILE STATUS
	public static final String PROFILE_STATUS_PENDING = "Pending";
	public static final String PROFILE_STATUS_VERIFIED = "Verified";
	// PROFILE CATEGORY VALUE
	public static final String PROFILE_CATEGORY_01 = "Novice";
	public static final String PROFILE_CATEGORY_02 = "Intermediate";
	public static final String PROFILE_CATEGORY_03 = "Advanced";
	public static final String PROFILE_CATEGORY_04 = "Expert";
	// PROFILE STATUS
	public static final String REQUEST_STATUS_PENDING = "Pending";
	public static final String REQUEST_STATUS_ACCEPTED = "Accepted";
	// PROFILE PRICEXHOUR VALUE
	public static final Double PROFILE_PRICEXHOUR_01 = 10.0;
	public static final Double PROFILE_PRICEXHOUR_02 = 20.0;
	public static final Double PROFILE_PRICEXHOUR_03 = 30.0;
	public static final Double PROFILE_PRICEXHOUR_04 = 40.0;
	// PAYMENT STATUS
	public static final String PAYMENT_STATUS_PENDING = "Pending";
	public static final String PAYMENT_STATUS_VERIFIED = "Verified";
	public static final String PAYMENT_STATUS_PAID = "Paid";
	public static final String PAYMENT_STATUS_REFUNDED = "Refunded";
	public static final String PAYMENT_STATUS_PARTIALLY_REFUNDED = "Partially Refunded";
}
