package me.rcortesb.avajlauncher;
import me.rcortesb.avajlauncher.services.WeatherTower;

public class Main {

	public static void main(String[] args){
		if (args.length != 1) {
			System.out.println("Invalid arguments.");
			return ;
		}
		WeatherTower tower = new WeatherTower();

		tower.registerFleet(args[0]);
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