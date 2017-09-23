package codeforces;

//709A - Juicer
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF709A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt(), b = in.nextInt(), d = in.nextInt(), o, c = 0, j = 0;
	    for(int i = 0; i < n; ++i) {
	        o = in.nextInt();
	        if(o <= b) j += o;
	        if(j > d) {
	            c++;
	            j = 0;
	        }
	    }

	    System.out.println(c);

	}

}
