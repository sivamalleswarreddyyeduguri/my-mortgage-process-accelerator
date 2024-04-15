package com.zettamine.mpa.escrow.utils;

import java.util.List;
import java.util.regex.Pattern;

import com.zettamine.mpa.escrow.constants.EscrowConstants;
import com.zettamine.mpa.escrow.dto.EscrowReqDto;
import com.zettamine.mpa.escrow.entity.Escrow;
import com.zettamine.mpa.escrow.entity.EscrowAgent;
import com.zettamine.mpa.escrow.entity.EscrowServiceArea;

public class StringUtil {
		
	private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");

    public static String removeExtraSpaces(String str) {
        if (str != null && !str.isEmpty()) {
            return WHITESPACE_PATTERN.matcher(str).replaceAll(" ").trim();
//            return str = str.replaceAll("^\\s+|\\s+$|\\s+(?=\\s)", "");

        }
        return str;
    }

    public static String removeAllSpaces(String str) {
        if (str != null && !str.isEmpty()) {
            return WHITESPACE_PATTERN.matcher(str).replaceAll("").trim();
        }
        return str;
    }
   
    
    public static EscrowReqDto formatEscrowReq(EscrowReqDto escoReqDto) {
    	escoReqDto.setReqName(normalizeString(escoReqDto.getReqName()));
		return escoReqDto;
    }
    public static List<String> formatEscrowReq(List<String> reqNames) {
		return reqNames.stream().map(req->normalizeString(req)).toList();
    }
    
    public static String normalizeString(String str) {
    	str = str.replaceAll(EscrowConstants.ONLY_ALPHA_REGEX, "").trim().toUpperCase();
    	 return StringUtil.removeExtraSpaces(removeExtraSpaces(str));
    }
    
    
}
