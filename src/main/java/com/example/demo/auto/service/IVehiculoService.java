package com.example.demo.auto.service;

import com.example.demo.auto.modelo.Vehiculo;

public interface IVehiculoService {
	public Vehiculo buscar(String placa);
	public void insertar(Vehiculo vehiculo);
	public void borrar(String placa);
	public void actualizar(Vehiculo vehiculo);
}
