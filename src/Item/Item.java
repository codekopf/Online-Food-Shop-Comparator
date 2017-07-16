package Item;

public class Item {

	private int id;
	private String name;
	private int unit;
	private double weight;
	private Long barcode;
	private String kolonial;
	private String kosik;
	private String rohlik;
	private String tesco;
	private String albert;
	private String dam;
	
	public Item(int id, String name, int unit, double weight, Long barcode, String kolonial, String kosik,
			String rohlik, String tesco, String albert, String dam) {
		super();
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.weight = weight;
		this.barcode = barcode;
		this.kolonial = kolonial;
		this.kosik = kosik;
		this.rohlik = rohlik;
		this.tesco = tesco;
		this.albert = albert;
		this.dam = dam;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getUnit() {
		return unit;
	}

	public double getWeight() {
		return weight;
	}

	public Long getBarcode() {
		return barcode;
	}

	public String getKolonial() {
		return kolonial;
	}

	public String getKosik() {
		return kosik;
	}

	public String getRohlik() {
		return rohlik;
	}

	public String getTesco() {
		return tesco;
	}

	public String getAlbert() {
		return albert;
	}

	public String getDam() {
		return dam;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setBarcode(Long barcode) {
		this.barcode = barcode;
	}

	public void setKolonial(String kolonial) {
		this.kolonial = kolonial;
	}

	public void setKosik(String kosik) {
		this.kosik = kosik;
	}

	public void setRohlik(String rohlik) {
		this.rohlik = rohlik;
	}

	public void setTesco(String tesco) {
		this.tesco = tesco;
	}

	public void setAlbert(String albert) {
		this.albert = albert;
	}

	public void setDam(String dam) {
		this.dam = dam;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", unit=" + unit + ", weight=" + weight + ", barcode=" + barcode
				+ ", kolonial=" + kolonial + ", kosik=" + kosik + ", rohlik=" + rohlik + ", tesco=" + tesco
				+ ", albert=" + albert + ", dam=" + dam + "]";
	}

	
}
