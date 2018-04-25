
public class TotalCalculation extends Main {

	static int ProjectorCosts = 0;
    static int LargeSpeakerCosts = 0;
    static int LaserPointerCosts = 0;
    static int MicrophoneCosts = 0;
    static int WhiteBoardCosts = 0;
    static int ProjectionScreenCosts = 0;
    static int AmplifierCosts = 0;
    static int AuditoriumCosts = 0;
    static int HallCosts = 0;
    static int RoomCosts = 0;
    static int ClassroomCosts = 0;
    static int ChamberCosts = 0;
    
	static void	CalculateTotal ()

	{
		total = (ProjectorCosts + LargeSpeakerCosts + LaserPointerCosts + MicrophoneCosts + WhiteBoardCosts + ProjectionScreenCosts + AmplifierCosts + AuditoriumCosts + HallCosts + RoomCosts + ClassroomCosts + ChamberCosts) * NumberOfDays;
	}

	
}
