package com.reflexion;

import java.util.ArrayList;

public class EjemploReflexion {

	public static void main(String[] args) {
		
		if(createObject("java.util.ArrayList") instanceof ArrayList) {
			@SuppressWarnings("unchecked")
			ArrayList<String> r = (ArrayList<String>) createObject("java.util.ArrayList");
			r.add("pepe");
			System.out.println(r.toString());
		}
	}
		
	static Object createObject(String className) {
		Object object = null;
		try {
			Class<?> classDefinition = Class.forName(className);
			object = classDefinition.newInstance();
			
		} catch (InstantiationException e){
			System.out.println(e);
		} catch(IllegalAccessException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return object;
		}
	

}
