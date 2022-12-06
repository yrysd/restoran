import java.util.ArrayList;
import java.util.List;

public class Menu {

    private ArrayList<Bluda> bludas;
    private ArrayList<Salat>salats;
    private ArrayList<Napitki>napitkis;
    private ArrayList<Disert>diserts;

    public Menu(ArrayList<Bluda> bludas, ArrayList<Salat> salats, ArrayList<Napitki> napitkis, ArrayList<Disert> diserts) {
        this.bludas = bludas;
        this.salats = salats;
        this.napitkis = napitkis;
        this.diserts = diserts;
    }
    public Menu(){}

    public ArrayList<Bluda> getBludas() {
        return bludas;
    }

    public void setBludas(ArrayList<Bluda> bludas) {
        this.bludas = bludas;
    }

    public ArrayList<Salat> getSalats() {
        return salats;
    }

    public void setSalats(ArrayList<Salat> salats) {
        this.salats = salats;
    }

    public ArrayList<Napitki> getNapitkis() {
        return napitkis;
    }

    public void setNapitkis(ArrayList<Napitki> napitkis) {
        this.napitkis = napitkis;
    }

    public ArrayList<Disert> getDiserts() {
        return diserts;
    }

    public void setDiserts(ArrayList<Disert> diserts) {
        this.diserts = diserts;
    }

    @Override
    public String toString() {
        return " ";
    }
}
