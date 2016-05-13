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
    
    private void log4j(String log){
		lgr.debug("Ini adalah debug  : " + log);
        lgr.fatal("Ini adalah fatal  : " + log);
		lgr.warn("Ini adalah warn  : " + log);
		lgr.error("Ini adalah error : " + log);
 
	}
	
	public static void main(String[] args) {
 
		loggerfourj logger4j = new loggerfourj();
		logger4j.log4j("Contoh Log4J");
 
	}
    
}
