package com.example.demo.auto.modelo;

import java.math.BigDecimal;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String tipo;
	private Propietario propietario;
	private BigDecimal precio;
	private BigDecimal valorMatricula;
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", tipo=" + tipo
				+ ", propietario=" + propietario + ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}
	//Metodos GET Y SET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	
	
	
}
