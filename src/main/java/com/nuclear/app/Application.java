package com.nuclear.app;

import com.nuclear.app.model.User;
import com.nuclear.app.service.TestService;
import com.nuclear.app.service.UserInputService;
import com.nuclear.app.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfiguration.class);
        context.refresh();

        UserService userService = context.getBean(UserService.class);

        UserInputService userInputService = context.getBean(UserInputService.class);

        TestService testService = context.getBean(TestService.class);

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
