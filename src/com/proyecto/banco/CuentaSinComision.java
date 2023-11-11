/**
 * CUENTA CORRIENTE SIN COMISION
 * 
 * Hereda de Banco y implementa la interfaz Movimiento
 * 
 * Variables:id, nombretitular, saldoCuenta, estado de la cuenta
 * 
 * Es una cuenta que no tiene comisiones de retirada ni de se 
 * le aplican comisiones por saldo negativo. 
 * Con un tope máximo negativo de unos 1000€.
 */
package com.proyecto.banco;

import com.proyecto.interfazbanco.Movimiento;
/**
 * @author Daniel Gordillo Guillén
 * @version 1.0
 */
public class CuentaSinComision extends Banco implements Movimiento{
	    //Declaramos variables
		private int id;
	    private String nombreTitular;
	    private double saldoCuenta = 0d; 
		private double maxCuentaNegativo = 1000d;
		private EstadoCuenta estado =EstadoCuenta.OPERATIVA;

	    
	    //Constructor
		public CuentaSinComision(String nombreTitular) {
			super(getNombreBanco());
			this.nombreTitular = nombreTitular;
			this.id = ++id;
			this.saldoCuenta = saldoCuenta;
			this.maxCuentaNegativo = maxCuentaNegativo;
			this.estado = estado;
		}
		
		//Getter and Setter
		public String getNombreTitular() {
			System.out.println("El nombre del titular es: ");
			return nombreTitular;
		}
		public void setNombreTitular(String nombreTitular) {
			System.out.println("El cambio de titular se ha realizado correctamente.");
			this.nombreTitular = nombreTitular;
		}
		public int getId() {
			System.out.println("Su id es: ");
			return id;
		}
		public double getSaldoCuenta() {
			System.out.println("El saldo de su cuenta es: ");
			return saldoCuenta;
		}
		public void setSaldoCuenta(double saldoCuenta) {
			this.saldoCuenta = saldoCuenta;
		}
		public double getMaxCuentaNegativo() {
			System.out.println("El saldo máximo negativo disponible es: ");
			return maxCuentaNegativo;
		}
		public void setMaxCuentaNegativo(double saldoCuenta) {
			System.out.println("Ha cambiado el máximo de la cuenta en negativo.");
			this.maxCuentaNegativo = maxCuentaNegativo;
		}
		public EstadoCuenta getEstado() {
			return estado;
		}
		
		/*
		 * Desarrollamos los metodos de la interfaz:
		 * En este caso tenemos en cuenta que es una cuenta en la que no se añade comision tanto al ingresar como al retirar.
		 * -validacionIngresar()
		 * -validacionRetirar()
		 * -ingresarValidacion()
		 * -retirarValidacion()
		 */
	

		//realizarIngreso(): agrega el saldo a cuenta y al saldo del banco
		@Override
		public void realizarIngreso(double cantidad) {
	        this.saldoCuenta += cantidad;
	        agregarSaldoBanco(cantidad);
	    }
		
		//realizarRetirada(): retira el saldo a cuenta y del saldo del banco
		@Override
	    public void realizarRetirada(double cantidad) {
			this.saldoCuenta -= cantidad;
	        decrementarSaldoBanco(cantidad);
	    }
		
		//cambiarEstado(): cambiar el estado dependiendo del saldoCuenta
		@Override
		public void cambiarEstado(double saldoCuenta) {
			if(this.saldoCuenta >0) {
				estado= EstadoCuenta.OPERATIVA;
			}else {
				estado= EstadoCuenta.NUM_ROJOS;
			}
		
		}
		
		/*
		 * Metodo validacionIngresar():
		 * -Que el numero introducido no sea negativo
		 * Cambia el estado de numeros rojos a operativo
		 */
		@Override
		public void validacionIngresar(double cantidad) {
		    try {
		    	// Condiciones
		        if (cantidad < 0) {
		            throw new IllegalArgumentException("Inserte una cantidad positiva.");
		        }
		        realizarIngreso(cantidad);
		        cambiarEstado(this.saldoCuenta);
	            throw new IllegalArgumentException("Su saldo actual: "+this.saldoCuenta+"€.");
		        
		    } catch (IllegalArgumentException e) {
		        // Acciones a realizar si la cantidad no es válida
		        System.out.println("Advertencia: " + e.getMessage());
		    	// Mensaje final
		    }finally{
		    	System.out.println("Su proceso de ingreso ha sido finalizado."); 
		    }
		}
		
		/*
		 * Metodo validacionRetirar() este metodo comprueba:
		 * -Que el numero introducido no sea negativo
		 * -Que la cantidad a retirar no supere los -1000
		 */
		@Override
		public void validacionRetirar(double cantidad) {
		    try {
		    	// Condiciones
		        if (cantidad < 0) {
		            throw new IllegalArgumentException("Inserte una cantidad positiva.");
		        }
		        if(this.saldoCuenta<0 && this.saldoCuenta > -maxCuentaNegativo && cantidad > (this.maxCuentaNegativo + this.saldoCuenta)) {
		        	double cantidadMax= this.maxCuentaNegativo+this.saldoCuenta;
		        	throw new IllegalArgumentException("La cantidad maxima que puede retirar es: "+cantidadMax);
		        }
		        if(this.saldoCuenta>0 && cantidad > (this.maxCuentaNegativo + this.saldoCuenta)) {
		        	double cantidadMax= this.maxCuentaNegativo-this.saldoCuenta;
		        	throw new IllegalArgumentException("La cantidad maxima que puede retirar es: "+cantidadMax);
		        }
	        	realizarRetirada(cantidad);
	        	cambiarEstado(this.saldoCuenta);
	            throw new IllegalArgumentException("Ha realizado una retirada de: "+cantidad+"€. Su saldo es de: "+this.saldoCuenta);
	        
		    } catch (IllegalArgumentException e) {
		        // Acciones a realizar si la cantidad no es válida
		        System.out.println("Advertencia: " + e.getMessage());
		    }finally{
		    	// Mensaje final
		    	System.out.println("Su proceso de retirada ha finalizado.");
		    }
		}
		
		
}
		