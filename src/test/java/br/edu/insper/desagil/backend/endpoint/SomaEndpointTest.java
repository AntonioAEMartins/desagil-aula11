package br.edu.insper.desagil.backend.endpoint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.pro.hashi.nfp.rest.client.EndpointTest;

class SomaEndpointTest extends EndpointTest<Integer> {
	@BeforeEach
	public void setUp() {
		start("http://192.168.15.27:8080");
	}

	@Test
	public void umMaisDoisIgualTres() {
		String actual = get("/soma?a=1&b=2");
		assertEquals("3", actual);
	}

	@AfterEach
	public void tearDown() {
		stop();
	}
}
