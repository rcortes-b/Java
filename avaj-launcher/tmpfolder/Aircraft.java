package me.rcortesb.avajlauncher.utilitaries;

public class Aircraft extends Flyable {
	protected long id;
	protected String name;
	protected Coordinates coordinates;

	protected Aircraft(long p_id, String p_name, Coordinates p_coordinates) {
		this.id = p_id;
		this.name = p_name;
		this.coordinates = p_coordinates;
	}
	
	protected long getID() {
		return id;
	}

	protected String getName() {
		return name;
	}

	protected Coordinates getCoordinates() {
		return coordinates;
	}
}
