package com.nuclear.app.dto;

import java.util.Arrays;
import java.util.List;

public class TestDtoImpl implements TestDto {
    @Override
    public List<String> getQuestionsFromDB() {
        return Arrays.asList(
            "Question 1\n1. Answer 1\n2. Answer 2\n3. Answer 3\n",
            "Question 2\n1. Answer 1\n2. Answer 2\n3. Answer 3\n",
            "Question 3\n1. Answer 1\n2. Answer 2\n3. Answer 3\n",
            "Question 4\n1. Answer 1\n2. Answer 2\n3. Answer 3\n",
            "Question 5\n1. Answer 1\n2. Answer 2\n3. Answer 3\n"
        );
    }

    @Override
    public List<Integer> getAnswersFromDB() {
        return Arrays.asList(1, 3, 2, 2, 4);
    }
}
