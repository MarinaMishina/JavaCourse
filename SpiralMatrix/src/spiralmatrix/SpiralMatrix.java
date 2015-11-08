
package spiralmatrix;


public class SpiralMatrix {

    public static void main(String[] args) {
        
        int n = 5;
        int m = 5;
        int [][] matrix = new int[n][m];
        //Виток спирали
        int v;
        //Числа
        int num;
        
        v = 0;
        num = 1;
        
        while (num < n*m + 1) {
            //Верхняя часть спирали
            for (int i = v; (i < m-v); i++) {
                matrix[v][i] = num++;
            }
            
            //Правая боковая часть спирали
            for (int i = v+1; i < n-v; i++) {
                matrix[i][m-v-1] = num++;
            
            } 
            //Нижняя часть спирали
            for (int i = m-v-2; i >= v; i--) {
                matrix[n-v-1][i] = num++;
            }
            
            //Левая боковая часть спирали
            for (int i = n-v-2; i > v; i--) {
                matrix[i][v] = num++;
            }
            
            //Переход на следующий виток спирали
            v++;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("%4d", matrix[i][j]));
            }
            System.out.println();
        }
        
    }
    
}
