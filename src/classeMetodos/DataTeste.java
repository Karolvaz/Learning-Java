package classeMetodos;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();

        var d2 = new Data(1,1,1970);

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(d1.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
