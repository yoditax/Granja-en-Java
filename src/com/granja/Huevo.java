package com.granja;

import java.time.LocalDate;

public class Huevo extends Cattle {
	String animal = "huevo";
	static int diasExpiracion = 21;

	public Huevo(int id, LocalDate nacimiento, LocalDate ingresoAGranja, String precioCompra, String precioVenta,
			String animal, int diasExpiracion) {
		super(id, nacimiento, ingresoAGranja, precioCompra, precioVenta, animal, diasExpiracion);

	}


}
