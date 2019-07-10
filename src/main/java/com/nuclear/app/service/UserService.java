package com.nuclear.app.service;

import com.nuclear.app.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public interface UserService {

    public void registerNewUser();

    public User getUser();

    public void addAnswer(int answer);

    public List<Integer> getAnswers();
}
