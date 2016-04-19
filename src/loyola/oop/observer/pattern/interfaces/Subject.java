package loyola.oop.observer.pattern.interfaces;

public interface Subject {
	
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}