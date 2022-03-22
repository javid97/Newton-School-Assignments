import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

		for(int i = 0; i < n; i++){
			int x = i;
			int y = i;
			int xCount = -1;
			int yCount = -1;
			while(x >= 0){
				if(arr[x] > arr[i]){
					xCount = x + 1;
					break;
				}
				x--;
			}
			while(y < n){
				if(arr[y] > arr[i]){
					yCount = y + 1;
					break;
				} 
				y++;
			}
			System.out.print(xCount + yCount + " ");
		}
	}
}