package complexThreads;
import java.util.ArrayList;
import java.util.List;

class UserRepository {
    private List<String> users = new ArrayList<>();

    // Metode untuk menambahkan pengguna ke basis data
    public synchronized void addUser(String username) {
        System.out.println("Adding user: " + username);
        users.add(username);
    }

    // Metode untuk mendapatkan daftar pengguna dari basis data
    public synchronized List<String> getUsers() {
        System.out.println("Fetching users...");
        return new ArrayList<>(users);
    }
}


