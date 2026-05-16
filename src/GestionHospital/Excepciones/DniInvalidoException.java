package GestionHospital.Excepciones;

	public class DniInvalidoException extends RuntimeException{
		public DniInvalidoException (String mensaje) {
			super(mensaje);
		}
	}

