public class Main {
    public static void main(String[] args) {
	Library library = new Library(nbBooks);

	Author author = new Author(10);
	author.setFirstname("Jules");
	author.setLastname("Verne");

	Book b = new Book("1");
	b.setTitle("b");
	b.setAuthor(author);
	library.addBook(b);

	System.out.println("Library has " + library.countBooks() + " books");
	Book bb1 = library.borrowBook(b.getTitle());
	System.out.println("Library has " + library.countBooks() + " books");
	library.returnBook(bb1);
	System.out.println("Library has " + library.countBooks() + " books");
    }
}