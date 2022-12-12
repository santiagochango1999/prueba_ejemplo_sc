package com.example.demo.auto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.auto.modelo.Propietario;
import com.example.demo.auto.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImp implements IPropietarioService{

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public Propietario buscar(String nombre) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscar(nombre);
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public void borrar(String nombre) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.borrar(nombre);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(propietario);
	}

}
