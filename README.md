# Java
This a compilation of the three Java projects of the 42 Outter Core


Lenguaje Gráfico Estándar:
	UML es un lenguaje gráfico de propósito general que proporciona una notación estándar para visualizar el diseño de sistemas de software complejos

Observer, Singleton and Factory design patterns:
	- Observer:
		The Observer Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, called observers, and notifies them of any state changes. This pattern is useful for implementing distributed event-handling systems.

	- Singleton:
		The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.
		Only one instance by class. This means that there will be only one instance per programm so you won't be able to create many instances of the class. it is protected by a getter.

	- Factory:
		The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This pattern promotes loose coupling and enhances code scalability.
		You define an interface which will "implement" the subclasses and these will do their own implementation of the method.

Java Naming Convention:

	using domain name + app name + dirs name
	i.e --> me.rcortesb.avajlauncher

	me/rcortes/avajlauncher/
├── Main.java               // entry point
├── models/
│   ├── Aircraft.java
│   └── Helicopter.java
├── services/
│   ├── WeatherTower.java
│   └── SimulationService.java
├── utils/
│   └── Parser.java
└── exceptions/
    └── InvalidFileException.java


How did i manage the avaj-launcher testing:
	- Test for bad input
	- Test for changeWeather with the start values of aircraft + expected final value. If the changeWeather ran 5 times, and it SUN, SNOW,... i expect it to be "x".
	- Test for each line, look for its full name, and the condition. Something like a key/value but checking that its randomWeather generated is respected

***Maybe create a new branch called testing-branch