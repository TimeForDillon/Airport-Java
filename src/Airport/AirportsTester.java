package Airport;
import java.util.Scanner;

/**
 * This class test the Airports class. 
 */
public class AirportsTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of a city for a list airports within: ");
		String cityName = in.nextLine();
		Airports myAirports = new Airports(cityName.trim().toUpperCase());
		myAirports.FindAirportsInCity();
		System.out.println(myAirports.toString());
	}
}

/*
Expected: 
Enter the name of a city for a list airports within: 
los angeles
AIRPORTS IN LOS ANGELES
1: "Mar�a Dolores Airport"
2: "Los Angeles International Airport"
3: "Whiteman Airport"

Expected:
Enter the name of a city for a list airports within: 
san francisco
AIRPORTS IN SAN FRANCISCO
1: "San Francisco International Airport"

Expected:
Enter the name of a city for a list airports within: 
london
AIRPORTS IN LONDON
1: "London Airport"
2: "London Luton Airport"
3: "London Gatwick Airport"
4: "London City Airport"
5: "London Heathrow Airport"
6: "London Stansted Airport"
7: "London Heliport"
8: "London-Corbin Airport/Magee Field"
9: "Madison County Airport"

Expected:
Enter the name of a city for a list airports within: 
montebello
No airports in that city.
*/