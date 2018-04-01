
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(" ");
		fibonac(0, 1, 10, 1);
	}

	public static void fibonac(int n1, int n2, int index, int count) { //method with four arguments
		
		if(count<index) { //if count is less than index, make a new number which is an addition of the two previous numbers,
						  //print this new number and call the function again.
			int newnum = n1 + n2;
			System.out.print(newnum + " ");
			fibonac(n2, newnum, index, ++count); //recursion
		}
	}
}
