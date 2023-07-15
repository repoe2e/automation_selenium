package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import metodos.Metodos;

public class ProdutosPage {

	By produto = By.xpath("//div[@class='inventory_list']/div[1]//div[@class='inventory_item_price']");
	By taxa = By.xpath("");
	Metodos metodos = new Metodos();

	public void validarPreco(String precoAposTaxa) {
		double precoProduto = metodos.converterStringParaDouble(produto);
		double precoTaxa = metodos.converterStringParaDouble(taxa);
		double precoComTaxa = precoProduto + precoTaxa;
		String precoFinal = metodos.converterDoubleParaString(precoComTaxa);
		assertEquals(precoAposTaxa, precoFinal);
	}

}
