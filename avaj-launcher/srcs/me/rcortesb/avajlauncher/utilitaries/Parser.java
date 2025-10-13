package me.rcortesb.avajlauncher.utilitaries;
import me.rcortesb.avajlauncher.models.Baloon;

public class Parser {
	private static Parser parser = new Parser();

	private Parser() {}
	public static Parser getParser() {
		return parser;
	}
	public static void parseLine(String line) {
		try {
			String[] lineSplitted = line.split(" ");
			System.out.print("Line: ");
			for (String lines : lineSplitted) {
				System.out.print(lines + " ");
			}
			System.out.print("\n");
		} catch (Exception e) {
			System.out.println("Something went wrong parsing a line!");
			System.exit(1);
		}
	}
	
	public static Flyable addAircraftToFleet(String data) {
		parseLine(data);
		return new Baloon(0, "pepe", new Coordinates(2, 4, 6));
	}

	public enum aircraftType {
		BALLON,
		HELICOPTER,
		JETPLANE
	}
}