package codeforces;

//344A - Magnets
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF344A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt(), c = 1;
	    int a[] = new int[n];

	    a[0] = in.nextInt();
	    int tmp = a[0];
	    for(int i = 1; i < n; ++i) {
	        a[i] = in.nextInt();
	        if(a[i] != tmp) {
	            tmp = a[i];
	            c++;
	        }
	    }

	    System.out.println(c);

	}

}
