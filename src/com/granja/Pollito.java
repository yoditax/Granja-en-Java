package com.granja;

import java.time.LocalDate;

public class Pollito extends Cattle {
	String animal = "pollito";
	public static int diasExpiracion = 2000;

	public Pollito(int id, LocalDate nacimiento, LocalDate ingresoAGranja, String precioCompra, String precioVenta,
			String animal, int diasExpiracion) {
		super(id, nacimiento, ingresoAGranja, precioCompra, precioVenta, animal, diasExpiracion);
	}


}
