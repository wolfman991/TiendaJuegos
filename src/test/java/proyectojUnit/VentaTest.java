package proyectojUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VentaTest {

	private Venta venta;
	
	@Before
	public void setUp() throws Exception{
		venta = new Venta("COD MW3", "chtvnega");
	}
	
	
	@Test
	public void testGetJuego() {
		
	
		
		Assert.assertTrue(venta.getJuego().equals("COD MW3"));
		
	}

}
