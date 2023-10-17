package secuenciasMaximas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecuenciasMaximasTests {

	@Test
	void ejemploCuantosValoresTest() {
		int v[] = {9, 7, 11, 6, 14, 19, 5, 11, 17, 18};
		SecMax sm = new SecMax(v);
		assertEquals(5, sm.cuantosValoresValidos());
		
	}
	
	@Test
	void ejemploLongitudSecMaxTest() {
		int v[] = {9, 7, 11, 6, 14, 19, 5, 11, 17, 18};
		SecMax sm = new SecMax(v);
		assertEquals(2, sm.longitudSecuenciaMaxima());
		
	}

}
