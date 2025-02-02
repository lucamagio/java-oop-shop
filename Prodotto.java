import java.util.Random;

public class Prodotto{
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva){
        this.codice = new Random().nextInt(1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public void dettagliProdotto(){
        System.out.println("Codice: " + codice);
        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Iva: " + iva);
    }


    public void prezzoBase(){
        System.out.println("Il prezzo base del prodotto è: " + prezzo);
    }

    public void prezzoConIva(){
        double prezzoIva = prezzo * iva;
        System.out.println("Il prezzo con iva è: " + prezzoIva);
    }

    public void nomeEsteso(){
        System.out.println("Il nome completo del prodotto è: " + (codice + nome));
    }
}
