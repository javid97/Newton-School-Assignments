import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        // Your code here
		Set<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		for(int i = 0; i < N1; i++){
			int n = sc.nextInt();
			set.add(n);
		}
		for(int i = 0; i < N2; i++){
			int n = sc.nextInt();
			if(set.contains(n)){
				sum += n;
				set.remove(n);
			}
		}
		System.out.print(sum);
	}
}
