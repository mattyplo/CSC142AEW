package Week2;

public class SomeClass {

	// Here we have our reference variables
	// Notice that our reference variables can be referenced anywhere inside of the class
	private String refVar1;
	private int refVar2;
	private boolean refVar3;
	// Here is a no-no.  We don't ever really want to have a public reference variable
	// this is to show that it is possible, but this IS NOT somethind you want to do.
	public String pubRefVar;
	
	// The constructor.  The constructor does not have a return type, which makes it obvious that it's the constuctor
	public SomeClass() {
		
	}
	
	// Here we have our behaviors, getters, setters, and modifiers.
	public void setVar1(String newVal1) {
		// Notice the newVal1 has a scope only as far as this method is concerned.
		// trying to reference the newVal1 variable outside of this method results in an error.
		refVar1 = newVal1;
	}
	
	public void setVar2(int newVal2) {
		// Notice here that refVar2 is reference the refVar2 of the Class, 
		// The scope of refVar2 is wider than that of simply the method.
		refVar2 = newVal2;
	}
	
	public void setVar3(boolean newVal3) {
		refVar3 = newVal3;
	}
	
	public String getPublicVar() {
		return pubRefVar;
	}
	
	public String getVar1() {
		return refVar1;
	}
	
	public int getVar2() {
		return refVar2;
	}
	
	public boolean getVar3() {
		return refVar3;
	}
	
}
