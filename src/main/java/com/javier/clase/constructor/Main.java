package com.javier.clase.constructor;

public class Main {

	public static void main(String []arg){
		
		Empleado empleado = new Empleado();
		empleado.setAge(50);
		empleado.setName("Luis");
		System.out.println("El empleado "+ empleado.getName() + " Age :"+empleado.getAge());
		
		
		Empleado empleado_1 = new Empleado("Javier");
		System.out.println("Name of employee ::: " + empleado_1.getName());
		
		Empleado empleado_2 = new Empleado("Javier","Calizaya");
		System.out.println("Datos de empleado :" + empleado_2.getName() + "  apellido :: " + empleado_2.getLastName());
	
	
	
		empleado = new Empleado("Alejo","Toro",40);
		System.out.println("datos :: "+ empleado.getName());
	}
	
}
