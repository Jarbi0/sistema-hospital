package GestionHospital.Excepciones;


public class MedicoYaExisteException extends RuntimeException{
		public MedicoYaExisteException (String mensaje) {
			super(mensaje);
		}
	}
