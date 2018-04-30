public enum Rooms
{	
	//				NAME								CAPACITY 		PRICE			USE 			ORDERED				SELECTED
	auditorium("Auditorium", 						100, 			30, 		"Concert", 				false, 				false),
	bighall("Big hall", 								70, 			20, 	 "Conference",	 		false, 				false),
	mediumsizedroom("Medium sized room", 				30, 			10, 	 "Presentation", 		false, 				false),
	mediumsizedclassroom("Medium sized classroom", 		35, 			15, 	 "Presentation", 		false, 				false),
	smallroom("Small room", 							20, 			 5, 	 "Presentation", 	 	false, 				false);
	
	
	private final String pavadinimas;
	private final int talpa;
	private final int kaina;
	private final String paskirtis;
	private boolean uzsakyta;
	private boolean pasirinkta;
	
	Rooms(String name, int area, int price, String use, boolean ordered, boolean selected)
	{
		pavadinimas = name;
		talpa = area;
		kaina = price;
		paskirtis = use;
		uzsakyta = ordered;
		pasirinkta = selected;
		
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
	public boolean getOrdered()
	{
		return uzsakyta;
	}
	public boolean getSelected()
	{
		return pasirinkta;
	}
	public void setOrdered(boolean ordered)
	{
		uzsakyta = ordered;
	}
	public void setSelected(boolean selected)
	{
		pasirinkta = selected;
	}
}