package se.jacobswenson;

import java.io.Serializable;

public class Question implements Serializable {

    private CategoryName category;
    private String questionText;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerCorrect;
    static final long serialVersionUID = 42L;

    public Question(CategoryName category,String questionText, String answerOne, String answerTwo, String answerThree, String answerCorrect) {
        this.category = category;
        this.questionText = questionText;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerCorrect = answerCorrect;
    }


    public CategoryName getCategory() {
        return category;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public String getAnswerCorrect() {
        return answerCorrect;
    }
}
