import java.util.List;

public abstract class Restoran {

    private String name;
    private int price;
    private double kolomu;
    private int time;


    public Restoran(String name, int price, double kolomu,int time) {
        this.name = name;
        this.price = price;
        this.kolomu = kolomu;
        this.time = time;
    }
    public Restoran(){

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
    public int getTime(){
        return time;
    }
    public void setTime(int time){
        this.time = time;
    }

    abstract void sozdaite(List<Bluda> bludas);

   abstract void  udalit(List<Bluda>bludas);

   abstract void puluchitVse(List<Bluda>bludas);

   abstract void sortPrice(List<Bluda>bludas);

   abstract void sortName(List<Bluda>bludas);

   abstract void scorostPodachi();

    @Override
    public String toString() {
        return "Name: "+name+"\n"+
                "Price: "+price+"\n"+
                "Kolomu: "+kolomu+"\n"+
                "Time: "+time;
    }
}
