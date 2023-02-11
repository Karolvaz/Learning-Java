package fundamentos;

public class ConversãoTiposPrimitivos {
    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.0; // explícita (CAST)
        System.out.println(b);

        int c = 128; // explícita (CAST)
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.999999; // explícita (CAST)
        int f = (int) e;
        System.out.println(f);
    }
}
