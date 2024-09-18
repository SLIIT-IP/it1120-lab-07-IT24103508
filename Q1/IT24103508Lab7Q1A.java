import java.util.Scanner;
public class IT24103508Lab7Q1A{
public static void main (String[]args){
	int sub1,sub2,sub3,sub4;
	double avg;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter marks for four subjects: ");
	System.out.print("Enter the subject mark 1: ");
	sub1=input.nextInt();
	System.out.print("Enter the subject mark 2 ");
	sub2=input.nextInt();
	System.out.print("Enter the subject mark 3: ");
	sub3=input.nextInt();
	System.out.print("Enter the subject mark 4: ");
	sub4=input.nextInt();

	avg=(sub1+sub2+sub3+sub4)/4;
	System.out.println("Average is : "+avg);
	if (avg<=100 && avg>= 75){
		System.out.println("Overall Grade is : Distinction");}
	else if(avg<75 && avg >= 50 ){
		System.out.println("Overall Grade is : Credit");}
	else if(avg<50 && avg >= 0 ){
		System.out.println("Overall Grade is : Fail");}
	}
}
	

		
	

	


