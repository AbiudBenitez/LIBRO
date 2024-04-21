package cap1;

public class Fecha {

  private int dia;
  private int mes;
  private int anio;

  public Fecha(int d, int m, int a) {
    dia = d;
    mes = m;
    anio = a;
  }

  @Override
  public String toString() {
    return dia + "/" + mes + "/" + anio;
  }

  @Override
  public boolean equals(Object o) {
    Fecha otraFecha = (Fecha) o;
    return (dia == otraFecha.dia)
        && (mes == otraFecha.mes)
        && (anio == otraFecha.anio);

  }

  public int getDia() {
    return dia;
  }

  public void setDia(int d) {
    dia = d;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int m) {
    mes = m;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int a) {
    anio = a;
  }

}
