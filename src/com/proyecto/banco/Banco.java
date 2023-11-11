/**
 * Clase padre
 * -Clase hijos son actualmente dos productos: -CuentaSinComision() y CuentaConComision
 * Varriables: cif(static final, es compartido y constante), nombreBanco(Static, es compartido), saldoTotal (static es compartido)
 */
package com.proyecto.banco;

/**
 * @author Daniel Gordillo Guillén
 * @version 1.0
 *
 */
public class Banco {
    private static final String CIF_BANCO = "123456";
    private static String nombreBanco;
    private static double saldoTotal = 0d;
    private static double comisionesCobradas = 0d;
    private static double gastosBanco = 0d;
    private double cantidad;
    private EstadoBanco estado =EstadoBanco.OPERATIVO;


    //Constructor
    public Banco(String nombreBanco) {
		super();
		this.nombreBanco = nombreBanco;
		this.cantidad = cantidad;
		this.gastosBanco = gastosBanco;
	}
    
    //Getter and Setter
	public static String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	public static double getSaldoTotal() {
		return saldoTotal;
	}
	public static void setSaldoTotal(float saldoTotal) {
		Banco.saldoTotal = saldoTotal;
	}
	public static double getGastoBanco() {
		return gastosBanco;
	}
	public static String getCifBanco(){
		return CIF_BANCO;
		
	}
	
	
	/*
	 * Metodo agregar saldo: 
	 * Para añadir los saldos de todas las cuentas al saldo total del banco.
	 */
	public static void agregarSaldoBanco(double cantidad) {
			saldoTotal += cantidad;
    }
	
	/*
	 * Metodo decrementarSaldoBanco: 
	 * Para retirar los saldos de todas las cuentas al saldo total del banco.
	 */
	public static void decrementarSaldoBanco(double cantidad) {
			saldoTotal -= cantidad; 
    }
	
	/*
	 * Metodo decrementarSaldoBanco: 
	 * Para retirar los saldos de todas las cuentas al saldo total del banco.
	 */
	public static void realizarGastosBanco(double cantidad) {
			saldoTotal -= cantidad; 
    }

	/*
	 * Metodo decrementarSaldoBanco:
	 * Para establecerse las condiciones que se deben cumplir. 
	 */
//	public void validacionRealizarGastoBanco(double cantidad) {
//	    try {
//	    	// Comprobacion
//	        if (cantidad < 0) {
//	            throw new IllegalArgumentException("No puedes");
//	        }
//	        if(estado == EstadoCuenta.NUM_ROJOS) {
//	        	throw new IllegalArgumentException("Debe ingresar dinero, su saldo es negativo"+this.cantidad);
//	        }
//	        if(this.cantidad<cantidad) {
//	        	realizarRetirada(cantidad);
//	        	estado=EstadoCuenta.NUM_ROJOS;
//	        	throw new IllegalArgumentException("Usted esta en números rojos"+this.cantidad);	
//	        }
//	        	realizarRetirada(cantidad);
//	            throw new IllegalArgumentException("Aquí tiene su dinero. Su saldo actual: "+this.cantidad+".");
//	        
//	    } catch (IllegalArgumentException e) {
//	        // Acciones a realizar si la cantidad no es válida
//	        System.out.println("Advertencia: " + e.getMessage());
//	    }finally{
//	    	// Mensaje final
//	    	System.out.println("Su proceso de retirada ha finalizado.");
//	    	System.out.println("¿Quiere hacer otra operacion?");
//	    }
	
	
	
}
	
	

	
		
	


	
	
	
	
