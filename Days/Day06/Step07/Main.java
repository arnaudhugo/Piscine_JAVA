public class Main {
    public static void main(String[] args) {
	Client client1 = new Client("c_1_name", "c_1_lastname", "02-02-2019");
	client1.setBirthday("10-04-1993");
	client1.setId("id1");

	club.addClient(client1);

	Client returnedClient = club.getClientById("id1");

	System.out.println(returnedClient.getFirstName());
	System.out.println(returnedClient.getLastName());
	returnedClient.showBirthday();
    }
}