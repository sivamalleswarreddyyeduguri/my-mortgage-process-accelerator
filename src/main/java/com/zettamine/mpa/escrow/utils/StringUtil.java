package com.zettamine.mpa.escrow.utils;

import java.util.regex.Pattern;

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
    
    public static Escrow escrowRemoveSpaces(Escrow escrow) {
    	    
    	    if(escrow != null) {
    	    	 escrow.setAddress(StringUtil.removeExtraSpaces(escrow.getAddress().toUpperCase()));
    	    	 escrow.setEsAcBankName(StringUtil.removeExtraSpaces(escrow.getEsAcBankName().toUpperCase()));
    	    	 escrow.setState(StringUtil.removeExtraSpaces(escrow.getState().toUpperCase()));
    	    	 escrow.setCity(StringUtil.removeExtraSpaces(escrow.getCity().toLowerCase()));
    	    	 escrow.setEscoName(StringUtil.removeExtraSpaces(escrow.getEscoName().toUpperCase()));
    	    	  
    	    	 return escrow;
    	    }
    	    return escrow;
    }
    
    public static EscrowServiceArea escrowServiceAreaRemoveSpaces(EscrowServiceArea serviceArea) {
    	            if(serviceArea != null) {
    	       serviceArea.setCity(StringUtil.removeAllSpaces(serviceArea.getCity().toLowerCase()));
    	       serviceArea.setState(StringUtil.removeAllSpaces(serviceArea.getState().toUpperCase()));
    	       serviceArea.setCounty(StringUtil.removeExtraSpaces(serviceArea.getCounty().toUpperCase()));
               
    	       return serviceArea;
    	  }
    	            return serviceArea;
    }
    
    public static EscrowAgent escrowAgentRemoveSpaces(EscrowAgent escrowAgent) {
    	       
    	         if(escrowAgent != null) {
    		   escrowAgent.setLastName(StringUtil.removeAllSpaces(escrowAgent.getLastName().toUpperCase()));
    		   escrowAgent.setFirstName(StringUtil.removeAllSpaces(escrowAgent.getFirstName().toLowerCase()));
    		   escrowAgent.setEscrowSw(StringUtil.removeAllSpaces(escrowAgent.getEscrowSw().toUpperCase()));
    		   
    		   return escrowAgent;
    		   
    	   }
    	         return escrowAgent;
    		   
    }
    
}
