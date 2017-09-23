package uva;

//UVa: 10106 - Product
import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
import static java.lang.String.*;

public class Uva10106 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		StringTokenizer tk;

		String s;
		while((s = in.readLine())!= null && !s.equals("")) {
			BigInteger a = new BigInteger(s);
			BigInteger b = new BigInteger(in.readLine());

			System.out.println(a.multiply(b));
		}
	}

}

