package classe;

public class ValorNulo {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!"));

        // Vai gerar o famoso erro > NullPointerException

        //String s2 = null;
        //System.out.println(s2.concat("!!!"));
    }
}
