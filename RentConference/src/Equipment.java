public enum Equipment
{	
	//				NAME   					PRICE 		ORDERED 	AVAILABLE
	projector("Projector", 					8, 			0, 		0),
	largespeaker("Large speaker", 				4, 			0, 		0),
	laserpointer("Laser pointer", 					2, 			0, 		0),
	microphone("Microphone", 					5, 			0, 		0),
	whiteboard("White board", 						7, 			0, 		0),
	tripodscreen("Tripod projection screen",		 	5, 			0, 		0),
	amplifier("Amplifier", 					6, 			0, 		0);
	
	
	private final String pavadinimas;
	private final int kaina;
	public int uzsakyta;
	public int likutis;
	
	Equipment(String name, int price, int ordered, int available)
	{
		pavadinimas = name;
		kaina = price;
		uzsakyta = ordered;
		likutis = available;
	}
	public String getName()
	{
		return pavadinimas;
	}
	public int getPrice()
	{
		return kaina;
	}
	public int getOrdered()
	{
		return uzsakyta;
	}
	public int getAvailable()
	{
		return likutis;
	}
	public void setOrdered(int ordered)
	{
		uzsakyta = ordered;
	}
	public void setAvailable(int available)
	{
		likutis = available;
	}
	static void ReduceAvailable ()
	{
		for (Equipment item: Equipment.values())
		item.likutis =  item.getAvailable() - item.getOrdered();
	}
}