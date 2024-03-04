package marcosoft.oca;

public class MultiDimensionArrayLab{
	public static void main(String[] args){

		int[][] matrix = {
			{1,2,3},
			{9,8,7},
			{5},
			{34,78,23,90},
			{4,8}
		};


		// going trought all the elements using both for and for-each approaches

		for(int[] row:matrix){
			for(int cell:row){
				System.out.println("-> " + cell);
			}
		}

		for(int r = 0;r < matrix.length;r++){
			for(int c = 0;c < matrix[r].length;c++){
				System.out.println("%d - %d : element %d".formatted(r,c,matrix[r][c]));
			}
		}

	}
}