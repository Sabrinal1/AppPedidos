package ar.edu.ort.tp1.examen.clases;

//TODO TP1 interfaces
public abstract class Item implements Enviable, Mostrable {

	private String nombre;
	// TODO TP1
	private int id;

	// TODO TP1 agregar id
	public Item(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	// TODO TP1
	public boolean mismoItem(Item item) {
		return this.id == item.id;
	}

	// TODO TP1
	@Override
	public void mostrar() {

		System.out.println(getClass().getSimpleName() + ": " + nombre + " (" + id + ") " + datosItem());
	}

	public abstract String datosItem();

}