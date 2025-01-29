public class Main {
    public static void main(String[] args) {
        Prodotto mela = new Prodotto("mela", "mela verde", 37, 22);

        mela.prezzoBase();
        mela.prezzoConIva();
        mela.nomeEsteso();
        mela.dettagliProdotto();

    }
    
}
