import java.util.Objects;

public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.setIdKlienta(idKlienta);
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setEmail(email);
    }

    @Override
    public String toString() {
        return "KlientKawiarni{" +
                "idKlienta=" + idKlienta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        KlientKawiarni that = (KlientKawiarni) o;
        return idKlienta == that.idKlienta;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idKlienta);
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    private void setIdKlienta(int idKlienta) {
        if (idKlienta <= 0){
            throw new IllegalArgumentException("ID nie może być mniejsze/równe 0");
        }
        this.idKlienta = idKlienta;
    }

    public String getImie() {
        return imie;
    }

    private void setImie(String imie) {
        if (imie == null || imie.isEmpty()){
            throw new IllegalArgumentException("Imie nie może być puste lub null");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    private void setNazwisko(String nazwisko) {
        if (nazwisko == null || nazwisko.isEmpty()){
            throw new IllegalArgumentException("Nazwisko nie może być puste lub null");
        }
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        if (email == null || email.isEmpty() || !email.contains("@")){
            throw new IllegalArgumentException("Email nie jest poprawny/jest pusty");
        }
        this.email = email;
    }
}
