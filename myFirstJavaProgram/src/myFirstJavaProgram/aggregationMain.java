package myFirstJavaProgram;

import java.util.Scanner;

public class aggregationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int noOfClass = sc.nextInt();
		classNamePrint[] cnp = new classNamePrint[noOfClass];
		for(int i=0;i<noOfClass;i++)
		{
			cnp[i] = new classNamePrint(sc.next());
		}
		
		for(int i=0;i<noOfClass;i++)
		{
			System.out.println(cnp[i]);
		}
	}

}
