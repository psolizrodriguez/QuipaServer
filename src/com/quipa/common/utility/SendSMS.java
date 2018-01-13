package com.quipa.common.utility;

public class SendSMS {

	public static void sendSMSTo(String phoneNumber, String message) {

		// String value = "/usr/bin/curl
		// 'https://api.twilio.com/2010-04-01/Accounts/AC83bfd7083ce440a382237364325ab8c5/Messages.json'
		// -X POST \\--data-urlencode 'To=+13123838870' \\--data-urlencode
		// 'From=+12244125879' \\--data-urlencode 'Body=Testing Servlet' \\-u
		// AC83bfd7083ce440a382237364325ab8c5:210983586ab819afb1d48e38ee23823e";
		String value = "sudo service sendsms '" + phoneNumber + "' '" + message + "'";
		System.out.println(value);
		try {
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(value);
			// any error message?
			StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR");

			// any output?
			StreamGobbler outputGobbler = new StreamGobbler(proc.getInputStream(), "OUTPUT");

			// kick them off
			errorGobbler.start();
			outputGobbler.start();

			// any error???
			int exitVal = proc.waitFor();
			System.out.println("ExitValue: " + exitVal);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
