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
		String precioCompraP = scanner.next();
		System.out.println("Indique Precio de Venta de Pollitos: ");
		String precioVentaP = scanner.next();
		granja.addPrecio(new Precios(1, "pollito", precioCompraP, precioVentaP));
		System.out.println(granja);


		granja.addPollito(new Pollito(1, now, now, precioCompraP, precioVentaP, "pollito", Pollito.diasExpiracion));
		granja.addPollito(new Pollito(2, now, now, precioCompraP, precioVentaP, "pollito", Pollito.diasExpiracion));


		System.out.println("Cantidad maxima de huevos que puede tener: ");
		int cantMaxHuevos = scanner.nextInt();
		granja.setCantMaxHuevos(cantMaxHuevos);
		System.out.println("Indique Precio de compra de Huevos: ");
		String precioCompraH = scanner.next();
		System.out.println("Indique Precio de Venta de Huevos: ");
		String precioVentaH = scanner.next();

		granja.addPrecio(new Precios(2, "huevo", precioCompraH, precioVentaH));


		granja.addHuevo(new Huevo(1, now, now, precioCompraH, precioVentaH, "huevo", Huevo.diasExpiracion));


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
				System.out.println("Quiero comprar huevos");
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
	}



}


