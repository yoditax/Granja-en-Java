package com.granja;

import java.time.LocalDate;

public class Pollito extends Cattle {
	static String animal = "pollito";
	public static int diasExpiracion = 2000;

	public LocalDate nacimiento;

	public Pollito(int id, int edadEnDias, LocalDate ingresoAGranja) {
		super(id, edadEnDias, ingresoAGranja);
		this.nacimiento = now.minusDays(edadEnDias);

		// this.animal = animal;
		// this.diasExpiracion = diasExpiracion;



	}

	@Override
	public String toString() {
		return (super.toString() + " " + animal + " Expira el " + nacimiento.plusDays(diasExpiracion) + ".");
	}

}
