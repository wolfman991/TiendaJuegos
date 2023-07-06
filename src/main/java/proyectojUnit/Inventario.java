package proyectojUnit;

import java.util.ArrayList;
import java.util.List;


//Nueva  clase
public class Inventario {
	private List<Juego> juegos;
	private int gananciasTotales;
	private int ventasTotales;
	private int comprasTotales;
	
	public Inventario() {
		// TODO Auto-generated constructor stub
		super();
		this.juegos = new ArrayList<Juego>();
		this.gananciasTotales = 0;
		this.ventasTotales = 0;
		this.comprasTotales = 0;
	}
	
	public int getGananciasTotales() {
		return gananciasTotales;
	}

	public int getVentasTotales() {
		return ventasTotales;
	}

	public int getComprasTotales() {
		return comprasTotales;
	}
	
	public void calcularReporte() {
		gananciasTotales = 0;
		ventasTotales = 0;
		comprasTotales = 0;
		for(Juego juego : juegos) {
			gananciasTotales += juego.getGanancia();
			comprasTotales += juego.getCompras();
			ventasTotales += juego.getVentas();
		}
	}

	
	public void AñadirJuego(Juego juego) {
		juegos.add(juego);
		this.calcularReporte();
	}
	
	public boolean ComprarStock(int id, int cantidad) {
		for (int i = 0; i < juegos.size(); i++ ) {
			if (juegos.get(i).getId() == id) {
				Juego juego = juegos.get(i);
				juego.ComprarStock(cantidad);
				juegos.set(i, juego);
				this.calcularReporte();
				return true;
			}
		}
		return false;
	}
	
	public boolean VenderStock(int id, int cantidad) {
		for (int i = 0; i < juegos.size(); i++ ) {
			if (juegos.get(i).getId() == id) {
				Juego juego = juegos.get(i);
				boolean r = juego.VenderStock(cantidad);
				juegos.set(i, juego);
				this.calcularReporte();
				return r;
			}
		}
		return false;
	}
	public List<Juego> ListadoJuegos(){
		return juegos;
	}
}
