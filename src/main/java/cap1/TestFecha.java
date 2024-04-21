package cap1;

public class TestFecha {
  public static void main(String[] args) {
    Fecha f = new Fecha();
    f.setDia(12);
    f.setMes(5);
    f.setAnio(2002);

    System.out.println("Dia: " + f.getDia());
    System.out.println("Mes: " + f.getMes());
    System.out.println("Año : " + f.getAnio());
    System.out.println("Fecha completa: " + f);

    Fecha f1 = new Fecha();
    f1.setDia(27);
    f1.setMes(11);
    f1.setAnio(1970);

    Fecha f2 = new Fecha();
    f2.setDia(27);
    f2.setMes(11);
    f2.setAnio(1970);

    System.out.println(f1.equals(f));
  }
}
