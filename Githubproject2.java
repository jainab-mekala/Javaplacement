import java.util.Scanner;
public class GithubQuizApplication {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        String[] questions = {
		            "1. What is the capital of India?",
		            "2. Which language is used for Android development?",
		            "3. What is 5 * 3?",
		            "4. Which data structure uses FIFO?",
		            "5. Who developed Java?"
		        };

		        String[][] options = {
		            {"A. Delhi", "B. Mumbai", "C. Chennai", "D. Kolkata"},
		            {"A. Python", "B. Java", "C. C++", "D. Swift"},
		            {"A. 15", "B. 10", "C. 20", "D. 25"},
		            {"A. Stack", "B. Queue", "C. Tree", "D. Graph"},
		            {"A. Dennis Ritchie", "B. James Gosling", "C. Elon Musk", "D. Bill Gates"}
		        };

		        char[] answers = {'A', 'B', 'A', 'B', 'B'};
		        char[] userAnswers = new char[questions.length];

		        int score = 0;

		        System.out.println("===== QUIZ APPLICATION =====\n");

		        for (int i = 0; i < questions.length; i++) {
		            System.out.println(questions[i]);

		            for (int j = 0; j < options[i].length; j++) {
		                System.out.println(options[i][j]);
		            }

		            long startTime = System.currentTimeMillis();

		            System.out.print("Enter your answer (A/B/C/D): ");

		            // ✅ SAFE INPUT HANDLING
		            if (sc.hasNext()) {
		                String input = sc.next().toUpperCase();

		                if (input.length() == 1 &&
		                    (input.charAt(0) == 'A' || input.charAt(0) == 'B' ||
		                     input.charAt(0) == 'C' || input.charAt(0) == 'D')) {

		                    userAnswers[i] = input.charAt(0);
		                } else {
		                    System.out.println("Invalid input! Marked as wrong.");
		                    userAnswers[i] = 'X'; // wrong answer
		                }

		            } else {
		                System.out.println("No input detected! Skipping question.");
		                userAnswers[i] = 'X'; // avoid timeout
		            }

		            long endTime = System.currentTimeMillis();
		            System.out.println("Time taken: " + (endTime - startTime)/1000 + " sec\n");

		            if (userAnswers[i] == answers[i]) {
		                score++;
		            }
		        }

		        // RESULT
		        System.out.println("===== RESULT =====");
		        System.out.println("Your Score: " + score + "/" + questions.length);

		        // REVIEW
		        System.out.println("\n===== REVIEW =====");
		        for (int i = 0; i < questions.length; i++) {
		            System.out.println(questions[i]);
		            System.out.println("Your Answer: " + userAnswers[i]);
		            System.out.println("Correct Answer: " + answers[i]);

		            if (userAnswers[i] == answers[i]) {
		                System.out.println("Correct ✅\n");
		            } else {
		                System.out.println("Wrong ❌\n");
		            }
		        }

		        sc.close();
		    }
		
	}

