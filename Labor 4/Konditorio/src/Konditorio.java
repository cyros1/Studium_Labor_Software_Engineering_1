import java.util.ArrayList;
import java.util.List;

public class Konditorio {
    private List<Standort> standorte = new ArrayList<>();
    private List<Produkt> produkte = new ArrayList<>();

     public void addStandort(Standort standort) {
         standorte.add(standort);
     }

     public void addProdukt(Produkt produkt){
         produkte.add(produkt);
     }
}
