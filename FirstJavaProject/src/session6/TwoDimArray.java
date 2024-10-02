package session6;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[3][2];
		
		a[0][0] = 12;
		a[0][1] = 13;
		
		a[1][0] = 12;
		a[1][1] = 1;
		
		a[2][0] = 162;  //change
		a[2][1] = 122;
		//new change 
		//2 line
		System.out.println("no. of rows:" + a.length);
		System.out.println("no of column:" + a[0].length);
	}

}
