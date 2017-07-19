package modelo;

public abstract class Mensaje {
	
	private String content;

	public Mensaje(String mensaje) {
		this.content = mensaje;
	}
	
	public String getContent() {
		return content;
	}
	
	public abstract String toString();

}
