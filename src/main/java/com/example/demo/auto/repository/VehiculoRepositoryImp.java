package com.example.demo.auto.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.auto.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImp implements IVehiculoRepository{

	private List<Vehiculo> baseVehiculo= new ArrayList<>();
	@Override
	public Vehiculo buscar(String placa) {
		
		Vehiculo vehiculo=new Vehiculo();
		for(Vehiculo v:baseVehiculo) {
			if(v.getPlaca().equals(placa)) {
				vehiculo=v;
				System.out.println("se a encontrado vehiculo");
			}
		}
		
		return  vehiculo;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("guardado en la base de datos");
		baseVehiculo.add(vehiculo);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("se a eliminado");
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("actualizado");
		
	}

}
