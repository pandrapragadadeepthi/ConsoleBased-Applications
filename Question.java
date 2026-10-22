package com.ConsoleBasedApp;

import java.util.Scanner;

public class Question {

    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int answer;

    Question(String question, String option1, String option2,
             String option3, String option4, int answer) {

        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    void display() {

        System.out.println("\n" + question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
    }
}

class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Question[] questions = {

                new Question(
                        "1. Which keyword is used to create an object in Java?",
                        "class",
                        "new",
                        "this",
                        "static",
                        2),

                new Question(
                        "2. Which collection stores duplicate elements?",
                        "HashSet",
                        "TreeSet",
                        "ArrayList",
                        "LinkedHashSet",
                        3),

                new Question(
                        "3. Which method is the entry point of Java?",
                        "start()",
                        "run()",
                        "main()",
                        "init()",
                        3),

                new Question(
                        "4. Which loop executes at least once?",
                        "for",
                        "while",
                        "do-while",
                        "foreach",
                        3),

                new Question(
                        "5. Which package contains Scanner class?",
                        "java.io",
                        "java.util",
                        "java.lang",
                        "java.sql",
                        2)

        };

        int score = 0;
        int choice;

        System.out.println("========== JAVA QUIZ APPLICATION ==========");

        for (Question q : questions) {

            q.display();

            System.out.print("Enter Your Answer : ");
            choice = sc.nextInt();

            if (choice == q.answer) {

                System.out.println("Correct Answer");
                score++;

            } else {

                System.out.println("Wrong Answer");
            }
        }

        System.out.println("\n========== RESULT ==========");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (questions.length - score));
        System.out.println("Score           : " + score + "/" + questions.length);

        if (score >= 3) {

            System.out.println("Result : PASS");

        } else {

            System.out.println("Result : FAIL");
        }

        sc.close();
    }
}
