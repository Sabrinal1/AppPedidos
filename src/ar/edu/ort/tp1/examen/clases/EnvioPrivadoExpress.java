package ar.edu.ort.tp1.examen.clases;

public class EnvioPrivadoExpress extends EnvioPrivado {

	private static final float COEFICIENTE_ENVIO_EXPRESS = 2;

	@Override
	public float calcularPrecio(int kmsEnvio, int peso) {

		return super.calcularPrecio(kmsEnvio, peso) * COEFICIENTE_ENVIO_EXPRESS;
	}
}
