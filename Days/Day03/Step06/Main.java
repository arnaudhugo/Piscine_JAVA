public class Main {
    public static void main(String[] args) {
	Author author = new Author(10);
	author.setFirstname("Jules");
	author.setLastname("Verne");
	System.out.println(author.getFirstname());
	System.out.println(author.getLastname());
    }
}