public class Main {
    public static void main(String[] args) {
	User user = new User();
	user.onBroadCastMessageReceived("Hello player!", "server");
    }
}