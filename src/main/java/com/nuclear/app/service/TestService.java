package com.nuclear.app.service;

import java.util.List;

public interface TestService {

    public List<String> getQuestions();

    public List<Integer> getAnswers();

    public void setAnswerToUser();

    public int getResult(List<Integer> userAnswers);
}
