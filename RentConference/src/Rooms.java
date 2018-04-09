public enum Rooms
{	
	//			PAVADINIMAS	 PLOTAS	KAINA
	auditorija("Large auditorium", 100, 30),
	sale("Big hall", 70, 20),
	kambarys("Medium sized room", 30, 10),
	klase("Medium sized classroom", 35, 15),
	kambariukas("Small room", 20, 5);
	
	
	private final String pavadinimas;
	private final int plotas;
	private final int kaina;
	
	Rooms(String name, int area, int price)
	{
		pavadinimas = name;
		plotas = area;
		kaina = price;
	}
	public String getName()
	{
		return pavadinimas;
	}
	public int getArea()
	{
		return plotas;
	}
	public int getPrice()
	{
		return kaina;
	}
}