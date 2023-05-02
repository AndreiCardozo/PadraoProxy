package padroesestruturais.proxy;

public class ArquivoProxy implements Arquivo {
    private String url;
    private ArquivoReal arquivoReal;

    public ArquivoProxy(String url) {
        this.url = url;
    }

    public void baixar() {
        if (arquivoReal == null) {
            arquivoReal = new ArquivoReal(url);
        }
        arquivoReal.baixar();
    }
}
