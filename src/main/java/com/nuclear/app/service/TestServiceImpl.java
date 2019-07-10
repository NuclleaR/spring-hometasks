package com.nuclear.app.service;

import com.nuclear.app.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TestService")
public class TestServiceImpl implements TestService {

    private final TestDto testDto;

    @Autowired
    public TestServiceImpl(TestDto testDto) {
        this.testDto = testDto;
    }

    @Override
    public List<String> getQuestions() {
        return testDto.getQuestionsFromDB();
    }

    @Override
    public List<Integer> getAnswers() {
        return testDto.getAnswersFromDB();
    }

    @Override
    public void setAnswerToUser() {

    }

    @Override
    public int getResult(List<Integer> userAnswers) {
        int result = 0;
        List<Integer> answers = this.getAnswers();

        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i) == userAnswers.get(i)) {
                result++;
            }
        }

        return result;
    }
}
