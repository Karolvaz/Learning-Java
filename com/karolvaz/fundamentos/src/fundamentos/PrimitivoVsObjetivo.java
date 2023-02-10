package fundamentos;

public class PrimitivoVsObjetivo {
    public static void main(String[] args) {
        String s = "texto";
        s = s.toUpperCase();
        System.out.println(s);

        // wrappers são a versão objeto dos tipos primitivos;
        int a = 123;
        System.out.println(a);
    }
}
