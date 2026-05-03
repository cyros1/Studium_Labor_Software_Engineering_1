import personal.Chef;
import personal.Konditor;
import personal.Servicekraft;

class Main{
public static void main(String[] args) {
    Konditorio konditorio = new Konditorio();
    Standort standort = new Standort();

    standort.setChef(new Chef("C-001"));
    standort.setKonditor(new Konditor("K-001"));
    standort.addServicekraft(new Servicekraft("S-001"));
    standort.addServicekraft(new Servicekraft("S-002"));
    standort.addServicekraft(new Servicekraft("S-003"));
    standort.addServicekraft(new Servicekraft("S-004"));
    standort.addServicekraft(new Servicekraft("S-005"));

    standort.addFilliale(new Filliale("Schlesweiger Str. 1", 1));

    konditorio.addProdukt(new Produkt("Maulwurfstorte"));
    konditorio.addStandort(standort);
    }
}