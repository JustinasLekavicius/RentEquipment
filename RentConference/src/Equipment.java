public enum Equipment
{	
	//			NAME	PRICE
	projektorius("Projector", 80),
	garsiakalbis("Large speaker", 40),
	lazeris("Laser pointer", 15),
	mikrofonas("Microphone", 20),
	lenta("White board", 25),
	ekranas("Tripod projection screen", 45),
	stiprintuvas("Amplifier", 60);
	
	
	private final String pavadinimas;
	private final int kaina;
	
	Equipment(String name, int price)
	{
		pavadinimas = name;
		kaina = price;
	}
	public String getName()
	{
		return pavadinimas;
	}
	public int getPrice()
	{
		return kaina;
	}
}