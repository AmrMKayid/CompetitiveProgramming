package codeforces;

//791A - Bear and Big Brother
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF791A {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt(), b = in.nextInt();
		for(int i = 0; ; ++i)
		{
			if(a>b)
			{
				System.out.println(i);
				return;
			}
			a*=3;
			b*=2;
		}
	}

}
