public class Main {
    public static void main(String[] args) {
	Specialization s = new Specialization(123, "S1", "JAVA");
	Teacher t = new Teacher(0, "t_firstName", "t_lastname", "061234567",
				"teacher@gmail.com", s);

	Class c = new Class(t, 10, 1004);
	Student s1 = new Student(0,"s1_firstName", "s1_lastname", "0698745613",
				 "student1@gmail.com");
	Student s2 = new Student(0,"s2_firstName", "s2_lastname", "0656787567",
				 "student2@gmail.com");

	c.addStudent(s1);
	c.addStudent(s2);
	System.out.println(t.canGoToClass(c));
	t.teacherOf(c);
	System.out.println(t.getSpecialization().getId());
    }
}