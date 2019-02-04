public class Author extends Person {
    String[] tab;

    public Author(int maxBooks) {
	tab = new String[maxBooks];
    }

    public void addBook(String id) {
	for (int i = 0; i < tab.length; i++) {
	    if (tab[i] == null) {
		this.tab[i] = id;
		break;
	    }
	}
    }
}