package me.rcortesb.avajlauncher.services;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;
import me.rcortesb.avajlauncher.utilitaries.Flyable;
import me.rcortesb.avajlauncher.utilitaries.Parser;
import me.rcortesb.avajlauncher.utilitaries.Simulation;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class WeatherTower extends Tower {
	private static WeatherTower weatherTower;
	
	public WeatherTower() {}
	public void registerFleet(String fileName) {
		try {
			File fleetData = new File(fileName);
			if (!fleetData.exists())
				throw new IOException();
			Scanner myReader = new Scanner(fleetData);
			String data = myReader.nextLine();
			Simulation.getSimulator().setNumOfSimulations(Parser.getParser().parseSimulationLoop(data));
			while (myReader.hasNextLine()) {
				data = myReader.nextLine();
				Flyable f = Parser.getParser().addAircraftToFleet(data);
				f.registerTower(this);
			}
		} catch (IOException e) {
			System.out.println("Something went wrong with the file!");
			System.exit(1);
		}
	}

	public String getWeather(Coordinates p_coordinates) {
		return WeatherProvider.getWeatherProvider().getCurrentWeather(p_coordinates);
	}

	public void changeWeather() {
			this.conditionChanged();
	}

	//Debug mode
	public void listFleet() {
		for (Flyable f : this.getObservers()) {
			f.listFlyableData();
		}
	}
}