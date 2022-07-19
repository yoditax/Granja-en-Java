package com.granja;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class GranjaRunner {


	public static void main(String[] args) {
		Granja granja = new Granja("0", 0, 0);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese dinero que hay en la caja de la granja: ");
		String dineroEnCaja = scanner.next();

		System.out.println("Cantidad maxima de pollitos que puede tener: ");
		int cantMaxPollitos = scanner.nextInt();

		System.out.println("Cantidad maxima de huevos que puede tener: ");
		int cantMaxHuevos = scanner.nextInt();

		granja.setDineroEnCaja(new BigDecimal(dineroEnCaja));
		granja.setCantMaxPollitos(cantMaxPollitos);
		granja.setCantMaxHuevos(cantMaxHuevos);
		LocalDate now = LocalDate.now();
		granja.addPollito(new Pollito(153, now, now, "0", "0"));
		granja.addHuevo(new Huevo(205, now, now, "0", "0"));

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


