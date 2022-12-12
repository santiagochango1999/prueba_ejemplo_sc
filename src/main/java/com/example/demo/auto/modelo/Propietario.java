package com.example.demo.auto.modelo;

public class Propietario {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	
	

	
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellidos=" + apellido + ", edad=" + edad + "]";
	}
	
	//METODOS GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellido;
	}
	public void setApellidos(String apellidos) {
		this.apellido = apellidos;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
