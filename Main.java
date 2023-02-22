import java.util.Arrays;
public class Main {
  

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
    double[][] copy = new double[array.length][];
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
    for (int j = 0 ; j < a[0].length; j++) {
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  
  }
   

  public static double[][] withWeightedAverage(double[][] a, double[] weights) {
    double[][] copy = new double[a.length][a[0].length + 1];
    for (int row = 0 ; row < a.length; row++) {
      for (int collumn = 0; collumn < 3; collumn++) {
        copy[row][collumn] = a[row][collumn];
        copy[row][3] += a[row][collumn] * weights[collumn];
      }
    }
    return copy;
  }
    

  public static void main(String[] args) {
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

  //System.out.println(Arrays.deepToString(a));
  //System.out.println(Arrays.deepToString(copyRagged(a)));
  //printTranspose(a);
  System.out.println(Arrays.deepToString(withWeightedAverage(a, new double[] {0.25, 0.25, 0.50})));


  }


}