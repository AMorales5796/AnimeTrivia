import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
      //Welcoming the user to the game. Giving a short description of the game
      System.out.println("WELCOME TO ANIME TRIVIA");
      System.out.println("This trivia has a total of 3 rounds, each with 4 questions about anime. To start the game please press 0");
      Scanner keyboard = new Scanner(System.in);
      int startUp = keyboard.nextInt();
      while(startUp != 0)
      {
        System.out.println("Sorry that input is invalid. Please enter 0 to start the game.");
        startUp = keyboard.nextInt();
      }
      //HIGH LOW GUESSING GAME ROUND
      System.out.println("Okay! Lets start the High Low guessing game round.");
          int correctCount = 0;// this is the initalized counter
                               // counts how many questions user gets correct
          // Creating the questions for the HighLow round
          HighLow someQuestion = new HighLow("", 0, 0, 0,0);
          HighLow question1 = new HighLow("1) How many Sailor guardians are there to be known?", 41, 0, 0,0);
          HighLow question2 = new HighLow("2) How many seasons of Bleach are there?", 16, 0, 0,0);
          HighLow question3 = new HighLow("3) How many seasons are there in My Hero Academia?", 3, 0, 0,0);
          HighLow question4 = new HighLow("4) How many seasons are there in Fairy Tail?", 9, 0, 0,0);
            
          System.out.println(question1.getQuestion()); // prompting the question
          for (int a = 0; a <= 3; a++) // the user only gets limited chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            question1.setGuess(scanner.nextInt());
                if (question1.getGuess() < question1.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(a == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Too low, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else if (question1.getGuess() > question1.getCorrectAnswer()) // to check if the guess is higher than the correct answer
                { 
                  if(a == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Too high, please try again"); // this lets the user know that their answer was too high
                  }
                }
                else // if user guesses the correct answer then lines 37 - 39 execute
                {
                    System.out.println("Correct, the answer was " + question1.getCorrectAnswer());
                    correctCount++;
                    a = 4; // setting a more than 3 so the question is not prompt again. since the user could guess it correctly within the 1st or 2nd try
                }
          }
          System.out.println(question2.getQuestion()); // prompting the question
          for (int b = 0; b <= 3; b++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            question2.setGuess(scanner.nextInt());
                if (question2.getGuess() < question2.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(b == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Too low, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else if (question2.getGuess() > question2.getCorrectAnswer()) // to check if the guess is higher than the correct answer
                { 
                  if(b == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Too high, please try again"); // this lets the user know that their answer was too high
                  }
                }
                else 
                {
                    System.out.println("Correct, the answer was " + question2.getCorrectAnswer());
                    correctCount++;
                    b = 4;
                }
          }
          System.out.println(question3.getQuestion()); // prompting the question
          for (int c = 0; c <= 3; c++) // the user only gets limited chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            question3.setGuess(scanner.nextInt());
                if (question3.getGuess() < question3.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(c == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Too low, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else if (question3.getGuess() > question3.getCorrectAnswer()) // to check if the guess is higher than the correct answer
                { 
                  if(c == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Too high, please try again"); // this lets the user know that their answer was too high
                  }
                }
                else 
                {
                    System.out.println("Correct, the answer was " + question3.getCorrectAnswer());
                    correctCount++;
                    c = 4;
                }
          }
          System.out.println(question4.getQuestion()); // prompting the question
          for (int d = 0; d <= 3; d++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            question4.setGuess(scanner.nextInt());
                if (question4.getGuess() < question4.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(d == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Too low, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else if (question4.getGuess() > question4.getCorrectAnswer()) // to check if the guess is higher than the correct answer
                { 
                  if(d == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Too high, please try again"); // this lets the user know that their answer was too high
                  }
                }
                else 
                {
                    System.out.println("Correct, the answer was " + question4.getCorrectAnswer());
                    correctCount++;
                    question4.setCountCorrect(correctCount);
                    d = 4;
                }
          }
        int comp1 = question4.compareTo(someQuestion);
        if (comp1 == -1)
        {
           System.out.println("Awe man. Better luck next time.");
        }
        else if (comp1 == 1)
        {
            System.out.println("Good job you got them all correct.");
        }
        else
        {
                System.out.println("Good job. You got some correct");
        }

          // Creating questions for the True or False round
        TrueOrFalse someTOFQuestion = new TrueOrFalse("",0,0,0,0);
        TrueOrFalse questionTOF1 = new TrueOrFalse("1) Natsu gets motionsickness. True (1) or False (2)", 1, 0, 0,0);
        TrueOrFalse questionTOF2 = new TrueOrFalse("2) Luna from Sailor Moon is a dog. True (1) or False (2)", 2, 0, 0,0);
        TrueOrFalse questionTOF3 = new TrueOrFalse("3) Deku eats All Might's hair to gain powers. True (1) or False (2)", 1, 0, 0,0);
        TrueOrFalse questionTOF4 = new TrueOrFalse("4) Haruhi Fujioka from Ouran Highschool is male. True (1) or False (2)", 2, 0, 0,0);
        System.out.println(questionTOF1.getQuestion()); // prompting the question
          for (int e = 0; e <= 3; e++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            questionTOF1.setGuess(scanner.nextInt());

                if (questionTOF1.getGuess() != questionTOF1.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(e == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Incorrect, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else 
                {
                  System.out.println("Correct, the answer was true");
                  correctCount++;
                  e = 4;
                }
          }
          System.out.println(questionTOF2.getQuestion()); // prompting the question
          for (int f = 0; f <= 3; f++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            questionTOF2.setGuess(scanner.nextInt());

                if (questionTOF2.getGuess() != questionTOF2.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(f == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Incorrect, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else 
                {
                  System.out.println("Correct, the answer was false");
                  correctCount++;
                  f = 4;
                }
          }
          System.out.println(questionTOF3.getQuestion()); // prompting the question
          for (int g = 0; g <= 3; g++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            questionTOF3.setGuess(scanner.nextInt());

                if (questionTOF3.getGuess() != questionTOF3.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(g == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Incorrect, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else 
                {
                  System.out.println("Correct, the answer was true");
                  correctCount++;
                  g = 4;
                }
          }
          System.out.println(questionTOF4.getQuestion()); // prompting the question
          for (int h = 0; h <= 3; h++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            questionTOF4.setGuess(scanner.nextInt());

                if (questionTOF4.getGuess() != questionTOF4.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(h == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Incorrect, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else 
                {
                  System.out.println("Correct, the answer was false");
                  correctCount++;
                  questionTOF4.setCountCorrect(correctCount);
                  h = 4;
                }
          }
        int comp2 = questionTOF4.compareTo(someTOFQuestion);
        if (comp2 == -1)
        {
           System.out.println("Awe man. Better luck next time.");
        }
        else if (comp2 == 1)
        {
            System.out.println("Good job you got them all correct.");
        }
        else
        {
                System.out.println("Good job. You got some correct");
        }
          // Creating questions for the Multiple Choice round
        MultipleChoice someMQuestion = new MultipleChoice("",0,0,0,0);
        MultipleChoice questionM1 = new MultipleChoice("1) What is Atsuko Kagari's (from Little Witch Academia) magical weapon? (1) Wand of Elysdat (2) Shiny Rod (3) Rylai's Crystal Scepter (4) Staff of Chariot", 2, 0, 0,0);
        MultipleChoice questionM2 = new MultipleChoice("2) What is Happy (from Fairy Tail)? (1) Just a cat (2) A blue cat (3) A magical cat (4) Exceed", 4, 0, 0,0);
        MultipleChoice questionM3 = new MultipleChoice("3) What does Deku want to become? (1) #1 Villan (2) #1 Hero (3) An entrepreneur (4) Strongest man alive", 2, 0, 0,0);
        MultipleChoice questionM4 = new MultipleChoice("4) What is Sasuke and Sakura's daughter's name? (1) Sarada Uchiha (2) Sarah Uchiha (3) Sarada Uchiiha (4) Sarah Uchiiha ", 1, 0, 0,0);
        System.out.println(questionM1.getQuestion()); // prompting the question
          for (int i = 0; i <= 3; i++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            questionM1.setGuess(scanner.nextInt());

                if (questionM1.getGuess() != questionM1.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(i == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Incorrect, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else 
                {
                  System.out.println("Correct, the answer was 2");
                  correctCount++;
                  i = 4;
                }
          }
          System.out.println(questionM2.getQuestion()); // prompting the question
          for (int j = 0; j <= 3; j++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            questionM2.setGuess(scanner.nextInt());

                if (questionM2.getGuess() != questionM2.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(j == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Incorrect, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else 
                {
                  System.out.println("Correct, the answer was 4");
                  correctCount++;
                  j = 4;
                }
          }
          System.out.println(questionM3.getQuestion()); // prompting the question
          for (int k = 0; k <= 3; k++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            questionM3.setGuess(scanner.nextInt());

                if (questionM3.getGuess() != questionM3.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(k == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Incorrect, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else 
                {
                  System.out.println("Correct, the answer was 2");
                  correctCount++;
                  k = 4;
                }
          }
          System.out.println(questionM4.getQuestion()); // prompting the question
          for (int l = 0; l <= 3; l++) // the user only gets three chances to guess the correct answer
          {
            Scanner scanner = new Scanner(System.in);
            questionM4.setGuess(scanner.nextInt());

                if (questionM4.getGuess() != questionM4.getCorrectAnswer()) // to check if the guess is greater than the answer
                {
                  if(l == 3)
                  {
                    System.out.println("Oops. Got it wrong");
                  }
                  else
                  {
                    System.out.println("Incorrect, please try again"); // this lets the user know their answer was too low
                  }
                }// end of if conditional that checks if the user's guess is low compare to the correct answer
                else 
                {
                  System.out.println("Correct, the answer was 1");
                  correctCount++;
                  questionTOF4.setCountCorrect(correctCount);
                  l = 4;
                }
          }
        int comp3 = questionM4.compareTo(someMQuestion);
        if (comp3 == -1)
        {
           System.out.println("Awe man. Better luck next time.");
        }
        else if (comp3 == 1)
        {
            System.out.println("Good job you got them all correct.");
        }
        else
        {
                System.out.println("Good job. You got some correct");
        }
            System.out.println("Thank you for playing!!!");
    }
}
