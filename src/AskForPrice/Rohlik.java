package AskForPrice;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Rohlik {
	
	public static double priceRetriever(String url) throws IOException, ParseException {

		try {
			Document doc = Jsoup.connect(url).get();
			Elements rawScrapp = doc.select("body > div.container > div.mt-30 > article > div.product-detail__wrapper > div > div.product-detail__price > strong");
			String rawText = rawScrapp.text();
			// System.out.println(rawScrapp.toString());
			
			Pattern pattern = Pattern.compile("([0-9]+(,[0-9]{2})?)");
			Matcher matcher = pattern.matcher(rawText);
			String price = null;
			if (matcher.find()) {
				price = matcher.group(1);
			}

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

