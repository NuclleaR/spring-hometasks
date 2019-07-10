package com.nuclear.app.dto;

import java.util.List;

public interface TestDto {
    public List<String> getQuestionsFromDB();

    public List<Integer> getAnswersFromDB();
}
