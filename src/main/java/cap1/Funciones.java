package cap1;

public class Funciones {

  public static double factorial(int n) {
    double r = 1;
    for (int i = 0; i <= n; i++) {
      r = r * i;
    }
    return r;
  }

  public static boolean esPrimo(int n) {
    int i = 2;
    while (n % i != 0 && i < n) {
      i++;
    }
    return i == n;
  }
}
