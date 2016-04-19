I have implemented Observer pattern in this example of Magazine Company and its subscribers.

#Why
All Magazine subscribers want to get the copy of newly published magazine as soon as it comes out. 
Thats why I have used Observer pattern so that all the subscribers gets notified if any new version comes out.

#Implementation
Here MagazineCompany implements Subject interface and MagazineSubscriber implements Observer interface.
When a subscriber subscribes to the magazine company, it gets registered as an Observer and receives each published magazine. 
Any time subscriber can unsubscribe and then he/she will not receive newly published magazine any more.

ObserverPatternTestClient has the main method to test this pattern implementation.