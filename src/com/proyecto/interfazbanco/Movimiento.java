/**
 * INTERFAZ
 */
package com.proyecto.interfazbanco;
/**
 * @author Daniel Gordillo Guillén
 * @version 1.0
 */
public interface Movimiento {

	void realizarIngreso(double cantidad);
	void realizarRetirada(double cantidad);
	void validacionIngresar(double cantidad);
	void validacionRetirar(double cantidad);
	void cambiarEstado(double saldoCuenta);
	
	
}
