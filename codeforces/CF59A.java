package codeforces;

//59A - Word
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF59A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		int l = 0, u = 0;
		for(char c : s.toCharArray()) {
			if(Character.isUpperCase(c))	
				u++;
			else
				l++;
		}
		if(l < u)
			System.out.println(s.toUpperCase());
		else
			System.out.println(s.toLowerCase());
	}

}
