package Tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import AskForPrice.Kosik;
import AskForPrice.Rohlik;
import AskForPrice.Tesco;

public class TestPrices {

	@Test
	public void testAssertItemPriceKosik() throws IOException, ParseException {
		double testKosik = Kosik.priceRetriever("https://www.kosik.cz/produkt/360-penam-rohlik-jemny-43g");
		assertEquals(2, testKosik, 0.1);
	}
	
	@Test
	public void testAssertItemPriceRohlik() throws IOException, ParseException {
		double testRohlik = Rohlik.priceRetriever("https://www.rohlik.cz/1286399-rohlik-jemny");
		assertEquals("Text: ",1.9, testRohlik, 0.1);
	}
	
	@Test
	public void testAssertItemPriceTesco() throws IOException, ParseException {
		double testTesco = Tesco.priceRetriever("https://nakup.itesco.cz/groceries/cs-CZ/products/2001000151875");
		assertEquals(1.9, testTesco, 0.1);
	}

}
