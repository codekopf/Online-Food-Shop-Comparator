package AskForPrice;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Tesco {
	
	public static double priceRetriever(String url) throws IOException, ParseException {

		try {
			Document doc = Jsoup.connect(url).get();
			Element rawScrapp = doc.select("div.price-control-wrapper").first();
			String price = rawScrapp.getElementsByTag("span").first().children().first().text(); 
			// System.out.println(price);
			
			// Issue: , (komma) problem with retrieved number instead of . (dot)
			NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
		    Number number = format.parse(price);
		    double doublePrice = number.doubleValue();
		    
		 // System.out.println(doublePrice);
			return doublePrice;
		} finally {
			// System.out.println(url);
		}

	}

}

