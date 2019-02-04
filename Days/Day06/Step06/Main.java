public class Main {
    public static void main(String[] args) {
	Person person = new Person("John", "Stewart");
	System.out.println(person.getFirstName());
	person.setBirthday("10-02-1993");
	person.showBirthday();
    }
}