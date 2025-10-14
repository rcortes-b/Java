package me.rcortesb.avajlauncher.models;
import me.rcortesb.avajlauncher.utilitaries.Aircraft;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;

public class JetPlane extends Aircraft {
	public JetPlane(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	@Override
	public void updateConditions() {
		String weather = this.weatherTower.getWeather(this.getCoordinates());
		this.getCoordinates().setJetPlaneCoords(weather);
		System.out.print(this.getFullName() + ": ");
		switch (weather) {
			case "RAIN":
						System.out.println("I'm a JetPlane and it's raining!");
						break;
			case "FOG":
						System.out.println("I'm a JetPlane and there is fog!");
						break;
			case "SUN":
						System.out.println("I'm a JetPlane and it's a sunny day!");
						break;
			case "SNOW":
						System.out.println("I'm a JetPlane and it's snowing!");
						break;
		}
		if (this.getCoordinates().invalidHeight()) {
			System.out.println("JetPlane is messed up!");
			this.weatherTower.unregister(this);
		}
	}

	@Override
	public String getFullName() {
		return ("JetPlane#" + this.getName() + "(" + this.getID() + ")");
	}

	//Debug mode
	@Override
	public void listFlyableData() {
		System.out.println("Type: JetPlane - ID: " + this.getID() + " Name: " + this.getName() + " Coordinates: " + this.getCoordinates().getLongitude() + " " + this.getCoordinates().getLatitude() + " " + this.getCoordinates().getHeight());
	}
}