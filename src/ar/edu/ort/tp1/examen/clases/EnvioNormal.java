package ar.edu.ort.tp1.examen.clases;

public class EnvioNormal implements FormaDeEnvio {

	@Override
	public float calcularPrecio(int kmsEnvio, int peso) {

		return kmsEnvio * PRECIO_POR_KM_BASE;
	}

}
