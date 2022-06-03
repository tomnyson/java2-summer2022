/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import dto.Account;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author tomnyson
 */
public class QLAccount {

    private ArrayList<Account> listAccount;

    public QLAccount(ArrayList<Account> listAccount) {
        this.listAccount = listAccount;
    }

    public QLAccount() {
        this.listAccount = new ArrayList<>();
        listAccount.add(new Account("admin", "123456", "admin"));
        listAccount.add(new Account("user", "123456", "user"));
    }

    public ArrayList<Account> getAll() {
        return listAccount;
    }

    public Account login(String username, String password) {
        for (Account current : listAccount) {
            if (current.getUsername().equals(username)
                    && current.getPassword().equals(password)) {
                return current;
            }
        }
        return null;
    }

}
