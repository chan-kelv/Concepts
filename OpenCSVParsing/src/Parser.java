import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.opencsv.CSVReader;


public class Parser {
	HashMap<String, FormularyDrug> drugList;
	public Parser(){
		drugList = new HashMap<String, FormularyDrug>();
	}

	public void parse(){
		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader("yourfile.csv"));
			String [] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				// nextLine[] is an array of values from the line
				System.out.println(nextLine[0] + nextLine[1] + "etc...");
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
