package com.nuclear.app.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Integer> answers = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAnswer(int answer) {
        this.answers.add(answer);
    }

    public List<Integer> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
