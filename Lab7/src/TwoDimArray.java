
public class TwoDimArray {
	public static int[][] myArray = fillArray("twodimesion.txt");
	
	public static void main(String[] args) {
		printArray(myArray);
		printArrayEven(myArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		System.out.print(num+" ");
	}
	private static void printArrayEven(int[][] theArray){
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				if(theArray[i][j]%2==0) {
					System.out.print("* ");
				}
				else {
					display(theArray[i][j]);
				}
			System.out.println();
		}
	}
	public static int[][] fillArray(String myFile){
		TextFileInput in = new TextFileInput(myFile);
		int row = Integer.parseInt(in.readLine());
		int column = Integer.parseInt(in.readLine());
	int[][] nums = new int[row][column];
	
	for (int i = 0; i < row; i++) {
		for(int j = 0; j< column; j++)
		nums[i][j] = Integer.parseInt(in.readLine());
	}
	in.close();
	return nums;
	}
}
