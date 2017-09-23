package codeforces;

//236A - Boy or Girl
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF236A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next(), s2 = "";
		
		for(char c : s.toCharArray()) {
			if(s2.indexOf(c) < 0)
				s2 += c;
		}
		
		if(s2.length() % 2 == 0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
	}

}
