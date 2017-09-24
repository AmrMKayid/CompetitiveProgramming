package codeforces;

//841A - Generous Kefa
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF841A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt(), f = in.nextInt();
		String s = in.next();
		for(char c: s.toCharArray()) {
			if(s.chars().filter(ch -> ch == c).count() > f) {
				System.out.println("NO"); return;
			}
		}
		System.out.println("YES");
			
	}

}
