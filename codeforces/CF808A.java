package codeforces;

//808A - Lucky Year
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF808A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.nextLine();
		int l = s.length();
		double i =  Math.pow(10, l-1);
		int n = Integer.parseInt(s);
		if(n < 10)
			System.out.println(1);
		else
			System.out.println((int) Math.abs((((int) (n/i)) + 1) * i) - n);
	}

}
