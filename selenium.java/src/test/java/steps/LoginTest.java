package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.HomePage;
import runner.Navegadores;

public class LoginTest {
	
	HomePage home = new HomePage();
	
	
	@Before
	public void antesDoTeste() {
		Navegadores.abrirNavegador();
	}
	
	@After
	public void depoisDoTeste() {
		Navegadores.fecharNavegador();
	}
	
	@Test
	public void loginTestEmBranco() throws InterruptedException {
	home.login("", "","Epic sadface: Username is required");	
	}
	
	@Test
	public void loginTestInvalido() throws InterruptedException {
	home.login("511515", "secret_sauce","Epic sadface: Username and password do not match any user in this service");	
	}
	
	@Test
	public void loginSucesso() {
		home.login("standard_user", "secret_sauce", "Swag Labs");
	}
	

}
