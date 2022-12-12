package com.example.demo.auto.service;

import com.example.demo.auto.modelo.Propietario;

public interface IPropietarioService {
	public Propietario buscar(String nombre);
	public void insertar(Propietario propietario);
	public void borrar(String nombre);
	public void actualizar(Propietario propietario);
}
