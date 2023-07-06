package proyectojUnit;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JuegoTest {

	private Juego juego1;
	private Juego juego2;


	
	@Before
	public void setUp() throws Exception{
		juego1 = new Juego(1, "COD", 10, 55, 70, "FPS", "PS5");
		juego2 = new Juego(2, "Elden Ring", 20, 30, 50, "Aventura", "XSX");

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
	public void testVenderConStock() {
		//Given

		//When
		juego2.VenderStock(15);
		//Then
		Assert.assertEquals(juego2.getStock(), 5);
	}
	
	@Test
	public void testVenderSinStock() {
		//Given

		//When
		Assert.assertFalse(juego2.VenderStock(40));
		//Then
	}


}
