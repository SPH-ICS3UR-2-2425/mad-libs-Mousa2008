import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints , and doubles!
		 */
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter a Number from 1 to 30");
		int num1 = in.nextInt();
		System.out.println("Enter a male name");
		in.nextLine();
		String name = in.nextLine();
		System.out.println("Name a part of the body");
		String peice  = in.nextLine();
		System.out.println("Name me a sport");
		String game = in.nextLine();
		System.out.println("Give me a female name");
		String name2 = in.nextLine();
		System.out.println("Give me a huge decimal");
		double dub1 = in.nextDouble();
		System.out.println("Give me a verb ending in ing");
		in.nextLine();
		String word = in.nextLine();
		System.out.println("Name me a vegetable");
		String word2 = in.nextLine();
		System.out.println("Name a form of transport");
		String word3 = in.nextLine();
		System.out.println("Name any place in the world");
	    String word4 = in.nextLine();
		
		
		System.out.println(" On the "+num1+" of septemeber "+name+" fell on his "+peice+" while playing a viscous game of "+game+". The next day when he was at the hospital Dr."+name2+" treated him and informed him that his heart rate was at a whopping "+dub1+"!!!! Can u believ that, the crazier thing is when he was at the hospital he was "+word+" and he slipped on fried "+word2+". This ended with him taking a "+word3+" and he ended up stranded in the "+word4);	}

}
