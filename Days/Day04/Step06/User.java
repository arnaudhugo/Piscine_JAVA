public class User implements ChatMessageListener {
    public User() {
    }

    public void onMessageReceived(String message, String username) {
	System.out.println("Message from " + username + ": " + message);
    }

    public void onBroadCastMessageReceived(String message, String username) {
	System.out.println("Broadcast message from " + username + ": " + message);
    }
}