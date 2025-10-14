package me.rcortesb.avajlauncher.utilitaries;
import me.rcortesb.avajlauncher.utilitaries.Flyable;
import me.rcortesb.avajlauncher.models.*;

public class AircraftFactory {
	private static AircraftFactory aircraftFactory = new AircraftFactory();
	private static String[] aircraftType = {"Helicopter", "Balloon", "JetPlane"};
	private static int unique_id = 0;
	private AircraftFactory() {};

	public static AircraftFactory getAircraftFactory() {
		return aircraftFactory;
	}
	public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
		unique_id++;
		if (p_type.equals("Helicopter"))
			return (new Helicopter(unique_id, p_name, p_coordinates));
		else if (p_type.equals("Balloon"))
			return (new Balloon(unique_id, p_name, p_coordinates));
		return (new JetPlane(unique_id, p_name, p_coordinates));
	}
}