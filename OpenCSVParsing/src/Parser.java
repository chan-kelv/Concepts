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
		int count = 0;
		try {
			reader = new CSVReader(new FileReader("formulary.csv"));
			String [] nextLine;
			while ((nextLine = reader.readNext()) != null) 	{
				count++;
				// nextLine[] is an array of values from the line
				if(!(drugList.containsKey(nextLine[0]))){
					if(nextLine[2].equals(null))
						drugList.put(nextLine[0], new FormularyDrug(nextLine[0], nextLine[1],"N/A"));
					else
						drugList.put(nextLine[0], new FormularyDrug(nextLine[0], nextLine[1],nextLine[2]));
				}
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public FormularyDrug getDrug(String key){
		return drugList.get(key);
	}
}
