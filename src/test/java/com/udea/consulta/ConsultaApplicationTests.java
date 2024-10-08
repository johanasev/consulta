package com.udea.consulta;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConsultaApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
	}

	@Test
	void version() {
		assertEquals("The actual version is 1.0.0", dataController.version());
	}

	@Test
	void nationLength() {
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength() {
		Integer currenciesLength = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	public void testRandomCurrenciesCodeFormat() {
		JsonNode response = dataController.getRandomCurrencies();
		for (int i = 0; i < response.size(); i++) {
			JsonNode currency = response.get(i);
			String code = currency.get("code").asText();
			assertTrue(code.matches("[A-Z]{3}")); // Verifica que el código de moneda tenga 3 letras mayúsculas
		}
	}

	@Test
	public void testRandomNationsPerformance() {
		long startTime = System.currentTimeMillis();
		dataController.getRandomNations();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Execution Time: " + executionTime + " ms");
		assertTrue(executionTime < 2000); // El tiempo de ejecución debe ser menor a 2 segundos
	}

	@Test
	void aviationsLength() {
		Integer aviationsLength = dataController.getRandomAviation().size();
		assertEquals(20, aviationsLength);
	}
}
