package com.granja;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Granja {


	private BigDecimal dineroEnCaja;
	int cantMaxPollitos;
	int cantMaxHuevos;
	private LinkedList<Huevo> huevos = new LinkedList<Huevo>();
	private LinkedList<Pollito> pollitos = new LinkedList<>();
	private HashMap<EnumGanado, Precio> precios = new HashMap<>();
	private LocalDate now = LocalDate.now();

	public Granja(String dineroEnCaja, int cantMaxPollitos, int cantMaxHuevos) {
		super();
		this.dineroEnCaja = new BigDecimal(dineroEnCaja);
		this.cantMaxHuevos = cantMaxHuevos;
		this.cantMaxPollitos = cantMaxPollitos;
	}

	public void addPollito(Pollito pollito) {
		this.pollitos.add(pollito);
	}

	public void addPrecio(EnumGanado animal, Precio precio) {
		this.precios.put(animal, precio);
	}
	
	public Precio getPrecioByAnimal(EnumGanado animal) {
		return this.precios.get(animal);
	}

	public void addHuevo(Huevo huevo) {
		this.huevos.add(huevo);
	}

	public void venderPollito(int cant) {
		if (pollitos.size() > cant) {
			System.out.println("Voy a Comprar pollis");
		}
	}

	public void comprarPollito() {}

	public void venderHuevos() {

	}

	public void comprarHuevos(int cant) {
		// if(dineroEnCaja>(Precios.getPrecioCompraByAnimal("huevos")*cant)) {

		// }
	}

	public void mostrarEstado() {
		System.out.println("La caja es de " + this.dineroEnCaja + " pesos");
		mostrarStock();
		mostrarCapacidad();
		mostrarPrecios();
		System.out.println("DETALLE DE HUEVOS: " + huevos);
		System.out.println("DETALLE DE POLLITOS: " + pollitos);
	}

	private void mostrarPrecios() {
		System.out.println("PRECIOS: ");
		// System.out.printf("Los huevos se venden a %s y se compran a %s \n",
		// Precios.getPrecioVentaByAnimal("huevo"),
		// Precios.getPrecioCompraByAnimal("huevo"));
		// System.out.printf("Los pollos se venden a %s y se compran a %s \n",
		// Precios.getPrecioVentaByAnimal("pollito"),
		// Precios.getPrecioCompraByAnimal("pollito"));
		System.out.printf("Hay %d precios guardados\n", precios.size());
		System.out.println(precios);

	}

	private void mostrarCapacidad() {
		System.out.println("CAPACIDAD: ");
		System.out.println("La mayor cantidad de huevos que puede haber es de: " + cantMaxHuevos);
		System.out.println("La mayor cantidad de pollitos que puede haber es de: " + cantMaxPollitos);

	}

	private void mostrarStock() {
		System.out.println("STOCK: ");
		System.out.println("La cantidad de huevos: " + huevos.size());
		System.out.println("La cantidad de pollitos: " + pollitos.size());
	}

	public static void ofrecerMenu() {
		System.out.println("\n\tIngrese una opcion del menu: ");
		System.out.println("1. Mostrar estado de la granja");
		System.out.println("2. Comprar huevos");
		System.out.println("3. Vender huevos");
		System.out.println("4. Comprar pollitos");
		System.out.println("5. Vender pollitos");
		System.out.println("6. Salir \n");
	}

	Iterator<Huevo> iterator = huevos.iterator();

	public void eliminarExpirados() {
		while (iterator.hasNext()) {
			if (now.isAfter((iterator.next().nacimiento.plusDays(iterator.next().getDiasExpiracion())))) {
				iterator.remove();
			}
		}
	}

	public BigDecimal getDineroEnCaja() {
		return dineroEnCaja;
	}

	public void setDineroEnCaja(BigDecimal dineroEnCaja) {
		this.dineroEnCaja = dineroEnCaja;
	}

	public int getCantMaxPollitos() {
		return cantMaxPollitos;
	}

	public void setCantMaxPollitos(int cantMaxPollitos) {
		this.cantMaxPollitos = cantMaxPollitos;
	}

	public int getCantMaxHuevos() {
		return cantMaxHuevos;
	}

	public void setCantMaxHuevos(int cantMaxHuevos) {
		this.cantMaxHuevos = cantMaxHuevos;
	}

	public LinkedList<Huevo> getHuevos() {
		return huevos;
	}

	public void setHuevos(LinkedList<Huevo> huevos) {
		this.huevos = huevos;
	}

	public LinkedList<Pollito> getPollitos() {
		return pollitos;
	}

	public void setPollitos(LinkedList<Pollito> pollitos) {
		this.pollitos = pollitos;
	}


	public HashMap<EnumGanado, Precio> getPrecios() {
		return precios;
	}

	public void setPrecios(HashMap<EnumGanado, Precio> precios) {
		this.precios = precios;
	}

	@Override
	public String toString() {
		return String.format("Huevos %s - CantHuevos %d - Pollitos %s - CantPollitos %d - DineroEnCaja %s - Precios %s",
				huevos, huevos.size(), pollitos, pollitos.size(), dineroEnCaja, precios);
	}

}
