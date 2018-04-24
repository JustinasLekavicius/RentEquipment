public enum Rooms
{	
	//				NAME		CAPACITY PRICE	USE 
	auditorija("Large auditorium", 100, 30, "Koncertas", 0),
	sale("Big hall", 70, 20, "Konferencija", 0),
	kambarys("Medium sized room", 30, 10, "Prezentacija", 0),
	klase("Medium sized classroom", 35, 15, "Prezentacija", 0),
	kambariukas("Small room", 20, 5, "Prezentacija", 0);
	
	
	private final String pavadinimas;
	private final int talpa;
	private final int kaina;
	private final String paskirtis;
	private int uzsakyta;
	
	Rooms(String name, int area, int price, String use, int ordered)
	{
		pavadinimas = name;
		talpa = area;
		kaina = price;
		paskirtis = use;
		uzsakyta = ordered;
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
	public int getOrdered()
	{
		return uzsakyta;
	}
	public void setOrdered(int ordered)
	{
		uzsakyta = ordered;
	}
}