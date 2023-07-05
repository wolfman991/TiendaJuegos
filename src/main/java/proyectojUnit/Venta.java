package proyectojUnit;

public class Venta {
	
	private String juego;
	private String vendedor;
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

	public Venta(String juego, String vendedor) {
		super();
		this.juego = juego;
		this.vendedor = vendedor;
	}

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	
}
