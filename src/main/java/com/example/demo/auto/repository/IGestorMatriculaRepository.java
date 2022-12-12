package com.example.demo.auto.repository;

import com.example.demo.auto.modelo.GestorMatricula;
import com.example.demo.auto.modelo.Propietario;

public interface IGestorMatriculaRepository {
	
	public GestorMatricula buscar(Integer id);
	public void insertar(GestorMatricula gestion);
	public void borrar(Integer id);
	public void actualizar(GestorMatricula gestion);
}
