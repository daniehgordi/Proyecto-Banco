package com.proyecto.interfazbanco;

public interface Movimiento {

	void realizarIngreso(double cantidad);
	void realizarRetirada(double cantidad);
	void validacionIngresar(double cantidad);
	void validacionRetirar(double cantidad);
	void cambiarEstado(double saldoCuenta);
	
}
	//Implementar la funcion prestamo en el futuro
