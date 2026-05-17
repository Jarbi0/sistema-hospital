package GestionHospital.Excepciones;


public class PacienteNoExisteException extends RuntimeException{
		public PacienteNoExisteException (String mensaje) {
			super(mensaje);
		}
	}
