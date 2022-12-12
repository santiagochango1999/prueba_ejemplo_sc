package com.example.demo.auto.repository;

import com.example.demo.auto.modelo.Propietario;

public interface IPropietarioRepository {
	
	public Propietario buscar(String nombre);
	public void insertar(Propietario propietario);
	public void borrar(String nombre);
	public void actualizar(Propietario propietario);
}
