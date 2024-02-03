package cap1;

public class Primitivas {

  // Declaracion de una constante
  public static final int DIA_LUNES = 1;

  public static void main(String[] args) {

    // Declarar una vairable tipo int
    int i = 1234;

    // Usamos el wrapper para hacer una operacion con la variable del tipo de dato
    // primitiva
    String a = Integer.toString(i);
    System.out.println(a);

    String b = Integer.toBinaryString(i);
    System.out.println(b);

    String c = Integer.toHexString(i);
    System.out.println(c);

    String d = "1234";

    int j = Integer.parseInt(d);
    System.out.println(j);

    // Valores literales

    char c1 = 'A';
    int i1 = 123;
    boolean b1 = true;
    float f = 3.14f;
    // Normalmente no se usara float ni boolean por su problema de aproximacion, se
    // suele usar la clase BigDecimal

  }
}
