import java.util.ArrayList;
import java.util.List;

public class FitnessClub implements Club {
    List clients = new ArrayList();
    List promotions = new ArrayList();

    public FitnessClub() {
    }

    public void addClient() {
	clients.add();
    }

    public void removeClient() {
	clients.remove();
    }

    public Client getClientById(String id) {
	for (int i = 0; i < clients.size(); i++) {
	    if (clients.get(i).getId() == id)
		return(clients.get(i));
	}
	return(null);
    }

    public ArrayList<String> getClientsIds(String registrationDateFrom, String registrationDateTo) {
	
    }
}