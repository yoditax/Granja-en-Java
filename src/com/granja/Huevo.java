package com.granja;

import java.time.LocalDate;

public class Huevo extends Cattle {
	String animal = "huevo";
	static int diasExpiracion = 21;
	public LocalDate nacimiento;


	public Huevo(int id, int edadEnDias, LocalDate ingresoAGranja) {
		super(id, edadEnDias, ingresoAGranja);
		this.nacimiento = now.minusDays(edadEnDias);
		// this.precioVenta = Precios.getPrecioVentaByAnimal(animal); Me pide que ponga
		// el precio como Static

	}



	// public static void setDiasExpiracion(int diasExpiracion) {
	//		Huevo.diasExpiracion = diasExpiracion;
	//	}

	@Override
	public LocalDate getNacimiento() {
		return nacimiento;
	}

	@Override
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return (super.toString() + " " + animal + " Expira el " + nacimiento.plusDays(diasExpiracion) + ".");
	}



}
