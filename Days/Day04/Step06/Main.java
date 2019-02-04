public class Main {
    public static void main(String[] args) {
	MessagesServer messagesServer = new MessagesServer();
	User playerOne = new User();
	//users.add(playerOne);
	messagesServer.addUser(playerOne);
	messagesServer.sendBroadCastMessage("Hello everybody!!");
    }
}