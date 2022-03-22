import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int i = 0;
		int j = 0;
		long sum = 0;
		boolean found = false;
		while(j < n){
			sum += arr[j];
			if(sum == k){
				int start = i + 1;
				int end = j + 1;
				System.out.print(start + " "+ end);
				found = true;
				break;
			}
			else if(sum > k){
				while(sum > k){
					sum -= arr[i];
					i++;
				}
				if(sum == k){
					int start = i + 1;
					int end = j + 1;
					System.out.print(start + " "+ end);
					found = true;
					break;
				}
			}
			j++;
		}
		if(!found) System.out.print(-1);
	}
}