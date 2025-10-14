package me.rcortesb.avajlauncher.utilitaries;

public class Coordinates {
	private int longitude;
	private int latitude;
	private int height;

	Coordinates(int p_longitude, int p_latitude, int p_height) {
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

	public boolean invalidHeight() {
		if (this.height > 100)
			this.height = 100;
		else if (this.height < 0)
			return true;
		return false;
	}

	public void setBalloonCoords(String weather) {
		switch (weather) {
			case "SUN":
							this.longitude += 2;
							this.height += 4;
							break;
			case "RAIN":
							this.height -= 5;
							break;
			case "FOG":
							this.height -= 3;
							break;
			case "SNOW":
							this.height -= 15;
							break;
		}
	}

	public void setJetPlaneCoords(String weather) {
		switch (weather) {
			case "SUN":
							this.latitude += 10;
							this.height += 2;
							break;
			case "RAIN":
							this.latitude += 5;
							break;
			case "FOG":
							this.latitude += 1;
							break;
			case "SNOW":
							this.height -= 7;
							break;
		}
	}

	public void setHelicopterCoords(String weather) {
		switch (weather) {
			case "SUN":
							this.longitude += 10;
							this.height += 2;
							break;
			case "RAIN":
							this.longitude += 5;
							break;
			case "FOG":
							this.longitude += 1;
							break;
			case "SNOW":
							this.height -= 15;
							break;
		}
	}
}