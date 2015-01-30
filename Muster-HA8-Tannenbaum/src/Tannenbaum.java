
public class Tannenbaum {
	
	
	public void printTriangle(int height){
		printMatrix(buildTriangle(height));
	}
	
	
	public void printTree(int elementHeight){
		printMatrix(buildTree(elementHeight));
	}
	
	/**
	 * Dreieck aufbauen und zurückgeben
	 * @param height
	 * @return boolean[][]
	 */
	private boolean[][] buildTriangle(int height){
		boolean[][] matrix = new boolean[height][height*2-1];
		int center = matrix[0].length/2;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j >= center - i && j <= center + i)
					matrix[i][j] = true;
			}
		}
		
		return matrix;
	}
	
	/**
	 * Tannenbaum aufbauen und zurückgeben
	 * @param height
	 * @return boolean[][]
	 */
	private boolean[][] buildTree(int height){
		boolean[][] matrix = new boolean[height/3*3][height/3*3+1];
		int center = matrix[0].length/2;
		int x = 0;
		
		if (height < 6){
			System.out.println("[TANNENBAUM] Ein Tannenbaum muss mindestens eine Höhe "
					+ "von 6 haben, das weiss doch jeder!");
			return matrix;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j >= center - i + x && j <= center + i - x)
					matrix[i][j] = true;
			}
			if (i%3 == 2) x += 2;
		}
		
		return matrix;
	}
	
	/**
	 * boolean[][]-Matrix mit "*" auf der Konsole ausgeben
	 * @param matrix
	 */
	private void printMatrix(boolean[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] ? '*' : ' ');
			}
			System.out.println("");
		}
	}

	
}
