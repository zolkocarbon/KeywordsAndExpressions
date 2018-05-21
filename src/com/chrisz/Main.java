package com.chrisz;

public class Main {

    public static void main(String[] args) {

        // ************* KEYWORDS ******************
        // examples include int, double, if, true
        // list of keywords https://en.wikipedia.org/wiki/List_of_Java_keywords

        // ************* EXPRESSIONS ***************
        // a mile is equal to 1.609322 km
        double kilometeres = (100 * 1.609344); // everything after double is an expression (minus the semicolon)

        int highScore = 50; //everything after int is an expression (minus the semicolon)
        if (highScore == 50) { //everything inside brackets is an expression
            System.out.println("This is an expression");
        }

        // ************ STATEMENTS ******************
        int myVariable = 50; //entire line is statement
        myVariable++; //same
        System.out.println("This is a test"); //same

        // *********** CODE BLOCKS *******************
        // code block is {}
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000) { // can get rid of {} if only one line is below statement
            System.out.println("Your score was 5000");
        }

        if(score < 5000 && score > 1000) { // can get rid of {} if only one line is below statement
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Your score was greater equal to or greater than 5000");
        }

        // Scope issue
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
      //  int savedFinalScore = finalScore; //out of scope, finalScore undefined outside of code block

        // Challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was " + finalScore);
        }
    }
}
