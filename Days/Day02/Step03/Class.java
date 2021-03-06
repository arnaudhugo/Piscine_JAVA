public class Class {
    private int classRoomNumber;
    private int numberOfStudents;
    Teacher teacher;
    Student[] tab; 

    public Class() {
    }

    public Class(Teacher teacher, int numberOfStudents, int classRoomNumber) {
	this.teacher = teacher;
	this.classRoomNumber = classRoomNumber;
	this.numberOfStudents = numberOfStudents;
	tab = new Student [numberOfStudents - 1];
    }

    public int countStudents() {
	int count = 0;

	for (int i = 0; i < tab.length; i++) {
	    if (tab[i] != null)
		count++;
	}
	return(count);
    }

    public boolean isFull() {
	if (countStudents() == numberOfStudents)
	    return(true);
	else
	    return(false);
    }

    public boolean hasTeacher() {
	if (teacher == null)
	    return(false);
	else
	    return(true);
    }

    public boolean addStudent(Student s) {
	for (int i = 0; i < tab.length; i++) {
	    if (tab[i] == null) {
		this.tab[i] = s;
		return(true);
	    }
	}
	return(false);
    }
}