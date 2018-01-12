package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //User
        //X - Greet
        //X - Enter name
        //X - Enter current age
        //X - Enter current year
        //X - Output user name
        //X - Output age
        //X - Output current year
        //How old following year with assoc year
        //How old in 5 years with assoc year
        //How old in 10 years with assoc year

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "Hello, please enter your name:",
                "Please enter your age",
                "Please enter current year"
        };

        List<String> answers = new ArrayList<>();

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userEntry = sc.nextLine();
            answers.add(userEntry);

        }
            String ageString = answers.get(1);
            int age = Integer.parseInt(ageString);

            int followingYear = age + 1;
            int ageInFiveYears = age + 5;
            int ageInTenYears = age + 10;

            System.out.println(answers.get(0) + ", you are currently " + answers.get(1) + " years old.");
            System.out.println("In 2019, you will be " + followingYear + " years old.");
            System.out.println("In 2023, you will be " + ageInFiveYears + " years old.");
            System.out.println("In 2028, you will be " + ageInTenYears + " years old.");
        }
    }
