package edu.itli.talleres.vehiculos.poo;

public class vehiculos {
private String marca;
private String placa;
private String tipo;
/**
 * Constructor que permite crear un objeto vehiculo
 * @param marca
 * @param placa
 * @param tipo
 */
public vehiculos(String marca, String placa, String tipo) {
	super();
	this.marca = marca;
	this.placa = placa;
	this.tipo = tipo;
	}
public void imprimirDatos() {
	System.out.println("marca"+marca);
	System.out.println("placa"+placa);
	System.out.println("tipo"+tipo);
}
/**
 * @return the marca
 */
public String getMarca() {
	return marca;
}
/**
 * @param marca the marca to set
 */
public void setMarca(String marca) {
	this.marca = marca;
}
/**
 * @return the placa
 */
public String getPlaca() {
	return placa;
}
/**
 * @param placa the placa to set
 */
public void setPlaca(String placa) {
	this.placa = placa;
}
/**
 * @return the tipo
 */
public String getTipo() {
	return tipo;
}
/**
 * @param tipo the tipo to set
 */
public void setTipo(String tipo) {
	this.tipo = tipo;
}

	
	
}
