package codeforces;

//405A - Gravity Flip
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class CF405A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
	    int a[] = new int[n];
	    for(int i = 0; i < n; ++i)
	        a[i] = in.nextInt();

	    Arrays.sort(a);

	    for(int i = 0; i < n; ++i)
	        System.out.print(a[i] + " ");

	}

}
