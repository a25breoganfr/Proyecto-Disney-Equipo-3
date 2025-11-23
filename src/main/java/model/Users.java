/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author dam2_alu25@inf.ald
 */
public class Users {

    private ArrayList<User> users;
    private final String FILE_NAME = "usuarios.txt";

    public Users() {
        this.users = new ArrayList<>();
        loadUsers(); 
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
        saveUserToFile(user); 
    }

    private void saveUserToFile(User user) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(user.getName() + ";" + user.getPassword());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadUsers() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return; 
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 2) {
                    User user = new User();
                    user.setName(data[0]);
                    user.setPassword(data[1]);
                    users.add(user);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean exists(String name) {
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean login(String name, String password) {
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(name) &&
                u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean registerUser(String name, String password, String confirmPassword) {

        if (exists(name))
            return false;

        if (!password.equals(confirmPassword))
            return false;

        User user = new User();
        user.setName(name);
        user.setPassword(password);

        addUser(user); 

        return true;
    }
}
