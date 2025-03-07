
public class Movie {
private String id;
private String name;
private Director director;

Movie(){
	this(null,null,null);
}
Movie(String id,String name,Director director){
	this.id = id;
	this.name = name;
	this.director = director;
}
public String getId() {
	return this.id;
}
public String getName() {
	return this.name;
}
public Director getDirector() {
	return this.director;
}
public void setDirector(Director director) {
	this.director = director;
}
public String toString() {
	return String.format("%s %s direct by %s", this.getId(), this.getName(), this.getDirector());
}
}
