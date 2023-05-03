package padroesestruturais.proxy;

public class ArquivoReal implements Arquivo {
    private String url;

    public ArquivoReal(String url) {
        this.url = url;
        carregar();
    }

    public void baixar() {
        System.out.println("Baixando arquivo de " + url);
    }

    private void carregar() {
        System.out.println("Carregando arquivo de " + url);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
