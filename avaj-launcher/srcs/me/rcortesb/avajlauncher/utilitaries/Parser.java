package me.rcortesb.avajlauncher.utilitaries;
import me.rcortesb.avajlauncher.models.Baloon;
import java.text.ParseException;

public class Parser {
	private static Parser parser = new Parser();
	private static String[] aircraftType = {"Helicopter", "Baloon", "JetPlane"};
	
	private Parser() {}
	private static boolean typeIsValid(String type) {
		for (String t : aircraftType) {
			if (t.equals(type))
				return true;
		}
		return false;
	}

	private static Coordinates extractCoordinates(String strLongitude, String strLatitude, String strHeight) {
		try {
			int longitude = Integer.parseInt(strLongitude);
			int latitude = Integer.parseInt(strLatitude);
			int height = Integer.parseInt(strHeight);
			if (height < 0 || height > 100) {
				System.out.print("Height value is not between 0 and 100: ");
				throw new Exception();
			}
			return (new Coordinates(longitude, latitude, height));
		} catch (Exception e) {
			System.out.println("Coordinates are wrong defined.");
			System.exit(1);
		}
		return (new Coordinates(0, 0, 0));
	}

	public static Parser getParser() {
		return parser;
	}
	public static int parseSimulationLoop(String line) {
		String[] lineSplitted = line.split(" ");
		int num = 0;
		try {
			if (lineSplitted.length != 1) {
				throw new Exception();
			}
			num = Integer.parseInt(lineSplitted[0]);
			if (num <= 0)
				throw new Exception();
		} catch (Exception e) {
			System.out.println("Wrong input in the scenario file: Number of simulations is wrong defined.");
			System.exit(1);
		}
		return num;
	}
	
	public Flyable addAircraftToFleet(String data) {
		try {
			String[] lineSplitted = data.split(" ");
			if (lineSplitted.length != 5 || typeIsValid(lineSplitted[0]) == false)
				throw new Exception();

			Coordinates coordinates = extractCoordinates(lineSplitted[2], lineSplitted[3], lineSplitted[4]);
			return AircraftFactory.getAircraftFactory().newAircraft(lineSplitted[0], lineSplitted[1], coordinates);
		} catch (Exception e) {
			System.out.println("Error in the data of an Aircraft.");
			System.exit(1);
		}
		return null;
	}

}