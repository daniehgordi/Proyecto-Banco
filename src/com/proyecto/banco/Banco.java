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
    private EstadoBanco estado =EstadoBanco.OPERATIVO;


    //Constructor
    public Banco(String nombreBanco) {
		super();
		this.nombreBanco = nombreBanco;
		this.gastosBanco = gastosBanco;
		this.saldoTotal = saldoTotal;
		
	}
    
    //GETTER AND SETTER
	public static String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	public static double getSaldoTotal() {
		return saldoTotal;
	}
	public static double getGastoBanco() {
		return gastosBanco;
	}
	public static String getCifBanco(){
		return CIF_BANCO;
	}


	
	//METODOS
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
	
	
	
}
	
	

	
		
	


	
	
	
	
