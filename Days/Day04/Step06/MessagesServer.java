import java.util.ArrayList;
import java.util.List;

public class MessagesServer implements PushNotificationsAPI {
    private List<User> users = new ArrayList<>();

    public MessagesServer() {
    }

    public void addUser(User user) {
	users.add(user);
    }

    public void removeUser(User user) {
	users.remove(user);
    }

    public void sendBroadCastMessage(String message) {
	for (User u : users) {
	    u.onBroadCastMessageReceived(message, "Server");
	}
    }
}