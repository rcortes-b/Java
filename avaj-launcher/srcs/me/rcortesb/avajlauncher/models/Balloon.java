package me.rcortesb.avajlauncher.models;
import me.rcortesb.avajlauncher.utilitaries.Aircraft;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;
import me.rcortesb.avajlauncher.services.WeatherProvider;

public class Balloon extends Aircraft {
	public Balloon(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	@Override
	public void updateConditions() {
		String weather = this.weatherTower.getWeather(this.getCoordinates());
		this.getCoordinates().setBalloonCoords(weather);
		System.out.print(this.getFullName() + ": ");
		switch (weather) {
			case "RAIN":
						System.out.println("I'm a Balloon and it's raining!");
						break;
			case "FOG":
						System.out.println("I'm a Balloon and there is fog!");
						break;
			case "SUN":
						System.out.println("I'm a Balloon and it's a sunny day!");
						break;
			case "SNOW":
						System.out.println("I'm a Balloon and it's snowing!");
						break;
		}
		if (this.getCoordinates().invalidHeight()) {
			System.out.println("Balloon is messed up!");
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