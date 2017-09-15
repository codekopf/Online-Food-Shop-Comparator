package Menu;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;

import com.opencsv.CSVReader;

import AskForPrice.Kosik;
import AskForPrice.Rohlik;
import AskForPrice.Tesco;
import DB.Connector;
import Item.Item;

public class Comparator {

	public static void main(String[] args) {
		
		
		
		try {
			List<Item> items = Connector.selectAllRecordsFromItemTable();
			for(Item item : items){
				System.out.println(item.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		// PRINT HEAD
		StringBuilder sb = new StringBuilder();
		sb.append("+--------------------+--------------------+--------------------+--------------------+\n");
		sb.append("|                    |      kosik.cz      |      rohlik.cz     |      itesco.cz     |\n");
		sb.append("+--------------------+--------------------+--------------------+--------------------+");
	    
		System.out.println(sb);
		
		double totalKosik = 0;
		double totalRohlik = 0;
		double totalTesco = 0;
		
        try {
        	CSVReader reader = CustomCSVReader.listReader("list.csv");
	        String[] line;
	        while ((line = reader.readNext()) != null) {
	        	System.out.print("|");
	        	System.out.printf("%-20s",  line[0]);
	        	System.out.print("|");
	        	        	
	        	// Kosik
	        	double itemPriceKosik = Kosik.priceRetriever(line[2]);
	        	totalKosik += itemPriceKosik;
	        	System.out.printf(" %-19s",  itemPriceKosik);
	        	
	        	System.out.print("|");
	        	
	        	// Rohlik
	        	double itemPriceRohlik = Rohlik.priceRetriever(line[3]);
	        	totalRohlik += itemPriceRohlik;
	        	System.out.printf(" %-19s",  itemPriceRohlik);
	        	
	        	System.out.print("|");
	        	
	        	// Tesco
	        	double itemPriceTesco = Tesco.priceRetriever(line[4]);
	        	totalTesco += itemPriceTesco;
	        	System.out.printf(" %-19s",  itemPriceTesco);
	        	
	        	System.out.print("|\n");
	        	System.out.print("+--------------------+--------------------+--------------------+--------------------+\n");
	    		// System.out.print("Item [name= " + line[0] + ", quantity= " + line[1] + " ,\n kosik.cz=" + line[2] + " "  + " ,\n rohlik.cz=" + line[3] + " "  + " ,\n itesco.cz=" + line[4] + "]\n");
	        }
	    } catch (IOException | ParseException e) {
	        e.printStackTrace();
	    }
        
        // PRINT COUNT
        DecimalFormat df = new DecimalFormat("#.##");
		System.out.printf("| TOTAL              | %-19s| %-19s| %-19s|\n", df.format(totalKosik), df.format(totalRohlik), df.format(totalTesco));
		System.out.println("+--------------------+--------------------+--------------------+--------------------+--------------------+");
        
	}

}
