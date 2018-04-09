public enum Rooms
{	
	//			PAVADINIMAS	 ZMONIU TALPA	KAINA 
	auditorija("Large auditorium", 100, 30, "Koncertas"),
	sale("Big hall", 70, 20, "Konferencija"),
	kambarys("Medium sized room", 30, 10, "Prezentacija"),
	klase("Medium sized classroom", 35, 15, "Prezentacija"),
	kambariukas("Small room", 20, 5, "Prezentacija");
	
	
	private final String pavadinimas;
	private final int talpa;
	private final int kaina;
	private final String paskirtis;
	
	Rooms(String name, int area, int price, String use)
	{
		pavadinimas = name;
		talpa = area;
		kaina = price;
		paskirtis = use;
	}
	public String getName()
	{
		return pavadinimas;
	}
	public int getArea()
	{
		return talpa;
	}
	public int getPrice()
	{
		return kaina;
	}
	public String getUse()
	{
		return paskirtis;
	}
}