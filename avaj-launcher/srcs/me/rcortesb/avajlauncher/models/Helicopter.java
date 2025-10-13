package me.rcortesb.avajlauncher.models;
import me.rcortesb.avajlauncher.utilitaries.Aircraft;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;

public class Helicopter extends Aircraft {
	public Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}

	@Override
	public void updateConditions() {
		System.out.println("Helicopter Updated!");
	}

	//Debug mode
	@Override
	public void listFlyableData() {
		System.out.println("Type: Helicopter - ID: " + this.getID() + " Name: " + this.getName() + " Coordinates: " + this.getCoordinates().getLongitude() + " " + this.getCoordinates().getLatitude() + " " + this.getCoordinates().getHeight());
	}
}