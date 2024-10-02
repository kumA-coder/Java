package session8;

public class Students {
	
	//instance variables
	
		String name;
		int rollno;
		
	//method
		void displayInformation() {
			//code to be executed
			System.out.println("Name:" + name);
			System.out.println("Roll No:" + rollno);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students student1 = new Students();
		Students student2 = new Students();
		
		//initialise object/store data to the object student1
		
		student1.name = "Prita";
		student1.rollno = 101;
		
		student2.name = "Rahul";
		student2.rollno = 102;
		
		student1.displayInformation();
		student2.displayInformation();
	}

}
