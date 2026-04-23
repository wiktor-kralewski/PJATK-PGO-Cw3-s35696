import java.util.Objects;

public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;

    private static int liczbaProduktow=0;

    public static int getLiczbaProduktow(){
        return liczbaProduktow;
    }

    @Override
    public String toString() {
        return "ProduktMenu{" +
                "kod='" + kod + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProduktMenu that = (ProduktMenu) o;
        return Objects.equals(kod, that.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kod);
    }

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.setKod(kod);
        this.setNazwa(nazwa);
        this.setCena(cena);
        this.setKategoria(kategoria);
        ProduktMenu.liczbaProduktow++;
    }

    public String getKod() {
        return kod;
    }

    private void setKod(String kod) {
        if (kod==null || kod.isEmpty()){
            throw new IllegalArgumentException("Kod nie może być pusty");
        }
        this.kod = kod;
    }

    public String getKategoria() {
        return kategoria;
    }

    private void setKategoria(String kategoria) {
        if (kategoria==null || kategoria.isEmpty()){
            throw new IllegalArgumentException("Kategoria nie może być pusta lub być null");
        }
        this.kategoria = kategoria;
    }

    public double getCena() {
        return cena;
    }

    private void setCena(double cena) {
        if (cena <= 0){
            throw new IllegalArgumentException("Cena nie może być mniejsza/równa 0");
        }
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    private void setNazwa(String nazwa) {
        if (nazwa==null || nazwa.isEmpty()){
            throw new IllegalArgumentException("Nazwa nie może być pusta lub być null");
        }
        this.nazwa = nazwa;
    }

}
