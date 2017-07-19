package modelo;

import observer.Observado;

public class Sala extends Observado {
	
	private String nombre;
	
	public void enviarMensaje(Mensaje mensaje) {
		this.actualizarObservadores(mensaje);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sala(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	

}
