public class Student extends Person {
    public Student() {
    }

    public Student(int id, String firstName, String lastName, String phone, String email) {
	super(id, firstName, lastName, phone, email);
    }

    public String toString() {
	return("Student: " + this.firstName + " " + this.lastName + ". email: " + this.email + ", phone: " + this.phone);
    }
    
    public boolean canGoToClass(Class c) {
	if (c.isFull())
	    return(false);
	else
	    return(true);
    }
}