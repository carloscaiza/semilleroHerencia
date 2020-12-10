package com.clearminds.test;

import com.clearminds.cca.herenciaE.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		
		PersonaManager pm = new PersonaManager();
		
		pm.insertarPersona(new Persona("Carlos", "CAIZA","172838398"));
		
	}
}
