package Week2;

public class SomeClassClient {

	public static void main(String[] args) {
	
		// We will create an object, which is an instance of a class
		// this new keyword followed by the SomeClass() is using our constructor method.  
		SomeClass instanceOfSomeClass = new SomeClass();
		
		// Here we will set the state of our SomeClass object with our set methods
		// We will follow that up with revealing the state of our SomeClass object with our get methods
		instanceOfSomeClass.setVar1("Some Value");
		System.out.println(instanceOfSomeClass.getVar1());
		instanceOfSomeClass.setVar2(33);
		System.out.println(instanceOfSomeClass.getVar2());
		instanceOfSomeClass.setVar3(false);
		System.out.println(instanceOfSomeClass.getVar3());
		
		// Here we will show that we can access a public reference variable
		// Note, this is something we DO NOT want to do.
		instanceOfSomeClass.pubRefVar = "Do not make reference Variables public!";
		System.out.println(instanceOfSomeClass.getPublicVar());
	}

}
