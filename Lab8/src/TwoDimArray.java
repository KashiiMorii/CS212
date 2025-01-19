
public class TwoDimArray {
	public static int[][] myArray = fillArray("twodimesion8.txt");
	
	public static void main(String[] args) {
		printArray(myArray);
		System.out.println();
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
	public static int[][] fillArray(String myFile){
		TextFileInput in = new TextFileInput(myFile);
		String firstLine = in.readLine();
		StringTokenizer tokenizer = new StringTokenizer(firstLine, ", "); 
		int row = Integer.parseInt(tokenizer.nextToken());
		int column = Integer.parseInt(tokenizer.nextToken());
		int[][] nums = new int[row][column];
		for (int i = 0; i < row; i++) {
			String line = in.readLine();
			StringTokenizer lineTokens = new StringTokenizer(line, ", ");
			for(int j = 0; j< column; j++) {
				nums[i][j] = Integer.parseInt(lineTokens.nextToken());
			}
		}
	in.close();
	return nums;
	}
}
