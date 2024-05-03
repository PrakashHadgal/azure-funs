package com.azure.funs.hello;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.azure.funs.model.Greeting;
import com.azure.funs.model.User;

@Component
public class Hello implements Function<User, Greeting> {

    @Override
    public Greeting apply(User user) {
        return new Greeting("Hello, " + user.getName() + "!\n");
    }
}