package com.nuclear.app.service;

import java.util.Scanner;

public class UserInputServiceImpl implements UserInputService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getUserName() {
        System.out.print("Enter your name: ");

        String username = scanner.next();

        System.out.println("\n");

        return username;
    }

    @Override
    public int collectUserAnswer() {
        return scanner.nextInt();
    }
}
