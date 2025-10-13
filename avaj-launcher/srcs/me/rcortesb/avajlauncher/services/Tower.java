package me.rcortesb.avajlauncher.services;
import java.util.List;
import java.util.ArrayList;
import me.rcortesb.avajlauncher.utilitaries.Flyable;
import me.rcortesb.avajlauncher.models.Baloon;

public class Tower {
	private List<Flyable> observers = new ArrayList<>();

	public List<Flyable> getObservers() {
		return observers;
	}

	public void register(Flyable p_flyable) {
		this.observers.add(p_flyable);
		//System.out.println("Tower says: ");
		//System.out.println("TEMPORAL FLYABLE");
		//System.out.println(" registered to weather tower");
	}
	public void unregister(Flyable p_flyable) {
		observers.remove(p_flyable);
		System.out.println("Tower says: ");
		System.out.println("TEMPORAL FLYABLE");
		System.out.println(" unregistered from weather tower");
	}
	protected void conditionChanged() {
	}
}