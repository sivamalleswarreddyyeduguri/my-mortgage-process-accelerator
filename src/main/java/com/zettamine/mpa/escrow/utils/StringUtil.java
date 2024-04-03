package com.zettamine.mpa.escrow.utils;

import java.util.regex.Pattern;

public class StringUtil {
		
	private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");

    public static String removeExtraSpaces(String str) {
        if (str != null && !str.isEmpty()) {
            return WHITESPACE_PATTERN.matcher(str).replaceAll(" ").trim();
        }
        return str;
    }

    public static String removeAllSpaces(String str) {
        if (str != null && !str.isEmpty()) {
            return WHITESPACE_PATTERN.matcher(str).replaceAll("").trim();
        }
        return str;
    }
}
