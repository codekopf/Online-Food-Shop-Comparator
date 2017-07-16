package AskForPrice;
import java.io.IOException;
import java.text.ParseException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Kolonial {

	public static double priceRetriever(String url)  throws IOException, ParseException {

		try {
			Document doc = Jsoup.connect(url).get();
			String price = doc.getElementById("snippet--price").getElementsByClass("price__actual-price").attr("content");
			// System.out.println(price);
			double doublePrice = Double.parseDouble(price);
			// System.out.println(doublePrice);
			return doublePrice;
		} finally {
			// System.out.println(url);
		}

	}

}

