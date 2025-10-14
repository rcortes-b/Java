package me.rcortesb.avajlauncher.services;
import java.lang.Math;
import me.rcortesb.avajlauncher.utilitaries.Coordinates;

public class WeatherProvider {
	private static WeatherProvider weatherProvider = new WeatherProvider();
	private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

	private WeatherProvider() {}
	public static WeatherProvider getWeatherProvider() {
		return weatherProvider;
	}
	public String getCurrentWeather(Coordinates p_coordinates) {
		int randomize = (int)(Math.random() * 4) * (p_coordinates.getLongitude() + p_coordinates.getLatitude()+ p_coordinates.getHeight());
		return (weather[randomize % 4]);
	}
}