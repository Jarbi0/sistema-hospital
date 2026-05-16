package GestionHospital.Excepciones;

	 public class FechaInvalidaException extends RuntimeException{
		public FechaInvalidaException (String mensaje) {
			super(mensaje);
		}
	}