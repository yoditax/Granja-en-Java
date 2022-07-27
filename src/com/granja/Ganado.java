package com.granja;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ganado {
	LocalDate now = LocalDate.now();
	private int id;
	private int edadEnDiasAlIngresar;
	private LocalDate nacimiento;
	private LocalDate ingresoAGranja;
	private String animal;
	// private int edadActual;
	// private BigDecimal precioCompra = Precios.getPrecioCompraByAnimal(animal);
	// private BigDecimal precioVenta = Precios.getPrecioVentaByAnimal(animal);
	// private BigDecimal precioCompra;
	// private BigDecimal precioVenta;
	private int diasExpiracion;
	private int edadActual;

	public Ganado(int id, int edadEnDiasAlIngresar, LocalDate fechaIngresoAGranja) {
		this.id = id;
		this.edadEnDiasAlIngresar = edadEnDiasAlIngresar;
		this.nacimiento = now.minusDays(edadEnDiasAlIngresar);
		this.ingresoAGranja = fechaIngresoAGranja;

		// this.precioCompra = new BigDecimal(precioCompra);
		// this.precioVenta = new BigDecimal(precioVenta);
		// this.animal = animal;
		// this.diasExpiracion = Expiracion.getCantDiasByAnimal(animal);
		// this.precioVenta = Precios.getPrecioVentaByAnimal(animal);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public LocalDate getIngresoAGranja() {
		return ingresoAGranja;
	}

	public void setIngresoAGranja(LocalDate ingresoAGranja) {
		this.ingresoAGranja = ingresoAGranja;
	}

	// public BigDecimal getPrecioCompra() {
	// return precioCompra;
	// }

	public static void setPrecioCompra(String precioCompra) {
		precioCompra = precioCompra;
	}

	// public BigDecimal getPrecioVenta() {
	// return getPrecioVentaByAnimal(this.animal);
	// return precioVenta;
	// }

	public void setPrecioVenta(BigDecimal precioVenta) {
		precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return String.format(
				"Id - %d, Fecha nacimiento - %s, Ingreso a Granja - %s, \n ",
				id, nacimiento, ingresoAGranja);
		// , precioCompra, precioVenta);
	}

	public long getDiasExpiracion() {
		// TODO Auto-generated method stub
		return this.diasExpiracion;
	}

}
