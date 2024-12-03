package com.varkovich.lesson_17.task_1;


import com.varkovich.lesson_17.task_1.opration.DataOperation;
import com.varkovich.lesson_17.task_1.user_action.UserAction;

public class ApplicationRunner {

    public static void main(String[] args) {
        String option = UserAction.getOptionFromUser();

        System.out.println("Result-> " +
                (option.equals("1") ? DataOperation.execute("Hello world") : DataOperation.execute(5))
        );
    }
}
