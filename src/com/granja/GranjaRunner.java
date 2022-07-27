package com.granja;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class GranjaRunner {


	public static void main(String[] args) {
		Granja granja = new Granja("0", 0, 0);
		LocalDate now = LocalDate.now();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese dinero que hay en la caja de la granja: ");
		String dineroEnCaja = scanner.next();
		granja.setDineroEnCaja(new BigDecimal(dineroEnCaja));

		System.out.println("Cantidad maxima de pollitos que puede tener: ");
		int cantMaxPollitos = scanner.nextInt();
		granja.setCantMaxPollitos(cantMaxPollitos);
		System.out.println("Indique Precio de compra de Pollitos: ");
		BigDecimal precioCompraP = scanner.nextBigDecimal();
		System.out.println("Indique Precio de Venta de Pollitos: ");
		BigDecimal precioVentaP = scanner.nextBigDecimal();
		// granja.addPrecio(new Precios(1, "pollito", "100.5", "300"));
		System.out.println(granja);

		granja.addPollito(new Pollito(1, 15, now));
		granja.addPollito(new Pollito(2, 25, now));

		System.out.println(granja);

		System.out.println("Cantidad maxima de huevos que puede tener: ");
		int cantMaxHuevos = scanner.nextInt();
		granja.setCantMaxHuevos(cantMaxHuevos);
		System.out.println("Indique Precio de compra de Huevos: ");
		BigDecimal precioCompraH = scanner.nextBigDecimal();
		System.out.println("Indique Precio de Venta de Huevos: ");
		BigDecimal precioVentaH = scanner.nextBigDecimal();

//		granja.addPrecio(new Precio(1, EnumGanado.HUEVO.toString(), precioCompraP, precioVentaP));
//		granja.addPrecio(new Precio(2, "huevo", precioCompraH, precioVentaH));

		granja.addPrecio(EnumGanado.POLLITO, new Precio(precioCompraP, precioVentaP));
		granja.addPrecio(EnumGanado.HUEVO, new Precio(precioCompraH, precioVentaH));

		System.out.println(granja.getPrecios().get(EnumGanado.POLLITO));
		System.out.println(granja.getPrecioByAnimal(EnumGanado.HUEVO));

		granja.addHuevo(new Huevo(1, 10, now));

		System.out.println(granja);

		int opcion = 0;
		while(opcion!=6) {
			granja.ofrecerMenu();
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1: 
			{
				granja.mostrarEstado();
				break;
			}

			case 2:
			{
				System.out.println("Cuantos huevos quiere comprar? ");
				int cant = scanner.nextInt();
				granja.comprarHuevos(cant);
				break;
			}

			case 3: 
			{
				System.out.println("Vender huevos");
				break;
			}

			case 4: 
			{
				System.out.println("Comprar pollitos");
				break;
			}
			case 5: 
			{
				System.out.println("Vender pollitos");
				break;
			}
			}
		}
		System.out.println("Gracias por visitar nuestra granja!!!");
		scanner.close();
	}
}