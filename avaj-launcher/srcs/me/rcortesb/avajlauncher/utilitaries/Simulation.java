package me.rcortesb.avajlauncher.utilitaries;
import me.rcortesb.avajlauncher.services.WeatherTower;
import java.io.File;

public class Simulation {
	private static Simulation simulator = new Simulation();
	private static int numOfSimulations;
	private Simulation() {}

	public static Simulation getSimulator() {
		return simulator;
	}
	public void setNumOfSimulations(int value) {
		this.numOfSimulations = value;
	}
	public void doSimulation(WeatherTower weatherTower) {
		for (int i = 0; i < numOfSimulations; i++) {
			weatherTower.changeWeather();
		}
	}

}