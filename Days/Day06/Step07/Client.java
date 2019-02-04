import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client extends Person {
    LocalDate registrationDate;
    private String id;

    public Client() {
    }

    public Client(String firstName, String lastName, String registrationDate) {
	super(firstName, lastName);
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	this.registrationDate = LocalDate.parse(registrationDate, dateTimeFormatter);
    }

    public LocalDate getRegistrationDate() {
	return(this.registrationDate);
    }

    public String getId() {
	return(this.id);
    }

    public void setId(String id) {
	this.id = id;
    }
}