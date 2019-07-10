package com.nuclear.app;

import com.nuclear.app.model.User;
import com.nuclear.app.service.TestService;
import com.nuclear.app.service.UserInputService;
import com.nuclear.app.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");

        UserService userService = (UserService) context.getBean("userService");

        UserInputService userInputService = (UserInputService) context.getBean("userInputService");

        TestService testService = (TestService) context.getBean("testService");

        userService.registerNewUser();

        User user = userService.getUser();

        System.out.println("Hello, " + user.getName() + "\n\n");

        List<String> questions = testService.getQuestions();

        for (String question : questions) {

            System.out.println(question);

            System.out.print("Your answer: ");
            int answer = userInputService.collectUserAnswer();

            userService.addAnswer(answer);

            System.out.println("\n");
        }

        System.out.println("Your result is: " + testService.getResult(userService.getAnswers()));
    }
}
