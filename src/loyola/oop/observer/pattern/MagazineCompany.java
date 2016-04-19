package loyola.oop.observer.pattern;

import java.util.ArrayList;
import java.util.List;

import loyola.oop.observer.pattern.interfaces.Observer;
import loyola.oop.observer.pattern.interfaces.Subject;

public class MagazineCompany implements Subject {
	
	private List<Observer> observers;
	private String monthOfPublication;
	private int yearOfPublication;
	
	public MagazineCompany() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.receiveRecentCopy(monthOfPublication, yearOfPublication);
		}
	}
	
	public void publishNewMagazine(String monthOfPublication, int yearOfPublication) {
		this.monthOfPublication = monthOfPublication;
		this.yearOfPublication = yearOfPublication;
		System.out.println("\nPublished new magazine for " + this.monthOfPublication + " " + this.yearOfPublication);
		notifyObservers();
	}

}
