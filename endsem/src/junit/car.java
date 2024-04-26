package junit;



public class car {
	
	String name,color;
	int year;
	
	car(String name,String color,int year){
		
		this.name=name;
		this.color=color;
		this.year=year;
	}
	
	String getName() {
		return name;
	}
	
	String getColor() {
		return color;
	}

	int getYear() {
		return year;
	}
}
