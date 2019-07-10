package com.nuclear.app.service;

import com.nuclear.app.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserInputService userInputService;
    private User user;

    public UserServiceImpl(UserInputService userInputService) {
        this.userInputService = userInputService;
    }

    @Override
    public void registerNewUser() {
        String userName = userInputService.getUserName();
        this.user = new User(userName);
    }

    @Override
    public User getUser() {
        return this.user;
    }

    @Override
    public void addAnswer(int answer) {
        user.setAnswer(answer);
    }

    @Override
    public List<Integer> getAnswers() {
        return user.getAnswers();
    }


}
