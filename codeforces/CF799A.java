package codeforces;

//799A - Carrot Cakes
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF799A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt(), t = in.nextInt(), k = in.nextInt(), d = in.nextInt();
	    System.out.println((n > (d/t + 1) * k)? "YES":"NO");
	}

}
