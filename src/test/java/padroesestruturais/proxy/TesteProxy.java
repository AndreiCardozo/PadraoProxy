package padroesestruturais.proxy;

public class TesteProxy {
    public static void main(String[] args) {

        ArquivoReal arquivoReal = new ArquivoReal("https://exemplo.com/arquivo");
        arquivoReal.baixar();


        ArquivoProxy arquivoProxy = new ArquivoProxy("https://exemplo.com/arquivo");
        arquivoProxy.baixar();


        ArquivoProxy arquivoProxy2 = new ArquivoProxy("https://exemplo.com/arquivo");
        arquivoProxy2.baixar();

    }
}
