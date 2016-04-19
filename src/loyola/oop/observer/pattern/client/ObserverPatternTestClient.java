package loyola.oop.observer.pattern.client;

import loyola.oop.observer.pattern.MagazineCompany;
import loyola.oop.observer.pattern.MagazineSubscriber;

public class ObserverPatternTestClient {

	public static void main(String[] args) {
		
		MagazineCompany forbes = new MagazineCompany();
		
		MagazineSubscriber subscriber1 = new MagazineSubscriber("Syeda Nowreen", forbes);
		MagazineSubscriber subscriber2 = new MagazineSubscriber("Maeesha Adnin", forbes);
		MagazineSubscriber subscriber3 = new MagazineSubscriber("Adiba Nuzhat", forbes);
		
		forbes.publishNewMagazine("January", 2016);
		forbes.publishNewMagazine("February", 2016);
		forbes.publishNewMagazine("March", 2016);
		
		subscriber2.unsubscribe();
		subscriber3.unsubscribe();
		
		forbes.publishNewMagazine("April", 2016);
		forbes.publishNewMagazine("May", 2016);
		forbes.publishNewMagazine("June", 2016);
		
	}

}
