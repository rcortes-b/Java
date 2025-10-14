package me.rcortesb.avajlauncher.utilitaries;
import me.rcortesb.avajlauncher.services.WeatherTower;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Simulation {
	private static Simulation simulator = new Simulation();
	private static int numOfSimulations;
	private static FileWriter myFile;
	private Simulation() {}

	public static Simulation getSimulator() {
		return simulator;
	}
	public static FileWriter getMyFile() {
		return myFile;
	}
	public void setNumOfSimulations(int value) {
		this.numOfSimulations = value;
	}
	public void registerLogs(String log) {
		try {
			this.myFile.write(log);
		} catch (IOException e) {
			System.out.println("Error writing into the scenario file.");
		}
	}
	public void closeLogFile() {
		try {
			this.myFile.close();
		} catch (IOException e) {
			System.out.println("Error closing the scenario file.");
		}
	}
	
	public void generateFile() {
		try {
			new FileWriter("simulation.txt", false).close();
			//File myObj = new File("simulation.txt");
			//myObj.createNewFile();
			this.myFile = new FileWriter("simulation.txt", true);
		} catch (IOException e) {
			System.out.println("Error manipulating the scenario file.");
			System.exit(1);
		}
	}

	public void doSimulation(WeatherTower weatherTower) {
		for (int i = 0; i < numOfSimulations; i++) {
			weatherTower.changeWeather();
		}
		this.closeLogFile();
	}
}