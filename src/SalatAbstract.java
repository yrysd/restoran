import java.util.List;

public abstract class SalatAbstract {
    private String name;
    private int price;
    private double kolomu;

    public SalatAbstract(String name, int price, double kolomu) {
        this.name = name;
        this.price = price;
        this.kolomu = kolomu;
    }
    public SalatAbstract(){}

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
    abstract void sozdaite(List<Salat> salatList);
    abstract void udalit(List<Salat> salatList);
    abstract void puluchitVse(List<Salat> salatList);
    abstract void sortPrice(List<Salat> salatList);
    abstract void sortName(List<Salat> salatList);
    abstract void scorostPodachi();

    @Override
    public String toString() {
        return "Name: "+name+"\n"+
                "Price: "+price+"\n"+
                "Kolomiu: "+kolomu;
    }
}
