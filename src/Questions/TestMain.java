package Questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
	
		
		List<questions> questionList = new ArrayList<>();
		
		
		
		questions question1 = new questions(1,"Who is Google CEO?");
		question1.setChoices("SuntharPitchai","abc","xyz");
		question1.setCorrectAnswer(1);
		
		questionList.add(question1);
		
		 
		
		questions question2 = new questions(2,"Who is Virtusa Owner?");
		question2.setChoices("qwe","abc","xyz");
		question2.setCorrectAnswer(2);
		
		questionList.add(question2);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Please choose the User \n A. ADMIN \n U. USER \n Q.QUIT");
			String usr= scanner.nextLine();
			
			switch(usr.toUpperCase()) {
			case "A":
				
				System.out.println("Now u r ADMIN");
				System.out.println("Please Enter question No:");
				Integer qno = scanner.nextInt();
				
				
				break;
				
			case "U":
				
				showQuestions(questionList, scanner);
				break;
				
			case "Q":
				System.exit(0);
				break;
			
			default:
				System.out.println("Bad operation, choose either A/ U / Q ");
			}
		
		 
		//int correctAnswer=0;
		
		
		
		}
		
	}

	private static void showQuestions(List<questions> questionList, Scanner scanner) {
		Map<questions,Integer> answerMap = new LinkedHashMap<questions, Integer>();
		
		for(questions question:questionList) {
			System.out.println("Q"+question.getQuestionNumber()+". "+question.getQuestion());
			Map<Integer,String> choices = question.getChoices();
			
			for(Map.Entry<Integer, String> entry : choices.entrySet()) {
				System.out.println("--"+entry.getKey()+entry.getValue());
			}
			
			Integer answer=scanner.nextInt();
			answerMap.put(question, answer);
			
//			if(question.getCorrectAnswer()==answer) {
//				System.out.println("Your answer is right");
//				correctAnswer++;
//			}else
//			{
//				System.out.println("Your answer is wrong");
//			}
			
		}
		
		System.out.println("Question No: \t Answer No \t Status");
		for(Map.Entry<questions, Integer> answer: answerMap.entrySet()) {
			boolean ansStatus=false;
			if(answer.getKey().getCorrectAnswer()==answer.getValue()) {
				ansStatus = true;
			}
			System.out.println(answer.getKey().getQuestionNumber()+"\t\t"+answer.getValue()+"\t\t"+ansStatus);
		}
		
		//System.out.println("Correct Answer :"+ correctAnswer +"/of"+questionList.size());
	}

}
