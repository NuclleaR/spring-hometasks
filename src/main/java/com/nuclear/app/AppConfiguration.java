package com.nuclear.app;

import com.nuclear.app.dto.TestDto;
import com.nuclear.app.dto.TestDtoImpl;
import com.nuclear.app.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public UserInputService userInputService(){
        return new UserInputServiceImpl();
    }

    @Bean
    public UserService userService(UserInputService userInputService) {
        return new UserServiceImpl(userInputService);
    }

    @Bean
    public TestDto testDto() {
        return new TestDtoImpl();
    }

    @Bean
    public TestService testService(TestDto testDto) {
        return new TestServiceImpl(testDto);
    }
}
