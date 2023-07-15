package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarTexto(By msgErro, String textoEsperado)  {
		assertEquals(textoEsperado, driver.findElement(msgErro).getText());
	}
	
	public void validarTitle(String titleEsperado) {
		assertEquals(titleEsperado, driver.getTitle());
	}
	
	public String converterDoubleParaString(double valor) {
		String conversao = String.valueOf(valor);
		System.out.println("Valor retornado " + conversao);
		return conversao;
	}

	public double converterStringParaDouble(By elemento) {
		String valor = driver.findElement(elemento).getText();
		valor = valor.replace('$', '0');
		double conversao = Double.parseDouble(valor);
		System.out.println("Valor retornado " + conversao);
		return conversao;
	}
}
