package com.varkovich.lesson_17.task_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Получить день недели по дате
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a date in following format DD.MM.YYYY -> ");
        String inputDate = console.next();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate localDate = LocalDate.parse(inputDate, formatter);

            System.out.println("Day of week ->  " + localDate.getDayOfWeek());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        }

    }
}
