import java.util.List;

public abstract class DissertAbstract {
    private String name;
    private int price;
    private double kolomu;

    public DissertAbstract(String name, int price, double kolomu) {
        this.name = name;
        this.price = price;
        this.kolomu = kolomu;
    }
    public DissertAbstract(){}

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
    abstract void sozkaite(List<Disert>diserts);

    abstract void udalit(List<Disert>diserts);

    abstract void poluchitVse(List<Disert>diserts);

    abstract void sortPrice(List<Disert>diserts);

    abstract void sortName(List<Disert>diserts);
    abstract void scoroctPodachi();

    @Override
    public String toString() {
        return "Name: "+name+"\n"+
                "Price: "+price+"\n"+
                "Kolomu: "+kolomu;
    }
}
