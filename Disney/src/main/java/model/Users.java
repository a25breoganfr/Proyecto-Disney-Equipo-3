/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dam2_alu25@inf.ald
 */
public class Users {

    public ArrayList Users;

    public Users() {
    }

    public ArrayList getUsers() {
        return Users;
    }

    public void setUsers(ArrayList Users) {
        this.Users = Users;
    }

    public void addUser(User user) {
        this.Users.add(user);
    }

}
