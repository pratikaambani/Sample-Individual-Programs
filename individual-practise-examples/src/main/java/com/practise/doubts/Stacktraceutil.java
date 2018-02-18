package com.practise.doubts;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

// To return the stack trace of an exception as a string

public final class Stacktraceutil {

	public static String getStackTrace(Throwable aThrowable) {

		Writer result = new StringWriter();
		PrintWriter printWriter = new PrintWriter(result);
		aThrowable.printStackTrace(printWriter);
		return result.toString();
	}

	public static String getCustomStackTrace(Throwable aThrowable) {

		StringBuilder result = new StringBuilder("BOO-BOO: ");
		result.append(aThrowable.toString());

		String NEW_LINE = System.getProperty("line.separator");
		result.append(NEW_LINE);

		for (StackTraceElement element : aThrowable.getStackTrace()) {
			result.append(element);
			result.append(NEW_LINE);
		}
		return result.toString();
	}

	public static void main(String... aArguments) {
		final Throwable throwable = new IllegalArgumentException("Blah");
		System.out.println(getStackTrace(throwable));
		System.out.println(getCustomStackTrace(throwable));
	}
}