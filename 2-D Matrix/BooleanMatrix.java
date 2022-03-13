import java.util.*;
class Main {
    public static void main (String[] args) {
        // Your code here
    	Scanner scan = new Scanner(System.in); 
    	int t = scan.nextInt();
    	while(t>0){
        	int r = scan.nextInt();
			int c = scan.nextInt();
			int[][] m =new int[r][c];
			for(int i=0;i<r;i++)
				for(int j=0;j<c;j++) m[i][j] = scan.nextInt();  
        	String ones= "";
			for(int k=0;k<c;k++) ones = ones+"1 ";
			String zeroes= "";
			for(int k=0;k<c;k++) zeroes = zeroes+"0 ";

        	for(int i=0;i<r;i++){
				boolean flag = false;
				for(int j=0;j<c;j++){
					if(m[i][j] ==1){ 
						System.out.println(ones);
						flag=true;
						break;
					}
				}
				if(flag == false) System.out.println(zeroes);
    		}
			t--;
		}
	}

}