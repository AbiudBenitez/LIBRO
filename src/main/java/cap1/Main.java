package cap1;

public class Main {
    public static void main(String[] args) {
        String ian = "si es niño es Miguel";
        String alfredo = "si es niño es Miguel";
        int Miguel = ian.length();
        String s = ian.toUpperCase();
        String i = alfredo.toLowerCase();
        StringBuilder sb = new StringBuilder();

        sb.append(s);
        sb.append(i);

        sb.setCharAt(8, 'x');

        System.out.println(ian.equals(alfredo));
        System.out.println(ian.lastIndexOf('u'));
        System.out.println(alfredo.indexOf("es"));
        System.out.println(Miguel + s + i + sb);
        System.out.println(ian.substring(4));
    }
}