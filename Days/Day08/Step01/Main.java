public class Main {
    public static void main(String[] args) {
	User user = new User.UserBuilder("peterparker").setAge(26).setEmail("peterparker@example.com").build();
	System.out.println(user.getUsername());
    }
}