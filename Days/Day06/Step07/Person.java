import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    public Person() {
    }

    public Person(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    public String getFirstName() {
	return(this.firstName);
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return(this.lastName);
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public LocalDate getBirthday() {
	return(this.birthday);
    }
    
    public void setBirthday(String birthday) {
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	this.birthday = LocalDate.parse(birthday, dateTimeFormatter);
    }

    public void showBirthday() {
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(getBirthday().format(dateTimeFormatter));
    }
}