package com.varkovich.lesson_17.task_1.user_action;

import java.util.Scanner;

public class UserAction {

    public static String getOptionFromUser() {
        Scanner console = new Scanner(System.in);
        System.out.println("1 - reverse the line");
        System.out.println("2 - factorial calculation");
        System.out.print("Enter number of option -> ");
        return console.next();
    }
}
