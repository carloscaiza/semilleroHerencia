package com.clearminds.test;

import com.clearminds.cca.herenciaE.PersonaManager;
import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		
		PersonaManager pm;
		try {
			pm = new PersonaManager();
			pm.insertarPersona(new Persona("CLEAR", "MINDS","172838398"));
		} catch (InstanceException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
