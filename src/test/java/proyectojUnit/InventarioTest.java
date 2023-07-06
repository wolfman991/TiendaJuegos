package proyectojUnit;



import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest {

	private Juego juego1;
	private Juego juego2;
	private Juego juego3;
	private Inventario inventario;
	private List<Juego> listado = new ArrayList<Juego>();
	
	@Before
	public void setUp() throws Exception{
		juego1 = new Juego(1, "COD", 10, 55, 70, "FPS", "PS5");
		juego2 = new Juego(2, "Elden Ring", 20, 30, 50, "Aventura", "XSX");
		juego3 = new Juego(3, "Zelda BOTW", 30, 55, 70, "Aventura", "NSW");
		inventario = new Inventario();
		inventario.AñadirJuego(juego1);
		inventario.AñadirJuego(juego2);
		inventario.AñadirJuego(juego3);

	}

	@Test
	public void testComprarStock() {
		//Given

		//When
		inventario.ComprarStock(1,20);
		Juego juego = inventario.ListadoJuegos().get(0);
		//Then
		Assert.assertEquals(juego.getStock(),30);
	}

	@Test
	public void testVenderConStock() {
		//Given

		//When
		inventario.VenderStock(2,15);
		Juego juego = inventario.ListadoJuegos().get(1);
		//Then
		Assert.assertEquals(juego.getStock(), 5);
	}
	
	@Test
	public void testVenderSinStock() {
		//Given

		//When
		Assert.assertFalse(inventario.VenderStock(2,40));
		//Then
	}


	@Test
	public void testComprasTotales() {
		//Given
		inventario.VenderStock(3,25);
		inventario.ComprarStock(2,15);
		//When

		//Then
		Assert.assertEquals(inventario.getComprasTotales(), 75);

		
	}
	
	@Test
	public void testVentasTotales() {
		//Given
		inventario.VenderStock(3,25);
		inventario.ComprarStock(2,15);	
		//When

		//Then
		Assert.assertEquals(inventario.getVentasTotales(), 25);
		
	}
	
	@Test
	public void testGananciasTotales() {
		//Given
		inventario.VenderStock(3,25);
		inventario.ComprarStock(2,15);


		//Then
		Assert.assertEquals(inventario.getGananciasTotales(), -1500);

		
	}
	
	@Test
	public void testListado() {
		//Given
		listado = inventario.ListadoJuegos();
		
		//Then
		Assert.assertEquals(listado.size(), 3);
	}

}
