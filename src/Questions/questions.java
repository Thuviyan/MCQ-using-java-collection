package Questions;

import java.util.*;

public class questions {

	private Integer questionNumber;
	private String question;
	private Map<Integer, String> choices;
	private Integer correctAnswer;
	
	

	public questions(Integer questionNumber, String question) {
		super();
		this.questionNumber = questionNumber;
		this.question = question;
	}
	
	public void setChoices(String... strings ) {
		Integer i=1;
		choices = new HashMap<Integer, String>();
		for(String str:strings) {
			this.choices.put(i, str);
			i++;
		}
	}
	
	public void setCorrectAnswer(Integer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	@Override
	public String toString() {
		return "questions [questionNumber=" + questionNumber + ", question=" + question + ", choices=" + choices
				+  "]";
	}

	public Integer getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(Integer questionNumber) {
		this.questionNumber = questionNumber;
	}

	public Integer getCorrectAnswer() {
		return correctAnswer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<Integer, String> getChoices() {
		return choices;
	}

	public void setChoices(Map<Integer, String> choices) {
		this.choices = choices;
	}
	
	

}
