package toto.tarolo;

import java.util.ArrayList;
import java.util.List;
import sun.util.resources.LocaleData;

public class Fordulo {

    private int ev;
    private int het;
    private int forduloAHeten;
    private LocaleData datum;

    private List<Talalat> talalatok = new ArrayList<>();
    private List<Eredmeny> eredmenyek = new ArrayList<>();
    
    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getHet() {
        return het;
    }

    public void setHet(int het) {
        this.het = het;
    }

    public int getForduloAHeten() {
        return forduloAHeten;
    }

    public void setForduloAHeten(int forduloAHeten) {
        this.forduloAHeten = forduloAHeten;
    }

    public LocaleData getDatum() {
        return datum;
    }

    public void setDatum(LocaleData datum) {
        this.datum = datum;
    }

    public List<Talalat> getTalalatok() {
        return talalatok;
    }

    public void setTalalatok(List<Talalat> talalatok) {
        this.talalatok = talalatok;
    }

    public List<Eredmeny> getEredmenyek() {
        return eredmenyek;
    }

    public void setEredmenyek(List<Eredmeny> eredmenyek) {
        this.eredmenyek = eredmenyek;
    }
    
    
}
