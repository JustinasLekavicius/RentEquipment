public enum Equipment
{	
	//				NAME 	PRICE
	projektorius("Projector", 8, 0, 20),
	garsiakalbis("Large speaker", 4, 0, 20),
	lazeris("Laser pointer", 2, 0, 20),
	mikrofonas("Microphone", 5, 0, 20),
	lenta("White board", 7, 0, 20),
	ekranas("Tripod projection screen", 5, 0, 20),
	stiprintuvas("Amplifier", 6, 0, 20);
	
	
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
	
}