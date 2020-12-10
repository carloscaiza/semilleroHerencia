package com.clearminds.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Util {
	
	public static String leerPropiedad(){
		
		String clase = "clase";
		Properties p = new Properties();
		String propiedad = null;
		
		try {
			
			p.load(new FileReader("D:\\CapacitacionCMC\\Repositorios\\semilleroHerencia\\config.properties"));
			
			propiedad = p.getProperty(clase);
									
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
			return null;
		} catch (IOException e) {			
			e.printStackTrace();
			return null;
		}
		return propiedad;
	}

}
