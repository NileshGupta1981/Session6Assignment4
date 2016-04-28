import java.util.Scanner;

public class Session6Assignement4 extends Student {
	
	public static void main (String args[]){
		
		
		Scanner scnr = new Scanner(System.in);
		System.out.println ("Enter the number of Students");
		int number = scnr.nextInt();
		Session6Assignement4[] sa = new  Session6Assignement4[number+1];
		//int[] roll = new int[number]; 
		//String[] name = new String[number];
		//String[] registration = new String[number];
		//Student[] sa = new Student[number];
		//Session6Assignement4 sa = new Session6Assignement4();
		for (int i = 1 ; i <= number ; i++){
		 sa[i]= new Session6Assignement4();
		System.out.println("Enter the roll number of " +i+ " student");
		int x= scnr.nextInt();
		sa[i].setRoll(x);
		//sa.setRoll(scnr.nextInt());
		System.out.println ("Enter the name of " +i+ " student");
		sa[i].setName(scnr.next());
		//sa.setName(scnr.next());
		System.out.println ("Enter the registration of " +i+ " student");
		sa[i].setRegistration(scnr.next());
		//sa.setRegistration(scnr.next());
		}
		scnr.close();
		
		for (int j = 1 ; j <= number ; j++){
			System.out.println ("Roll Number of "+ j + "student is: " +sa[j].getRoll());
			System.out.println ("Name of "+ j + "student is: "+sa[j].getName());
			System.out.println ("Registation Number of "+ j + "student is:"+sa[j].getRegistration());
				
						
		}
		
		
		
		
		
	}
	
}