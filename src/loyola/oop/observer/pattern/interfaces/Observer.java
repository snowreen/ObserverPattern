package loyola.oop.observer.pattern.interfaces;

public interface Observer {
	public void receiveRecentCopy(String monthOfPublication, int yearOfPublication);
	public void unsubscribe();
}
