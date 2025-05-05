package ar.edu.ort.tp1.examen.clases;

/**
 * TODO TP1
 *
 */
public class DetallePedido implements Enviable {

	private int cantidad;
	private Item item;

	public DetallePedido(int cantidad, Item item) {
		super();
		this.cantidad = cantidad;
		this.item = item;
	}

	public boolean contieneItem(Item item) {
		return this.item.mismoItem(item);
	}

	public void agregarCantidad(int cantidad) {
		this.cantidad += cantidad;
	}

	public int sacarCantidad(int cantidad) {

		int faltoSacar = 0;
		if (cantidad > 0) {
			if (this.cantidad >= cantidad) {
				this.cantidad = this.cantidad - cantidad;
			} else {
				faltoSacar = cantidad - this.cantidad;
				this.cantidad = 0;
			}
		}
		return faltoSacar;
	}

	@Override
	public int obtenerPeso() {

		return this.cantidad * this.item.obtenerPeso();
	}

	@Override
	public float obtenerPrecio() {

		return this.cantidad * this.item.obtenerPrecio();
	}

	public boolean sinItems() {
		return this.cantidad == 0;
	}
	
	

}
