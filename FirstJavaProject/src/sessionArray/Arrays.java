package sessionArray;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] roll = new int[5];
		roll[0] = 12;
		roll[1] = 22;
		roll[2] = 32;
		roll[3] = 45;
		roll[4] = 25;
		
		System.out.println("size of array:" + roll.length);
		
		//real value from array
		System.out.println(roll[3]);
		
		//read all values of array
		for(int i = 0; i < roll.length; i++)
		{
			System.out.println(roll[i]);
		}
		
		for(int i:roll)
		{
			System.out.println(i);
		}
	}

}
