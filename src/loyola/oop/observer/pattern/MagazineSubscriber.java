package loyola.oop.observer.pattern;

import loyola.oop.observer.pattern.interfaces.Observer;
import loyola.oop.observer.pattern.interfaces.Subject;

public class MagazineSubscriber implements Observer {
	
	private Subject magazineCompany;
	private String subscriberName;
	
	public MagazineSubscriber(String subscriberName, Subject magazineCompany) {
		this.subscriberName = subscriberName;
		this.magazineCompany = magazineCompany;
		magazineCompany.registerObserver(this);
	}

	@Override
	public void receiveRecentCopy(String monthOfPublication, int yearOfPublication) {
		System.out.println(subscriberName + " received Magazine for " + monthOfPublication + " " + yearOfPublication);
	}
	
	@Override
	public void unsubscribe() {
		magazineCompany.removeObserver(this);
	}

}
