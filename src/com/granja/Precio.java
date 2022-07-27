package com.granja;

import java.math.BigDecimal;

public class Precio {
//	private int id;
//	private EnumGanado animal;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;

	public Precio(BigDecimal precioCompra, BigDecimal precioVenta) {
		super();
//		this.id = id;
//		this.animal = animal;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}

//	public int getId() {
//		return id;
//	}

//	public int getIdByAnimal(String animal) {
//		return id;
//	}

//	public void setId(int id) {
//		this.id = id;
//	}

//	public EnumGanado getAnimal() {
//		return animal;
//	}
//
//	public void setAnimal(EnumGanado animal) {
//		this.animal = animal;
//	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	// public static BigDecimal getPrecioCompraByAnimal(String animal) {
	// return precioCompra;
	// }

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	//	public void setPrecioCompraByAnimal(String animal, BigDecimal precioCompra) {
	// this.precioCompra = precioCompra;
	// }

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public BigDecimal getPrecioVentaByAnimal(String animal) {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	//	public void setPrecioVentaByAnimal(String animal, BigDecimal precioVenta) {
	// this.precioVenta = precioVenta;
	// }

	@Override
	public String toString() {
//		return String.format("Id - %d, Animal - %s,  Precio Venta - %s, Precio Compra - %s", id, animal, precioVenta,
//				precioCompra);
		return String.format("Precio Venta - %s, Precio Compra - %s", precioVenta,
				precioCompra);
	}

}
