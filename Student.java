package teacher;
//Student class implementing Person interface
class Student implements Person {
@Override
	public void speak() {
     System.out.println("I am a student.");
 }
public static void main(String [] args) 
{
	Student s=new Student();								//Object creating of Child class
	Teacher t=new Teacher();								//Object creating of Parent class
	t.speak();												//calling the parent class function which is override by interface name Person
	s.speak();												//calling the child class function 
}
}
