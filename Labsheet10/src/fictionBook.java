
public class fictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	
	fictionBook(String title ,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		author_name = name;
		int space = author_name.indexOf(" ");
		fname = author_name.substring(0,space);
		lname = author_name.substring(space+1);
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
		
	public String getEmail() {
		return this.email;
	}
	@Override
	public String getLastname() {
		return this.lname.toUpperCase();
	}
	public String getFirstname() {
		return this.fname.toUpperCase();
	}
	@Override
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com")) 
			return true;
		return false;
	}
	@Override
	public String getTitle() {
		return this.title;
	}
	@Override
	public int totalPublicYear() {
		return 2025 - this.publicYear;
	}
	
	
	public String toString() {
		return getTitle()+" write by "+getLastname().substring(0,1)+"."+getFirstname()+"("+getEmail()+")"+"\nPublished for "+totalPublicYear()
		+" year(s).";
	}

	
	
}
