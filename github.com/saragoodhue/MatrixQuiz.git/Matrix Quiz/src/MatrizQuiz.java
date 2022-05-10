
public class MatrizQuiz
	{

		public static void main(String[] args)
			{
				matrix();

			}
		
		public static void matrix()
			{
				int highestNum = 0;
				int[][] matrix = new int[6][6];
				
				for(int i = 0; i < matrix.length; i++)
					{
						for(int j = 0; j < matrix[0].length; j++)
							{
								matrix[i][j] = (int)(Math.random() * 90) + 10;
								System.out.print(matrix[i][j] + " ");
								
								if(matrix[i][j] > highestNum)
									{
										highestNum = matrix[i][j];
									}
							}
						
						System.out.println();
					}
				
				System.out.println();
				System.out.println(highestNum);
				
			}

	}
