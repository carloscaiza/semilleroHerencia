package com.clearminds.cca.herenciaE;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.impl.ServicioPersonaArchivos;
import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;
		
	public PersonaManager() throws InstanceException {
		super();
//		serv = new ServicioPersonaArchivos();
		try {
			Class<?> clase = Class.forName("com.clearminds.impl.ServicioPersonaBDD");
			serv = (ServicioPersona) clase.newInstance();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		
	}
	
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	
}
