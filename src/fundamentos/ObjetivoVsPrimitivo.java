package fundamentos;

public class ObjetivoVsPrimitivo {
    public static void main(String[] args) {
        String s = "texto";
        s = s.toUpperCase();
        System.out.println(s);

        // wrappers são a versão objeto dos tipos primitivos;
        int a = 158;
        System.out.println(a);
    }
}
