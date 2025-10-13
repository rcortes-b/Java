package me.rcortesb.avajlauncher.utilitaries;

public class Coordinates {
	private int longitude;
	private int latitude;
	private int height;

	Coordinates(int p_longitude, int p_latitude, int p_height) {
		if (p_longitude < 0 || p_latitude < 0 || p_height < 0) {
			System.out.println("Negative values cannot be registered!");
			System.exit(1);
		}
		this.longitude = p_longitude;
		this.latitude = p_latitude;
		this.height = p_height;
	}
	public int getLongitude() {
		return longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getHeight() {
		return height;
	}

}