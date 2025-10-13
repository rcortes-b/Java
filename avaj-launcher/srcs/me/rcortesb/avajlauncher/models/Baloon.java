package me.rcortesb.avajlauncher.models;
//import me.rcortesb.avajlauncher.models.Aircraft;
import me.rcortesb.avajlauncher.utilitaries.Flyable;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;

/*public class Baloon extends Aircraft {
	public Baloon(long p_id, String p_name, Coordinates p_coordinates) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinates;
	}
	public void updateConditions() {
		System.out.println("Baloon Updated!");
	}
}*/
public class Baloon extends Flyable {
	public long id;
	public String name;
	public Coordinates coordinates;
	public Baloon(long p_id, String p_name, Coordinates p_coordinates) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinates;
	}
	public void updateConditions() {
		System.out.println("Baloon Updated!");
	}
}
