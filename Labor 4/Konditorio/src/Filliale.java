import raeume.Buero;
import raeume.Kueche;
import raeume.Kuehlraum;
import raeume.Verkaufsraum;

public class Filliale {
    private String adresse;
    private int etage;

    private Kueche kueche = new Kueche();
    private Buero buero = new Buero();
    private Verkaufsraum verkaufsraum = new Verkaufsraum();
    private Kuehlraum kuehlraum = new Kuehlraum();

    public Filliale(String adresse, int etage){
        this.adresse = adresse;
        this.etage = etage;
    }
}
