import java.util.*;
public class FictionDemo1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Book Title: ");
		String boolTitle = scan.nextLine();
		System.out.print("Book Publish year: ");
		int publishYear = scan.nextInt();
		scan.nextLine();
		System.out.print("Author name: ");
		String authorName = scan.nextLine();	
		System.out.print("author email: ");
		String authorEmail = scan.nextLine();
		
		
		
		fictionBook book1 = new fictionBook(boolTitle, publishYear);
		book1.setAuthorName(authorName);
		book1.setEmail(authorEmail);
		while(!book1.checkEmail()) {
			System.out.print("author email, again: ");
			authorEmail = scan.nextLine();
			book1.setEmail(authorEmail);
		}
		Line();
		System.out.println(book1);
		
	}
	public static void Line() {
		for(int i =1;i<50;i++) {
			System.out.print("=");
			
		}
		System.out.println();
	}
}
