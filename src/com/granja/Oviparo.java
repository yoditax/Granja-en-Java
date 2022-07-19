package com.granja;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Oviparo {
	int id;

	LocalDate nacimiento;
	LocalDate ingresoAGranja;
	BigDecimal precioCompra;
	BigDecimal precioVenta;

	public Oviparo(int id, LocalDate nacimiento, LocalDate ingresoAGranja, String precioCompra, String precioVenta) {
		this.id = id;
		this.nacimiento = nacimiento;
		this.ingresoAGranja = ingresoAGranja;
		this.precioCompra = new BigDecimal(precioCompra);
		this.precioVenta = new BigDecimal(precioVenta);
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

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return String.format(
				"Id - %d, Fecha nacimiento - %s, Ingreso a Granja - %s, Precio Venta - %s, Precio Compra - %s", id,
				nacimiento, ingresoAGranja, precioCompra, precioVenta);
	}

}
