public class MultipleChoice implements Comparable<MultipleChoice>
{

    private String questions; // the set questions
    private int correctAnswer; // the set answers
    private int guess; // the user's guess (which should be an integer)
    private int count; // of tries
    private int countCorrect; // count of how many questions the user gets correct

    public MultipleChoice()
    {
        questions = "";
        correctAnswer = 0;
        guess = 0;
        count = 0;
    }//default constructor
    public MultipleChoice(String questions, int correctAnswer, int guess, int count, int countCorrect)
    {
        this.questions = questions;
        this.correctAnswer = correctAnswer;
        this.guess = guess;
        this.count = count;
    }//constructor
    public String getQuestion()
    {
        return questions;
    }
    //Getter for question
    public void setQuestion(String questions)
    {
        this.questions = questions;
    }
    //Setter for question
    public int getCount()
    {
        return count;
    }
    //Getter for count
    public void setCount(int count)
    {
        this.count = count;
    }//Setter for count
    public int getCorrectAnswer()
    {
        return correctAnswer;
    }//Getter for correctAnswer
    public void setCorrectAnswer(int correctAnswer)
    {
        this.correctAnswer = correctAnswer;
    }//Setter for correctAnswer
    public int getGuess()
    {
        return guess;
    }//Getter for guess
    public void setGuess(int guess)
    {
        this.guess = guess;
    }//Setter for guess
    public int getCountCorrect()
    {
        return countCorrect;
    }//Getter for guess
    public void setCountCorrect(int countCorrect)
    {
        this.countCorrect = countCorrect;
    }//Setter for guess
    public String endOfRound()
    {
        String output = "";
        output = "You have guessed ";
        output += countCorrect;
        output += "correct for the true and false round. ";
        return output;
    }
    public int compareTo(MultipleChoice someMQuestion)
    {
        if(this.countCorrect == 0)
        {
            return -1;
        }//end of if conditional
        else if(this.countCorrect < 4 && this.countCorrect > 1)
        {
            return 0;
        }//end of if-else conditional
        else
        {
            return 1;
        }//end of else conditional
    }
}

