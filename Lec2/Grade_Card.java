package Lec2;

import java.util.Scanner;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks >= 75) {
			System.out.println("A");
		} else if (marks < 75 && marks >= 65) {
			System.out.println("B");
		} else if (marks < 65 && marks >= 55) {
			System.out.println("C");
		} else if (marks < 55 && marks >= 45) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
