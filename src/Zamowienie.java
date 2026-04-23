import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty = new ArrayList<>();
    private boolean oplacone;

    private static int kolejnyNumer=0;

    public static int pobierzKolejnyNumer(){
        return ++Zamowienie.kolejnyNumer;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "numerZamowienia=" + numerZamowienia +
                ", klient=" + klient +
                ", produkty=" + produkty +
                ", oplacone=" + oplacone +
                '}';
    }

    public Zamowienie(KlientKawiarni klient) {
        this.setKlient(klient);
        this.numerZamowienia = pobierzKolejnyNumer();
    }

    public KlientKawiarni getKlient() {
        return klient;
    }

    private void setKlient(KlientKawiarni klient) {
        this.klient = klient;
    }

    public void dodajProdukt(ProduktMenu p){
        if (this.produkty.contains(p)){
            throw new IllegalArgumentException("Ten produkt znajduje się już na liście produktów");
        }
        this.produkty.add(p);
    }

    public double policzWartosc(){
        double suma=0;
        for (ProduktMenu p : produkty){
            suma+=p.getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow(){
        return this.produkty.size();
    }

    public void oznaczJakoOplacone(){
        this.oplacone = true;
    }
}
