package tutorial.one;


public class ClassOne extends Person{
	
	int eid,debt,salary;
	ClassOne(String name, int age , int eid,int debt,int salary){
		super(name,age);
		
		this.eid = eid;
		this.debt = debt;
		this.salary = salary;
		
	}
	public static void main(String args[]) {
		ClassOne ob = new ClassOne("Chicka",55,12211,111,1111);
	}
	
}
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	void displayStudent() {
		System.out.println(this.name+" " + this.age);
	}
}
