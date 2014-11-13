
public class FormularyDrug {
	String genericName;
	String strengths;
	String brandName;
	public FormularyDrug(String genName, String strength, String brandName){
		this.genericName=genName;
		this.strengths=strength;
		this.brandName=brandName;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public String getStrengths() {
		return strengths;
	}
	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
}
