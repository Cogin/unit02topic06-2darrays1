import java.util.Arrays;
public class Main {
  
  // good
  public static double[][] copySquare(double[][] array) {
    double[][] copy = new double[array.length][array[0].length];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        copy[i][j] = array[i][j];
      }
    }
    return copy;

  }

  public static double[][] copyRectangle(double[][] array) {
    double[][] copy = new double[array.length][array[0].length];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        copy[i][j] = array[i][j];
      }
    }
    return copy;

  }

  public static double[][] copyRagged(double[][] array) {
    double[][] copy = new double[array.length][array[0].length];
    for (int i = 0; i < array.length; i++) {
      copy[i] = new double[array[i].length];
      for (int j = 0; j < array[i].length; j++) {
        copy[i][j] = array[i][j];
      }
    }
    return copy;
  }

  public static void printTranspose(double[][] a) {
    for (int r = 0 ; r < a[0].length; r++) {
      for (int c = 0; c < a.length; c++) {
        System.out.print(a[c][r] + " ");
      }
      System.out.println();
    }
  
  }
   
  public static double[][] withWeightedAverage(double[][] a, double[] weights) {
    
    double[][] copy = new double[a.length + 1][a[0].length + 1];
    for (int row = 0 ; row < a.length; row++) {
      //get average of each row and collumn
      for (int collumn = 0; collumn < copy[row].length - 1; collumn++) {
        copy[row][collumn] = a[row][collumn];
        copy[copy.length-1][collumn] += a[row][collumn] * (1/ (double) a.length);
        copy[row][copy[row].length - 1] += a[row][collumn] * weights[collumn];
        
      }
      //add average of each row to last collumn average
      copy[copy.length-1][copy[row].length - 1] += copy[row][copy[row].length - 1] * (1/ (double) a.length);
    }
    return copy;
  }
    

  public static void main(String[] args) {
    double[][] origRectangle = new double[][] {
      {1, 2, 3},
      {4, 5, 6}
    };


    withWeightedAverage(origRectangle, new double[] {0.25, 0.25, 0.50});


     double[][] a = new double[][] {
      {99, 85, 98},
       {98, 57, 79},
       {92, 77, 74},
       {94, 62, 81},
       {99, 94, 92},
       {80, 76.5, 67},
       {76, 58.5, 90.5},
       {92, 66, 91},
       {77, 70.5, 66.5},
       {89, 89.5, 81}
   };

  
  System.out.println(Arrays.deepToString(withWeightedAverage(a, new double[] {0.25, 0.25, 0.50})));


  }


}