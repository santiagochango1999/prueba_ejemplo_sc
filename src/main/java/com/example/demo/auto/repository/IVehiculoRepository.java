package com.example.demo.auto.repository;

import com.example.demo.auto.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public Vehiculo buscar(String placa);
	public void insertar(Vehiculo vehiculo);
	public void borrar(String placa);
	public void actualizar(Vehiculo vehiculo);

}
