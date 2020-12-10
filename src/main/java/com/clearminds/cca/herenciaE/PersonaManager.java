package com.clearminds.cca.herenciaE;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.impl.ServicioPersonaArchivos;
import com.clearminds.impl.ServicioPersonaBDD;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;
import com.clearminds.test.Util;

public class PersonaManager {

	private ServicioPersona serv;
		
	public PersonaManager() throws InstanceException {
		super();
//		serv = new ServicioPersonaArchivos();
		
		String claseInstanciar = Util.leerPropiedad();
		
		try {
			Class<?> clase = Class.forName(claseInstanciar);
			serv = (ServicioPersona) clase.newInstance();
		
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} 

		
	}
	
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	
}
