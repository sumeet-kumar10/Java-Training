package visitorDesignPattern;

public class Test {
	public static void main(String[] args) {

		CountEveryThing counter = new CountEveryThing();

		Student student1 = new Student("ROHIT");
		Student student2 = new Student("SINGH");
		Student student3 = new Student("MEAW");
		CSE cseB = new CSE();
		cseB.addStudent(student1);
		cseB.addStudent(student2);
		cseB.addStudent(student3);
		cseB.accept(counter);
	}
}
