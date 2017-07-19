package modelo;

import controlador.IMostrador;
import observer.IObservador;

public class Usuario implements IObservador {
	
	private String nombre;
	private IMostrador mostrador;

	public Usuario(IMostrador mostrador, String nombre) {
		this.nombre = nombre;
		this.mostrador = mostrador; 
	}

	@Override
	public void actualizar(Mensaje mensaje) {
		this.mostrador.mostrar(nombre + " RECIBIO UN MENSAJE");
		this.mostrador.mostrar(mensaje.toString());
		this.mostrador.mostrar("CONTENIDO: " + mensaje.getContent());
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
