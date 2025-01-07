package com.company;
import java.util.Scanner;
import java.util.Random;

public class rps {
    public static void main(String[] args){
    int wordNumber;
    Random random = new Random();
    wordNumber = random.nextInt(3) + 1;
    String computerChoice = "";

        if (wordNumber == 1) {
            computerChoice = "rock";

        } else if (wordNumber == 2) {
            computerChoice = "paper";
        } else if (wordNumber == 3) {
            computerChoice = "scissors";
        }
        System.out.println("Select a number from the following:\n 1.Rock\n2.Paper\n3.Scissors\n");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String userChoice = "";

        if (a == 1) {
            userChoice = "rock";

        } else if (a == 2) {
            userChoice = "paper";
        }
        else if (a == 3) {
            userChoice = "scissors";
        }
        System.out.println("You Chose: "+userChoice);
        System.out.println("computer chose: "+computerChoice);

        String winner = "No Winner";
        String rockmsg = "Rock beats scissors!";
        String papermsg = "Paper beats rock!";
        String scissormsg = "scissor beats paper!";
        
        if (computerChoice.equals(userChoice) ) {
            System.out.println("Tie!");
            System.out.println(winner);}
        
        if (computerChoice.equals("rock") && userChoice.equals("scissors")) {
            winner = "computer wins!";
            System.out.println(rockmsg);
            System.out.println(winner);}
        else if (computerChoice.equals("scissors") && userChoice.equals("rock")) {
            winner = "User Wins!";
            System.out.println(rockmsg);
            System.out.println(winner);}


        if (computerChoice.equals("rock") && userChoice.equals("paper")){
            winner = "User Wins!";
        System.out.println(papermsg);
        System.out.println(winner);}
        else if (computerChoice.equals("paper") && userChoice.equals("rock")) {
            winner = "Computer Wins!";
            System.out.println(papermsg);
            System.out.println(winner);}

        if (computerChoice.equals("scissors") && userChoice.equals("paper")){
            winner = "computer Wins!";
            System.out.println(scissormsg);
            System.out.println(winner);}
        else if (computerChoice.equals("paper") && userChoice.equals("scissors")) {
            winner = "User Wins!";
            System.out.println(scissormsg);
            System.out.println(winner);}


    }
    }
