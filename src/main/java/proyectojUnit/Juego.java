package proyectojUnit;

public class Juego {

	private int id;
	private String nombre;
	private int stock;
	private int precio_compra;
	private int precio_venta;
	private String genero;
	private String plataforma;
	private int ganancia;
	private int ventas;
	private int compras;
	
	public Juego() {
		// TODO Auto-generated constructor stub
	}

	public Juego(int id ,String nombre, int stock, int precio_compra, int precio_venta, String genero, String plataforma) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.stock = stock;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.genero = genero;
		this.plataforma = plataforma;
		this.ganancia = 0-(stock * precio_compra);
		this.ventas = 0;
		this.compras = stock;
		
	}
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getStock() {
		return stock;
	}


	public int getPrecio_compra() {
		return precio_compra;
	}

	
	public int getPrecio_venta() {
		return precio_venta;
	}


	public String getGenero() {
		return genero;
	}



	public String getPlataforma() {
		return plataforma;
	}



	public int getGanancia() {
		return ganancia;
	}



	public int getVentas() {
		return ventas;
	}



	public int getCompras() {
		return compras;
	}



	public void ComprarStock(int cantidad) {
		this.stock += cantidad;
		this.ganancia -= cantidad*precio_compra;
		this.compras += cantidad;
	}
	public boolean VenderStock(int cantidad) {
		if (this.stock < cantidad){
			return false;
		}
		this.stock -= cantidad;
		this.ganancia += cantidad*precio_venta;
		this.ventas += cantidad;
		return true;
	}
	

	
	
}
