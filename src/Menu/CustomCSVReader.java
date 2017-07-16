package Menu;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class CustomCSVReader {
	
	public static CSVReader listReader(String listName) throws FileNotFoundException {
		
        String csvFile = listName;
        
        CSVReader CSVFile = null;
        
        CSVFile = new CSVReader(new FileReader(csvFile));
        
        return CSVFile;
    }


    public static void main(String[] args) throws FileNotFoundException {

        CSVReader reader = listReader("list.csv");
        
        try {
	        String[] line;
	        while ((line = reader.readNext()) != null) {
	            System.out.print("Item [name= " + line[0] + ", quantity= " + line[1] + " ,\n kolonial.cz=" + line[2] + " "  + " ,\n kosik.cz=" + line[3] + " "  + " ,\n rohlik.cz=" + line[4] + " "  + " ,\n itesco.cz=" + line[5] + "]\n");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

    }

}