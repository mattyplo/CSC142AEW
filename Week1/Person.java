package Week1;
/**
 * A simple model of a person
 * @author CSC 142
 *
 */
public class Person {
	// instance fields:
	// declaration format: 
	// access modifier (e.g. private) type (e.g int) name (e.g. age);
	// a person is defined by a name 
	// and and age
	private int age;
	private String name;
	
	// scope of a variable: where the variable can be used in code
	// for an instance field:
	// it can be used anywhere within its class
	// and possibly outside its class if labeled public
	// However, if private, it is available in the class only
	
	// Constructor: code that creates an object (= instantiates the class)
	// name of the constructor = name of the class
	/**
	 * Constructs a Person given a name and an age
	 * @param n the name of the Person
	 * @param a the age of the Person
	 */
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	// instance methods: behaviors of the object
	// method declaration: 
	// access modifier (public or private) + return type + method name + 
	// parameter list (between parentheses)
	// void means that the method doesn't return a value
	/**
	 * Prints the name and the age of the Person
	 */
	public void speak() {
		// + between Strings means concatenation
		System.out.println("My name is " + name + ". My age is " + age + ".");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
