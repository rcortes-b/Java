package me.rcortesb.avajlauncher.services;
import java.util.List;
import java.util.ArrayList;
import me.rcortesb.avajlauncher.utilitaries.Flyable;
import me.rcortesb.avajlauncher.models.Balloon;

public class Tower {
	private List<Flyable> observers = new ArrayList<>();

	public List<Flyable> getObservers() {
		return observers;
	}

	public void register(Flyable p_flyable) {
		this.observers.add(0, p_flyable);
		System.out.println("Tower says: " + p_flyable.getFullName() + " registered to weather tower.");
	}
	public void unregister(Flyable p_flyable) {
		this.observers.remove(p_flyable);
		System.out.println("Tower says: " + p_flyable.getFullName() + " unregistered from weather tower.");
	}
	protected void conditionChanged() {
		for (int i = observers.size() - 1; i >= 0; i--) {
			Flyable item = observers.get(i);
			item.updateConditions();
		}
		System.out.println("");
	}

}