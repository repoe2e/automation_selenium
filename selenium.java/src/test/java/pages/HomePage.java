package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePage {

	//
	By user = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	//By msgErro = By.xpath("//h3[@data-test='error']");


	Metodos metodo = new Metodos();

	/**
	 * Para testes negativos informar o texto da mensagem de erro, para teste positivo informar o title da página logada
	 * @param user
	 * @param password
	 * @param textoEsperado
	 */
	public void login(String user, String password,String textoEsperado){
		By msgErro = By.xpath("//h3[text()='"+textoEsperado+"']");
		metodo.escrever(this.user, user);
		metodo.escrever(this.password, password);
		metodo.clicar(this.btnLogin);
		if(textoEsperado.equals("Epic sadface: Username is required")||
		   textoEsperado.equals("Epic sadface: Username and password do not match any user in this service")) {
			metodo.validarTexto(msgErro, textoEsperado);
		}
		if(textoEsperado.equals("Swag Labs")) {
		metodo.validarTitle(textoEsperado);
		}
	}

}
