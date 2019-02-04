public class Student extends Person {
    private String[] bookRead;
    private Book[] borrowedBooks;

    public Student() {
	bookRead = new String[14242];
	borrowedBooks = new Book[14242];
    }

    public void addBook(Book book) {
	for (int i = 0; i < borrowedBooks.length; i++) {
	    if (borrowedBooks[i] == null) {
		this.borrowedBooks[i] = book;
		break;
	    }
	}
    }

    public void readBook(Book book) {
	for (int i = 0; i < bookRead.length; i++) {
            if (bookRead[i] == null) {
                this.bookRead[i] = book.getId();
                break;
            }
        }
    }

    public boolean hasRead(String id) {
	for (String t_id : bookRead) {
	    if (t_id == id && id != null)
		return(true);
	}
	return(false);
    }

    public void removeBook(String id) {
	for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i].getId() == id) {
                this.borrowedBooks[i] = null;
                break;
            }
        }
    }

    public Book returnBook(String id) {
	for (int i = 0; i < borrowedBooks.length; i++) {
	    if (id != null && borrowedBooks[i].getId() == id) {
		Book tmp = borrowedBooks[i];
		borrowedBooks[i] = null;
		return(tmp);
	    }
	}
	return(null);
    }
}