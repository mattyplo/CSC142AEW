package Week1;

public class personClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an instance of the Person class we created and utilize each method.
		Person matthew = new Person("Matthew", 35);
		matthew.speak();
		
		matthew.setName("Mathias");
		matthew.setAge(25);
		
		matthew.speak();

		System.out.println(matthew.getAge());
		System.out.println(matthew.getName());
		
		// create an alias of the person class.
		Person mathew = matthew;
		mathew.speak();
		
		// change mathew's instance fields and show how matthew has also been changed, since they point to the same object
		mathew.setAge(30);
		mathew.setName("Mathew");
		matthew.speak();
		
	}

}
