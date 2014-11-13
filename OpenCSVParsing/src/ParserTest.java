import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class ParserTest {
	Parser testOpenCSV;
	@Before
	public void setup(){
		testOpenCSV = new Parser();
	}
	
	@Test
	public void test() {
		testOpenCSV.parse();
		FormularyDrug testDrug = testOpenCSV.getDrug("AMINO ACIDS");
		System.out.println(testDrug.getGenericName()+ ";"+testDrug.getStrengths() + ";"+ testDrug.getBrandName());
	}

}
