import personal.Chef;
import personal.Konditor;
import personal.Servicekraft;

import java.util.ArrayList;
import java.util.List;

public class Standort {
    private List<Filliale> fillialen = new ArrayList<>();
    private Chef chef;
    private Konditor konditor;
    private List<Servicekraft> servicekraefte = new ArrayList<>();


    public void addFilliale(Filliale filliale){
        fillialen.add(filliale);
    }

    public void addServicekraft(Servicekraft servicekraft){
        servicekraefte.add(servicekraft);
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void setKonditor(Konditor konditor) {
        this.konditor = konditor;
    }
}
