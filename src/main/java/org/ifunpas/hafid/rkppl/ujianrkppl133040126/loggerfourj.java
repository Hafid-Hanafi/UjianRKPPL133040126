/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.hafid.rkppl.ujianrkppl133040126;

import org.apache.log4j.Logger;

/**
 *
 * @author SB604-03
 */
public class loggerfourj {
    
    final static Logger lgr = Logger.getLogger(loggerfourj.class);
    
    private void log4j(String param){
		lgr.debug("Ini adalah debug  : " + param);
        lgr.fatal("Ini adalah fatal  : " + param);
		lgr.warn("Ini adalah warn  : " + param);
		lgr.error("Ini adalah error : " + param);
 
	}
	
	public static void main(String[] args) {
 
		loggerfourj obj = new loggerfourj();
		obj.log4j("Contoh Log4J");
 
	}
    
}
