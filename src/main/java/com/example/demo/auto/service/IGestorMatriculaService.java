package com.example.demo.auto.service;

import com.example.demo.auto.modelo.GestorMatricula;
import com.example.demo.auto.modelo.Propietario;
import com.example.demo.auto.modelo.Vehiculo;

public interface IGestorMatriculaService {
	
	public void matricula(Vehiculo vehiculo,Propietario propietario);
	public void imprimir (GestorMatricula matricula);

}
