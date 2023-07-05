package proyectojUnit;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JuegoTest {

	private Juego juego1;
	private Juego juego2;
	private Juego juego3;
	private Inventario inventario;
	
	@Before
	public void setUp() throws Exception{
		juego1 = new Juego(1, "COD", 10, 55, 70, "FPS", "PS5");
		juego2 = new Juego(2, "Elden Ring", 20, 30, 50, "Aventura", "XSX");
		juego3 = new Juego(3, "Zelda BOTW", 30, 55, 70, "Aventura", "NSW");
		inventario = new Inventario();
		

	}

	@Test
	public void testComprarStock() {
		//Given

		//When
		juego1.ComprarStock(20);
		//Then
		Assert.assertEquals(juego1.getStock(),30);
	}

	@Test
	public void testVenderStock1() {
		//Given

		//When
		Assert.assertTrue(juego2.VenderStock(15));
		//Then
		Assert.assertEquals(juego2.getStock(), 5);
	}
	
	@Test
	public void testVenderStock2() {
		//Given

		//When
		Assert.assertFalse(juego2.VenderStock(40));
		//Then
	}


	@Test
	public void testReporte() {
		//Given
		juego3.VenderStock(25);
		juego2.ComprarStock(15);
		inventario.AñadirJuego(juego1);
		inventario.AñadirJuego(juego2);
		inventario.AñadirJuego(juego3);
		//When

		//Then
		Assert.assertEquals(inventario.getComprasTotales(), 75);
		Assert.assertEquals(inventario.getVentasTotales(), 25);
		Assert.assertEquals(inventario.getGananciasTotales(), -1500);
		
	}

}
