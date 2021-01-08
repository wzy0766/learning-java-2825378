import java.util.Scanner;

import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemRegister;

public class Main {

    public static void main(String args[]) {
        String question = "What is the result of one plus one?";
        String choiceOne = "Zero";
        String choiceTwo = "One";
        String choiceThree = "Two";

        String correctAnswer = choiceThree;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");
        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        String userinput = input.next();
        // Retrieve the user's input
        System.out.println("Your choice is: " + userinput);

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (userinput.equals(correctAnswer)) {
            System.out.println("You are correct! ");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println("You are incorrect! The correct answer is " + choiceThree + ".");
        }
    }

}
