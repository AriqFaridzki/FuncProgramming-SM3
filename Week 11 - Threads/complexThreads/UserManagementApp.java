package complexThreads;
import complexThreads.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserManagementApp {
    public static void main(String[] args) {
        // Membuat objek repository untuk menyimpan pengguna
        UserRepository userRepository = new UserRepository();

        // Membuat thread untuk menambahkan pengguna
        Thread addUserThread = new Thread( () -> {
            for (int i = 1; i <= 5; i++) {
                String username = "User" + i;
                userRepository.addUser(username);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Membuat thread untuk mendapatkan daftar pengguna
        Thread getUsersThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                List<String> users = userRepository.getUsers();
                System.out.println("User List: " + users);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Memulai eksekusi kedua thread
        addUserThread.start();
        getUsersThread.start();
    }
}