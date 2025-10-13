package me.rcortesb.avajlauncher.services;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;
import me.rcortesb.avajlauncher.utilitaries.Flyable;
import me.rcortesb.avajlauncher.utilitaries.Parser;
import java.io.File;
import java.util.Scanner;


public class WeatherTower extends Tower {
	private static WeatherTower weatherTower;
	private static int numOfSimulations;
	
	public WeatherTower() {}
	public void registerFleet(String fileName) {
		try {
			File fleetData = new File(fileName);
			Scanner myReader = new Scanner(fleetData);
			String data = myReader.nextLine();
			this.numOfSimulations = Parser.getParser().parseSimulationLoop(data);
			System.out.println(this.numOfSimulations);
			while (myReader.hasNextLine()) {
				data = myReader.nextLine();
				this.register(Parser.getParser().addAircraftToFleet(data));
				
			}
		} catch (Exception e) {
			System.out.println("Something went wrong with the file!");
			System.exit(1);
		}
	}
	public void listFleet() {
		for (Flyable f : this.getObservers()) {
			f.listFlyableData();
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