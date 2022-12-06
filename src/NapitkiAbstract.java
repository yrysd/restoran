import java.util.List;

public abstract class NapitkiAbstract {
    private String name;
    private int price;
    private double kolomu;

    public NapitkiAbstract(String name, int price, double kolomu) {
        this.name = name;
        this.price = price;
        this.kolomu = kolomu;
    }
    public NapitkiAbstract(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getKolomu() {
        return kolomu;
    }

    public void setKolomu(double kolomu) {
        this.kolomu = kolomu;
    }
    abstract void sosdaite(List<Napitki>napitkis);
    abstract void ualit(List<Napitki>napitkis);
    abstract void poluchitVse(List<Napitki>napitkis);
    abstract void sortPrice(List<Napitki>napitkis);
    abstract void sortName(List<Napitki>napitkis);

    @Override
    public String toString() {
        return "Name: "+name+"\n"+
                "Price: "+price+"\n"+
                "Kolomu: "+kolomu;
    }
}
