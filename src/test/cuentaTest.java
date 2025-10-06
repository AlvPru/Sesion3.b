package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pck.Cuenta;

class cuentaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Cuenta cuentaPrueba= new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testIngreso() {
		int saldoInicial=cuenta.getSaldo();
		cuenta.ingresar(100);
		assertEquals(saldoInicial+100, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {
		int saldoInicial=cuenta.getSaldo();
		cuenta.retirar(100);
		assertEquals(saldoInicial-100, cuenta.getSaldo());
	}

}
