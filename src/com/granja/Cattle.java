package com.granja;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cattle {
	private int id;

	private LocalDate nacimiento;
	private LocalDate ingresoAGranja;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private String animal;

	private int diasExpiracion;

	public Cattle(int id, LocalDate nacimiento, LocalDate ingresoAGranja, String precioCompra, String precioVenta,
			String animal, int diasExpiracion) {
		this.id = id;
		this.nacimiento = nacimiento;
		this.ingresoAGranja = ingresoAGranja;
		this.precioCompra = new BigDecimal(precioCompra);
		this.precioVenta = new BigDecimal(precioVenta);
		// this.animal = animal;
		// this.diasExpiracion = Expiracion.getCantDiasByAnimal(animal);
		// this.precioVenta=Precios.getPrecioVentaByAnimal(animal);
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

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public static void setPrecioCompra(String precioCompra) {
		precioCompra = precioCompra;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return String.format(
				"Id - %d, Fecha nacimiento - %s, Ingreso a Granja - %s, PrecioCompra - %s, PrecioVenta - %s", id,
				nacimiento, ingresoAGranja, precioCompra, precioVenta);
	}

}
