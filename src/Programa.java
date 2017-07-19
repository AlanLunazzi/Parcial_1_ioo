import controlador.ContoladorMensaje;
import vista.VistaChat;
import modelo.MensajeTexto;
import modelo.Sala;
import modelo.Usuario;


public class Programa {
	
	public static void main(String[] args) {
		
		Sala UADEProgra3 = new Sala("UADEProgra3");
		Sala UADEAIOO = new Sala("UADEAIOO");
		
		VistaChat vista = new VistaChat();
		Usuario pedro = new Usuario(vista, "Pedro");
		Usuario maria = new Usuario(vista, "Maria");
		Usuario fernando = new Usuario(vista, "Fernando");
		
		UADEProgra3.registrarObservador(pedro);
		UADEProgra3.registrarObservador(maria);
		
		UADEAIOO.registrarObservador(maria);
		UADEAIOO.registrarObservador(fernando);
		
		ContoladorMensaje cMensaje = new ContoladorMensaje(UADEProgra3, UADEAIOO);
		cMensaje.ejecutar();
		
		
	}

}

