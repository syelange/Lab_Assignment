package teacher;
//Teacher class implementing Person interface
class Teacher implements Person {
 @Override
 public void speak() {
     System.out.println("I am a teacher.");
 }
}