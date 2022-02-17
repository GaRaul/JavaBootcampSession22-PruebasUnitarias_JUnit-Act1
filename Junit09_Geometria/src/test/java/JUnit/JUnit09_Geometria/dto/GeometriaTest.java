package JUnit.JUnit09_Geometria.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geometria;

	@BeforeEach
	void before() throws Exception {
		System.out.println("before()");
		geometria = new Geometria();
	}

	@AfterEach
	void after() throws Exception {
		System.out.println("after()");
		geometria = null;
	}

	@Test
	void testGeometriaInt() {
		Geometria geometria2 = new Geometria(2);
		Geometria geometria3 = new Geometria(2);
		
		assertEquals(geometria2.getId(), geometria3.getId());
	}

	@Test
	void testGeometria() {
		Geometria geometria2 = new Geometria();		
		assertEquals(geometria2.getId(), geometria.getId());
	}

	@Test
	void testAreacuadrado() {
		int resultado = geometria.areacuadrado(5);
		int esperado = 25;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreaCirculo() {
		double resultado = geometria.areaCirculo(5);
		double esperado = 78.53999999999999;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreatriangulo() {
		int resultado = geometria.areatriangulo(4, 6);
		int esperado = 12;
		assertEquals(resultado, esperado);
	}

	@Test
	void testArearectangulo() {
		int resultado = geometria.arearectangulo(4, 6);
		int esperado = 24;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreapentagono() {
		int resultado = geometria.areapentagono(4, 6);
		int esperado = 12;
		assertEquals(resultado, esperado);
	}

	@Test
	void testArearombo() {
		int resultado = geometria.arearombo(5, 10);
		int esperado = 25;
		assertEquals(resultado, esperado);
	}

	@Test
	void testArearomboide() {
		int resultado = geometria.arearomboide(4, 5);
		int esperado = 20;
		assertEquals(resultado, esperado);
	}

	@Test
	void testAreatrapecio() {
		int resultado = geometria.areatrapecio(4, 8, 10);
		int esperado = 60;
		assertEquals(resultado, esperado);
	}

	@Test
	void testFigura() {
		String resultado = geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(resultado, esperado);
		
		resultado = geometria.figura(2);
		esperado = "Circulo";
		assertEquals(resultado, esperado);
		
		resultado = geometria.figura(3);
		esperado = "Triangulo";
		assertEquals(resultado, esperado);
		
		resultado = geometria.figura(4);
		esperado = "Rectangulo";
		assertEquals(resultado, esperado);
		
		resultado = geometria.figura(5);
		esperado = "Pentagono";
		assertEquals(resultado, esperado);
		
		resultado = geometria.figura(6);
		esperado = "Rombo";
		assertEquals(resultado, esperado);
		
		resultado = geometria.figura(7);
		esperado = "Romboide";
		assertEquals(resultado, esperado);
		
		resultado = geometria.figura(8);
		esperado = "Trapecio";
		assertEquals(resultado, esperado);
		
		resultado = geometria.figura(9);
		esperado = "Default";
		assertEquals(resultado, esperado);
	}

	@Test
	void testGetId() {
		geometria.setId(1);
		int resultado = geometria.getId();
		int esperado = 1;
		assertEquals(resultado, esperado);
	}

	@Test
	void testSetId() {
		geometria.setId(1);
		int resultado = geometria.getId();
		int esperado = 1;
		assertEquals(resultado, esperado);
	}

	@Test
	void testGetNom() {
		geometria.setNom("Rombo");
		String resultado = geometria.getNom();
		String esperado = "Rombo";
		assertEquals(resultado, esperado);
	}

	@Test
	void testSetNom() {
		geometria.setNom("Rombo");
		String resultado = geometria.getNom();
		String esperado = "Rombo";
		assertEquals(resultado, esperado);
	}

	@Test
	void testGetArea() {
		geometria.setArea(20);
		double resultado = geometria.getArea();
		double esperado = 20;
		assertEquals(resultado, esperado);
	}

	@Test
	void testSetArea() {
		geometria.setArea(20);
		double resultado = geometria.getArea();
		double esperado = 20;
		assertEquals(resultado, esperado);
	}

	@Test
	void testToString() {
		geometria.setId(1);
		geometria.setNom("cuadrado");
		geometria.setArea(20);
		
		String resultado = geometria.toString();
		String esperado = "Geometria [id=1, nom=cuadrado, area=20.0]";
		
		assertEquals(resultado, esperado);
	}

}
