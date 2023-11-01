import java.util.ArrayList;

public class Fake_Database {
    private ArrayList<UserInfo> users = new ArrayList<>();
    private ArrayList<Connect> connections = new ArrayList<>();
    public void Add(UserInfo user) {
        users.add(user);
    }
    public Connect OpenConnect(UserInfo user) {
        for (Connect connection : connections) {
            if (connection.getUser().getID() == user.getID()) {
                return connection; // Reuse existing connection
            }
        }
        Connect newConnection = new Connect(user);
        connections.add(newConnection);

        return newConnection;
    }
    public UserInfo getUser(int ID) {
        for (UserInfo user : users) {
            if (user.getID() == ID) {
                return user;
            }
        }
        return null;
    }

}
