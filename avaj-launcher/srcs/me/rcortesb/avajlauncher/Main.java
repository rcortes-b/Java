package me.rcortesb.avajlauncher;
import me.rcortesb.avajlauncher.services.WeatherTower;
import me.rcortesb.avajlauncher.utilitaries.Simulation;
public class Main {

	public static void main(String[] args){
		if (args.length != 1) {
			System.out.println("Invalid arguments.");
			return ;
		}
		WeatherTower tower = new WeatherTower();
		Simulation.getSimulator().generateFile();
		tower.registerFleet(args[0]);
		Simulation.getSimulator().doSimulation(tower);
		/*
		This method will call changeWeather() as many times as it is specified in the scenerio.txt
		tower.doSimulation();
		*/
		/*
			Register WeatherTower

			Read and Parse file

			Do simulation (changeWeather)
		*/
	}

}