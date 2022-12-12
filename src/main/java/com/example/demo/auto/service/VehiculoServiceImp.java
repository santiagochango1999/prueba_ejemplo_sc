package com.example.demo.auto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.auto.modelo.Vehiculo;
import com.example.demo.auto.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImp implements IVehiculoService{

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		
		return this.iVehiculoRepository.buscar(placa);
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.borrar(placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(vehiculo);
	}

}
