package vista;

import controlador.IMostrador;

public class VistaChat implements IMostrador {

	@Override
	public void mostrar(String texto) {
		System.out.println(texto);
	}

}
