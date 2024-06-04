package polymorphism;

public class Student {
	
	public void SchoolStudent(Teacher TalkingWay)
	{
		System.out.println("Be Polite");
	}
	public void SchoolStudent(Friends TalkingWay)
	{
		System.out.println("Very jolly");
	}
	public void SchoolStudent(Parents Talkingway)
	{
		System.out.println("Very affection");
	}
	
	
	public static void main(String[] args) {
		Student s=new Student();
		Teacher t=new Teacher();
		s.SchoolStudent(t);
		Friends f=new Friends();
		s.SchoolStudent(f);
		Parents p=new Parents();
		s.SchoolStudent(p);

	}

}
