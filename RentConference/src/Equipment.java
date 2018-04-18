public enum Equipment
{	
	//			PAVADINIMAS	KAINA DIENAI
	projektorius("Projector", 8),
	garsiakalbis("Large speaker", 4),
	lazeris("Laser pointer", 2),
	mikrofonas("Microphone", 5),
	lenta("White board", 7),
	ekranas("Tripod projection screen", 5),
	stiprintuvas("Amplifier", 6);
	
	
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