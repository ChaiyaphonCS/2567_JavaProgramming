
public class Student {
	//private two attribute
	private String name;
	private double[] scores;
	
	//method
	public void setStudentDetails(String stdName, double[] stdscores) {
		name = stdName;
		scores = stdscores;
	}
	public double calculateAverageScore() {
		double total = 0;
		for (double _score : scores) {
			total += _score;
		}
		/*for (int i =0;i<scores.length;i++) {
			total += scores[i];
		}*/
		return total/scores.length; //return average of scores
	}
	public String getGrade() {
		double average = calculateAverageScore();
		if (average >= 90) {
			return "A";
			
		}else if(average >= 80) {
			return "B";
		
	    }else if(average >= 70) {
		    return "C";
		
	    }else if(average >= 60) {
		    return "D";
		
		}else {
			return "F";
		}
	}
	public void displayStudentDetails() {
		System.out.print("Scores: ");
		/*for (int i =0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
		}*/
		for (double _score : scores) {
			System.out.print(_score+" ");
		}
		System.out.println("\nAverage Score: "+calculateAverageScore());
		System.out.println("Grade: "+getGrade());
	}

}
