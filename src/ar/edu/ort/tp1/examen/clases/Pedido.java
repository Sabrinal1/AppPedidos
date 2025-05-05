package ar.edu.ort.tp1.examen.clases;

import java.util.ArrayList;

public class Pedido {

	// TODO TP1 cambiar tipo de atributo
	private ArrayList<DetallePedido> detalles;
	//TODO TP1
	private FormaDeEnvio formaDeEnvio;
	private int kmEnvio;

	public Pedido(FormaDeEnvio formaDeEnvio, int kmEnvio) {
		this.detalles = new ArrayList<>();
		this.formaDeEnvio = formaDeEnvio;
		this.kmEnvio = kmEnvio;
	}

	// TODO TP1, modificar
	public void agregarItem(Item item, int cantidad) {
		if (item != null) {
			DetallePedido detalle = buscarDetalle(item);
			if (detalle == null) {
				detalle = new DetallePedido(cantidad, item);
				detalles.add(detalle);
			} else {
				detalle.agregarCantidad(cantidad);
			}
			System.out.print("Se agregó la cantidad de " + cantidad + " del ítem: ");
			item.mostrar();
		}
	}

	// TODO TP1
	private DetallePedido buscarDetalle(Item item) {

		DetallePedido dp = null;
		int i = 0;
		while (i < detalles.size() && dp == null) {
			detalles.get(i).contieneItem(item);
			i++;
		}

		return dp;
	}

	// TODO TP1
	public void quitarItem(Item item, int cantidad) {
		DetallePedido dp = buscarDetalle(item);
		int cantidadSinSacar;
		if (dp != null) {
			cantidadSinSacar = dp.sacarCantidad(cantidad);
			System.out.println("Se sacaro " + (cantidad - cantidadSinSacar) + " elementos del ítem del pedido");
			if (dp.sinItems()) {
				detalles.remove(dp);
				System.out.print("Se sacó completamente el ítem del pedido - ");
				item.mostrar();
			}
		} else {
			System.out.println("No se logró quitar el ítem porque no estaba en el pedido");
		}
	}

	// TODO TP1 Cambiar
	public InfoVenta evaluar() {
		int peso = 0;
		float precio = 0;
		for (DetallePedido dp : detalles) {
			peso += dp.obtenerPeso();
			precio += dp.obtenerPrecio();
		}
		return new InfoVenta(precio, peso);
	}

	public float precioTotalConEnvio() {
		InfoVenta iv = evaluar();
		float precioEnvio = formaDeEnvio.calcularPrecio(kmEnvio, iv.getPeso());
		return iv.getPrecio() + precioEnvio;
	}
}