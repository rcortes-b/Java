package me.rcortesb.avajlauncher.utilitaries;
import me.rcortesb.avajlauncher.services.WeatherTower;

public abstract class Flyable {
	protected WeatherTower weatherTower;

	public abstract void updateConditions();

	public void registerTower(WeatherTower p_tower) {
		this.weatherTower = p_tower;
		this.weatherTower.register(this);
	}

	//Debug mode
	public abstract void listFlyableData();
}