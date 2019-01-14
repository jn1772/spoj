import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kadane {
	public static int compute(int[] a) {
		int gMax = a[0];
		int pMax = a[0];
		
		for(int i=1;i<a.length;++i) {
			pMax = Math.max(pMax + a[i], a[i]);
			gMax = Math.max(gMax, pMax);
		}
		return gMax;
	}
	
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nCases = Integer.parseInt(br.readLine());
		while(nCases-->0) {
			int n = Integer.parseInt(br.readLine());
			String[] nInts = br.readLine().split(" ");
			int[] vals = new int[nInts.length];
			for(int i=0;i<nInts.length;++i)vals[i] = Integer.parseInt(nInts[i]);
			System.out.println(compute(vals));
		}
	}
}

