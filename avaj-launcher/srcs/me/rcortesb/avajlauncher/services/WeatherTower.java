package me.rcortesb.avajlauncher.services;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;
import me.rcortesb.avajlauncher.utilitaries.Flyable;
import me.rcortesb.avajlauncher.utilitaries.Parser;
import java.io.File;
import java.util.Scanner;


public class WeatherTower extends Tower {
	private static WeatherTower weatherTower;
	
	public WeatherTower() {}

	public void registerFleet(String fileName) {
		try {
			File fleetData = new File(fileName);
			Scanner myReader = new Scanner(fleetData);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				this.register(Parser.getParser().addAircraftToFleet(data));
				
			}
		} catch (Exception e) {
			System.out.println("Something went wrong with the file!");
			System.exit(1);
		}
	}

	public String getWeather(Coordinates p_coordinates) {
		return WeatherProvider.getWeatherProvider().getCurrentWeather(p_coordinates);
	}
	public void changeWeather() {

	}

	public void conditionChanged() {

	}
}