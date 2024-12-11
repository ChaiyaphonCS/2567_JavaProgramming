import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int spaceCount =0;
		int wordCount1 =0;
		System.out.print("Input a sentence : ");
		String inputSentence = input.nextLine();
		while (!inputSentence.endsWith(".")) {
		System.out.print("Input a sentence, again : ");
		inputSentence = input.nextLine();
		}

		String[] wordCount = inputSentence.split(" ");
		for (int i = 0;i < wordCount.length;i++) {
			wordCount1++;
		}
		for (int i = 0;i < inputSentence.length();i++) {
			if (inputSentence.charAt(i)==' ') {
				spaceCount++;
			}
		}
		System.out.print("This sentence has "+spaceCount+" spacebar.\n"+"This senetence has "+wordCount1+" word.");
	
	
		}

	}


