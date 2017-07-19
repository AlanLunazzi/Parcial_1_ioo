package controlador;

import modelo.MensajeImagen;
import modelo.MensajeTexto;
import modelo.MensajeVoz;
import modelo.Sala;


public class ContoladorMensaje {
	
	private Sala UADEProgra3;
	private Sala UADEAIOO;
	
	
	
	public ContoladorMensaje(Sala uADEProgra3, Sala uADEAIOO) {
		super();
		UADEProgra3 = uADEProgra3;
		UADEAIOO = uADEAIOO;
	}



	public void ejecutar() {
		
		UADEProgra3.enviarMensaje(new MensajeTexto("Hola Todos"));
		UADEAIOO.enviarMensaje(new MensajeVoz("[--Saludos Grupo--]"));
		UADEProgra3.enviarMensaje(new MensajeImagen("{IMAGEN}"));
		
	}

}
