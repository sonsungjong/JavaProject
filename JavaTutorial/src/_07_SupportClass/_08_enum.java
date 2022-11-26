package _07_SupportClass;

import _07_SupportClass.Student1.SchoolType;

public class _08_enum {
	public static void main(String[] args) {
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		Student1 st2 = new Student1(SchoolType.UNIVERSITY);
		
		if(st1.school == SchoolType.ELEMENTARY) {
			System.out.println("초등학생");
		}
		
		SchoolType[] schools = SchoolType.values();
		for(SchoolType school : schools) {
			System.out.println(school + ":" + school.ordinal());
		}
	}
}
class Student1{
	enum SchoolType{
		ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
	}
	
	SchoolType school;
	public Student1(SchoolType school) {
		this.school = school;
	}
}