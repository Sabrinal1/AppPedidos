package ar.edu.ort.tp1.examen.clases;

//TODO TP1
public class EnvioPrivado implements FormaDeEnvio {

	private final static int PESO_CORTE = 100;
	private final static int COEFICIENTE_LIVIANO = 2;
	private final static int COEFICIENTE_PESADO = 5;
	
	@Override
	public float calcularPrecio(int kmsEnvio, int peso) {

		float precioPorKm = (peso <= PESO_CORTE ? COEFICIENTE_LIVIANO : COEFICIENTE_PESADO) * PRECIO_POR_KM_BASE;  
		return kmsEnvio * precioPorKm;
	}

}
