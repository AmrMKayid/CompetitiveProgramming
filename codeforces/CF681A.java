package codeforces;

//681A - A Good Contest
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF681A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
	    for(int i = 0; i < n; ++i)
	    {
	        String s = in.next();
	        int bc = in.nextInt(), ac = in.nextInt();
	        if(bc>=2400 && ac>=2400 && ac>bc) {
	        	System.out.println("YES");
	        	return;
	        }
	    }
	    System.out.println("NO");
	}

}
