/*
 * Realizamos una clase principal:
 * Probamos que funcionen las clases
 * 
 */
package com.proyecto.banco;

/**
 * @author Daniel Gordillo Guillén
 * @version 1.0
 */
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("*******COMIENZO********");
		Banco banco1 = new Banco("Santander");
		System.out.println(banco1.getCifBanco());
		System.out.println(banco1.getNombreBanco());

		System.out.println("***************");
		CuentaSinComision cuenta1 = new CuentaSinComision("Daniel");
		cuenta1.validacionIngresar(2500);
		
		System.out.println("***************");
		cuenta1.validacionRetirar(2510);
		System.out.println(cuenta1.getEstado());
		
		System.out.println("***************");
		cuenta1.validacionRetirar(990);
		System.out.println(cuenta1.getEstado());
				
		
		System.out.println("***************");
		cuenta1.validacionIngresar(2500);
		System.out.println(cuenta1.getEstado());
	
		
		
		
		
		
		
	}

}
