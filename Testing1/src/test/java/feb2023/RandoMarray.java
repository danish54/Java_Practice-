package feb2023;

import java.util.Random;

import org.testng.annotations.Test;

public class RandoMarray {
	
	@Test
	void printrandomarray(){
	
	int size = 20;
	Random random = new Random();
	
    int[][] array = new int[size][size];
    
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            array[i][j] = random.nextInt(10); 
	 
        }
        }
	  
	  for (int[] row : array) {
          for (int num : row) {
              System.out.print(num + " ");
          }
          System.out.println();
      }

}
}
