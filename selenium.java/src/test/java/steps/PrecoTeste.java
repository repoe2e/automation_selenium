package steps;

import org.junit.Before;
import org.junit.Test;

import pages.HomePage;
import pages.ProdutosPage;
import runner.Navegadores;

public class PrecoTeste {
	
	HomePage home = new HomePage();
	ProdutosPage produtos = new ProdutosPage();
	
	@Before
	public void antesDoTeste() {
		Navegadores.abrirNavegador();
		home.login("standard_user", "secret_sauce", "Swag Labs");
	}
	
	@Test
	public void testValidarPreco() {
	
		
	}

}
