package me.rcortesb.avajlauncher.models;
import me.rcortesb.avajlauncher.utilitaries.Aircraft;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;

public class Helicopter extends Aircraft {
	public Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	@Override
	public void updateConditions() {
		String weather = this.weatherTower.getWeather(this.getCoordinates());
		this.getCoordinates().setHelicopterCoords(weather);
		System.out.print(this.getFullName() + ": ");
		switch (weather) {
			case "RAIN":
						System.out.println("I'm a Helicopter and it's raining!");
						break;
			case "FOG":
						System.out.println("I'm a Helicopter and there is fog!");
						break;
			case "SUN":
						System.out.println("I'm a Helicopter and it's a sunny day!");
						break;
			case "SNOW":
						System.out.println("I'm a Helicopter and it's snowing!");
						break;
		}
		if (this.getCoordinates().invalidHeight()) {
			System.out.println("Helicopter is messed up!");
			this.weatherTower.unregister(this);
		}
	}

	@Override
	public String getFullName() {
		return ("Helicopter#" + this.getName() + "(" + this.getID() + ")");
	}

	//Debug mode
	@Override
	public void listFlyableData() {
		System.out.println("Type: Helicopter - ID: " + this.getID() + " Name: " + this.getName() + " Coordinates: " + this.getCoordinates().getLongitude() + " " + this.getCoordinates().getLatitude() + " " + this.getCoordinates().getHeight());
	}
}