package ar.edu.ort.tp1.examen.clases;

public interface FormaDeEnvio {

	public final static float PRECIO_POR_KM_BASE = 150f;
	
	public float calcularPrecio(int kmsEnvio, int peso);
}
