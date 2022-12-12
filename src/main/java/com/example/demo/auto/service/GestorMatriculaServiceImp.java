package com.example.demo.auto.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.auto.modelo.GestorMatricula;
import com.example.demo.auto.modelo.Propietario;
import com.example.demo.auto.modelo.Vehiculo;
import com.example.demo.auto.repository.IGestorMatriculaRepository;

@Service
public class GestorMatriculaServiceImp implements IGestorMatriculaService{

	@Autowired
	private IGestorMatriculaRepository iGestorMatriculaRepository;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IVehiculoService iVehiculoService;

	@Override
	public void matricula(Vehiculo vehiculo, Propietario propietario) {
		
		Vehiculo vehiculo1= this.iVehiculoService.buscar(vehiculo.getPlaca());
		if(vehiculo1.getTipo().equals("liviano")) {
			vehiculo1.setValorMatricula(vehiculo1.getPrecio().multiply(new BigDecimal(0.10)));
		}if(vehiculo1.getTipo().equals("pesado")) {
			vehiculo1.setValorMatricula(vehiculo1.getPrecio().multiply(new BigDecimal(0.15)));
		}
		
		GestorMatricula gestorMatricula=new GestorMatricula();
		gestorMatricula.setFecha(LocalDateTime.now());
		gestorMatricula.setNumero(1);
		gestorMatricula.setPropietario(propietario);
		gestorMatricula.setVehiculo(vehiculo1);
		
		this.iGestorMatriculaRepository.insertar(gestorMatricula);
		this.imprimir(gestorMatricula);
	}

	@Override
	public void imprimir(GestorMatricula matricula) {
		// TODO Auto-generated method stub
	
		System.out.println("matricula:"+matricula.getNumero()+"\n"+matricula.getVehiculo() );
	
	}

}
