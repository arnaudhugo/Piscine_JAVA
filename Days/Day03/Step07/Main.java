public class Main {
    public static void main(String[] args) {
	Author author = new Author(10);
	author.setFirstname("Jules");
	author.setLastname("Verne");

	Book b = new Book("1");
	b.setTitle("Vingt mille lieues sous les mers");
	b.setAuthor(author);

	Student student = new Student();
	student.setFirstname("Agathe");

	student.addBook(b);

	//String bookId = b.getId();
	String bookId = null;
	System.out.println("Has read: " + student.hasRead(bookId));
	student.readBook(b);
	System.out.println("Has read: " + student.hasRead(bookId));
	Book bb1r = student.returnBook(bookId);
	System.out.println(bb1r.getTitle());
    }
}