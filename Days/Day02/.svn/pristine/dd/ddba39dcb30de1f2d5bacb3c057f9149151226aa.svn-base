public class Teacher extends Person {
    private Specialization specialization;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, String phone, String email, Specialization specialization) {
	super(id, firstName, lastName, phone, email);
	this.specialization = specialization;
    }

    public Specialization getSpecialization() {
	return(this.specialization);
    }

    public Specialization setSpecialization(Specialization specialization) {
	this.specialization = specialization;
	return(specialization);
    }

    public String toString() {
	return("Teacher: " + this.firstName + " " + this.lastName + ". email: " + this.email + ", phone: " + this.phone);
    }
    
    public boolean canGoToClass(Class c) {
	if (c.hasTeacher() && c.teacher != this)
	    return(false);
	else
	    return(true);
    }

    public void teacherOf(Class c) {
	System.out.println(toString());
	for (Student s : c.tab) {
	    if (s != null)
		System.out.println(s);
	}
    }
}