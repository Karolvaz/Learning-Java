package fundamentos;

public class Wrapppers {
    public static void main(String[] args) {

        // byte
        Byte b = 100;
        Short s = 1000;

        // Interger.parseInt (entrada.next());
        Integer i = Integer.parseInt("1000"); // int
        Long l = 10000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i + 3);
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo =  Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toLowerCase());

        Character c = '#'; // char
        System.out.println(c + "...");
    }
}
