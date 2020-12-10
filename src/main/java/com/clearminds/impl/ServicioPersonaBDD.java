package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona {

	public boolean insertar(Persona p) {
		
		System.out.println("insertando persona en un archivo: " + p);
		
		return true;
	}

	public boolean actualizar(Persona p) {
		
		System.out.println("actualizando persona en un archivo: " + p);
		
		return true;
	}

	public boolean eliminar(Persona p) {
		
		System.out.println("eliminando persona en un archivo: " + p);
		
		return true;
	}

}
