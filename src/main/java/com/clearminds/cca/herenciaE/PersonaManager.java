package com.clearminds.cca.herenciaE;

import com.clearminds.impl.ServicioPersonaArchivos;
import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() {
		super();
		serv = new ServicioPersonaArchivos();
	}
	
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	
}
