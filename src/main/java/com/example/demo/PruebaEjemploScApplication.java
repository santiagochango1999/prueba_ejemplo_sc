package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.auto.modelo.Vehiculo;
import com.example.demo.auto.modelo.VehiculoLiviano;
import com.example.demo.auto.repository.IGestorMatriculaRepository;
import com.example.demo.auto.service.IGestorMatriculaService;
import com.example.demo.auto.service.IPropietarioService;
import com.example.demo.auto.service.IVehiculoService;

@SpringBootApplication
public class PruebaEjemploScApplication implements CommandLineRunner{

	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IGestorMatriculaService iGestorMatriculaService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaEjemploScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		VehiculoLiviano vehiculo =new VehiculoLiviano();
		vehiculo.setMarca("toyota");
		vehiculo.setModelo("v");
		vehiculo.setPlaca("pepe");
		vehiculo.setPrecio(new BigDecimal(200));
		vehiculo.setPropietario(null);
		vehiculo.setTipo("liviano");
		vehiculo.setCilindrajeTurbo(12);
		
		this.iVehiculoService.insertar(vehiculo);
		
		this.iGestorMatriculaService.matricula(vehiculo, null);
		
	}

}
