package com.varkovich.lesson_17.task_1.opration;

import com.varkovich.lesson_17.task_1.func_interface.MyFuncInterface;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DataOperation {


    public static int execute(int value) {
        MyFuncInterface<Integer> myFuncInterface;

        myFuncInterface = (k) -> {
            int result = 1;
            for (int i = 1; i <= k; i++) {
                result *= i;
            }

            return result;
        };

        return myFuncInterface.execute(value);
    }

    public static String execute(String value) {
        MyFuncInterface<String> myFuncInterface;

        myFuncInterface = (k) -> {
            String[] valueArr = (k.split(""));
            String temp = "";

            for (int i = 0; i < valueArr.length / 2; i++) {
                temp = valueArr[i];
                valueArr[i] = valueArr[valueArr.length - 1 - i];
                valueArr[valueArr.length - 1 - i] = temp;
            }

            return Arrays.stream(valueArr)
                    .collect(Collectors.joining());
        };

        return myFuncInterface.execute(value);
    }
}
