/* This little program will execute a short quiz which will take inputs and will output how many the user got correct.
I myself, feel like it can be much more improved but the fact that it works fine is good.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("Hello,\nThis is a small quiz which will test your general knowledge of Java.");
        System.out.println("\nPlease press ENTER to continue."); // Introduction to quiz.
        Scanner in = new Scanner(System.in);
        String enter = in.nextLine(); // String which will hold user input which will start the test if inputted right.
        while (enter != null) { // While loop, TRUE = will execute again until FALSE. User input is empty("ENTER").
            if (enter.isEmpty()) { // When user does press enter.
                System.out.println("Goodluck!\n");
            } else {
                System.out.println(enter + " is an invalid input. Press ENTER."); // Anything other than enter.
            }
            if (enter.isEmpty()) { // Execute quiz once user inputs the correct key.
                String q1 = "Who is the founder of the Java language?\n" + "A) James Gosling\n" + "B) Bjarne Stroustrup\n"
                        + "C) Brendan Eich\n";
                String a1 = "A";
                String q2 = "Which one is a primitive type of data?\n" + "A) Class\n" + "B) Arrays\n" + "C) Int\n" + "D) String\n";
                String a2 = "C";
                String q3 = "Who owns the license for the Java language?\n" + "A) Oracle\n" + "B) Microsoft\n" + "C) Apple\n"
                        + "D) Dell\n";
                String a3 = "A";
                String q4 = "Java is an _____ oriented program\n" + "A) Linked\n" + "B) Object\n" + "C) Pointer\n" + "D) Class\n";
                String a4 = "B";
                Questions[] question = { // Created an array which stores the questions and answers.
                        new Questions(q1, a1),
                        new Questions(q2, a2),
                        new Questions(q3, a3),
                        new Questions(q4, a4)
                };
                execute(question); // Starts the quiz.
                break;
            }
            if (in.hasNextLine()) {
                enter = in.nextLine(); // Will save the input as a new "enter".
            } else {
                enter = null;
            }
        }
    }

    public static void execute(Questions[] questions) { // Creates an array which will read each questions.
        int score = 0; // If the input is the same as the answer, the score will increment by 1.
        for (int i = 0; i < questions.length; i++) { // Classic for loop which will iterate through each question.
            Scanner input = new Scanner(System.in);
            System.out.print(questions[i].prompt);
            String answer = input.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("\nCongratulations!");
        System.out.println("\nYou got " + score + "/" + questions.length + " correct.");
    }
}

