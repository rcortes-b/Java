package me.rcortesb.avajlauncher.models;
import me.rcortesb.avajlauncher.utilitaries.Aircraft;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;

public class Baloon extends Aircraft {
	public Baloon(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	@Override
	public void updateConditions() {
		System.out.println("Baloon Updated!");
	}

	//Debug mode
	@Override
	public void listFlyableData() {
		System.out.println("Type: Baloon - ID: " + this.getID() + " Name: " + this.getName() + " Coordinates: " + this.getCoordinates().getLongitude() + " " + this.getCoordinates().getLatitude() + " " + this.getCoordinates().getHeight());
	}
}