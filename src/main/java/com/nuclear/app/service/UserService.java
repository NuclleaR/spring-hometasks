package com.nuclear.app.service;

import com.nuclear.app.model.User;

import java.util.List;

public interface UserService {

    public void registerNewUser();

    public User getUser();

    public void addAnswer(int answer);

    public List<Integer> getAnswers();
}
