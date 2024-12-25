import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID,subjectCode;
		boolean isStudentIDValid, isSubjectCodeValid;
		while (true) {
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			
			System.out.print("Enter subject ID (7 digits): ");
			subjectCode = scanner.nextLine();
			
			isStudentIDValid = isLength(studentID,10);
			isSubjectCodeValid = isLength(subjectCode,7);
			
			if(isStudentIDValid && isSubjectCodeValid) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				
				displayData(isITStudent,isITSubject);
				break;
			}else {
				System.out.println("");
			}
		
					
		}
	}
	public static boolean isLength(String input, int len) {

		return input.length() ==len;
	}
	public static boolean isITStudent(String idStudent) {
			
		return (idStudent.substring(0,6).equals("211311"));
	}
	public static boolean isITSubject(String codeSubject) {
		return (codeSubject.substring(0,2).equals("21")) || codeSubject.charAt(4)=='1';
	}
	public static void displayData(boolean isStudent,boolean isitSubject ) {
		if(isStudent || isitSubject) {
			System.out.print("Student id: "+isStudent+" 1st year student in IT and Enroll in corses for Year 1");
		}else if (isStudent!=true||isitSubject!=true){
			System.out.print("Student id: "+isStudent+" not 1st year student in IT not Enroll in corses for Year 1");
		}
		else {
			System.out.print("Student id: "+isStudent+" not 1st year student in IT not Enroll in corses for Year 1");	
		}
		
		
	}

}