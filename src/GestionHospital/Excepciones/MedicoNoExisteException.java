package GestionHospital.Excepciones;


public class MedicoNoExisteException extends RuntimeException{
		public MedicoNoExisteException (String mensaje) {
			super(mensaje);
		}
	}
