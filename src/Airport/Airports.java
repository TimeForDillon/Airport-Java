package Airport;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class for airports
 */
public class Airports
{
	private ArrayList<String> airportNames;
	private ArrayList<String> line;
	private String city;
	private File inputFile;
	private Scanner in;
	
	/**
	 * Constructs an Airports class with the given city.
	 * @param city City of airports.
	 */
	public Airports(String city)
	{
		this.inputFile = new File("airports.txt");
		try
		{
			this.in = new Scanner(this.inputFile, "UTF-8");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		this.city = city;
		this.airportNames = new ArrayList<String>();
		this.line = new ArrayList<String>();
		this.getLines();
	}
	
	/**
	 * Retrieves each line of text file.
	 */
	private void getLines()
	{
		in.useDelimiter("\r\n");
		while(in.hasNext())
		{
			this.line.add(in.next());
		}
	}
	
	/**
	 * Finds airports within specified cities. 
	 */
	public void FindAirportsInCity()
	{
		String[] entries = new String[3];
		String city = "";
		for(int i = 0; i < this.line.size(); i++)
		{
			 entries = this.line.get(i).split("[,]",4);
			 city = entries[2].replaceAll("^\"+|\"+$", "");
			 city = city.trim().toUpperCase();
			 if(city.equals(this.city)) this.airportNames.add(entries[1]);
		}
	}
	
	/**
	 * Retrieves airport names in text form.
	 */
	public String toString()
	{
		if(this.airportNames.size() == 0)
			return "No airports in that city.";
		String nameList = "AIRPORTS IN " + this.city + "\r";
		for(int i=0; i<this.airportNames.size(); i++)
		{
			nameList += (i+1) + ": " + this.airportNames.get(i) + "\r";
		}
		return nameList;
	}
}
