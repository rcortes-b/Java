package me.rcortesb.avajlauncher.models;
import me.rcortesb.avajlauncher.utilitaries.Aircraft;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;
import me.rcortesb.avajlauncher.utilitaries.Simulation;
import me.rcortesb.avajlauncher.services.WeatherProvider;

public class Balloon extends Aircraft {
	public Balloon(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	@Override
	public void updateConditions() {
		String weather = this.weatherTower.getWeather(this.getCoordinates());
		this.getCoordinates().setBalloonCoords(weather);
		Simulation.getSimulator().registerLogs(this.getFullName() + ": ");
		switch (weather) {
			case "RAIN":
						Simulation.getSimulator().registerLogs("I'm a Balloon and it's raining!\n");
						break;
			case "FOG":
						Simulation.getSimulator().registerLogs("I'm a Balloon and there is fog!\n");
						break;
			case "SUN":
						Simulation.getSimulator().registerLogs("I'm a Balloon and it's a sunny day!\n");
						break;
			case "SNOW":
						Simulation.getSimulator().registerLogs("I'm a Balloon and it's snowing!\n");
						break;
		}
		if (this.getCoordinates().invalidHeight()) {
			Simulation.getSimulator().registerLogs(this.getFullName() + ": Balloon is messed up!\n");
			this.weatherTower.unregister(this);
		}
	}

	@Override
	public String getFullName() {
		return ("Balloon#" + this.getName() + "(" + this.getID() + ")");
	}

	//Debug mode
	@Override
	public void listFlyableData() {
		System.out.println("Type: Balloon - ID: " + this.getID() + " Name: " + this.getName() + " Coordinates: " + this.getCoordinates().getLongitude() + " " + this.getCoordinates().getLatitude() + " " + this.getCoordinates().getHeight());
	}
}