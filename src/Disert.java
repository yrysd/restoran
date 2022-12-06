import java.util.List;
import java.util.Scanner;

public class Disert extends DissertAbstract{

    private  static final Scanner scanner = new Scanner(System.in);
    public Disert(String name, int price, double kolomu) {
        super(name, price, kolomu);
    }
    public Disert(){

    }

    @Override
    void sozkaite(List<Disert> diserts) {
        System.out.println("Choose disert: ");
        String name  = scanner.nextLine();
        for (Disert disert:diserts) {
            if(name.equalsIgnoreCase(disert.getName())){
                System.out.println("Name: "+disert.getName());
                System.out.println("Price: "+disert.getPrice());
                System.out.println("Kolomu: "+disert.getKolomu());
                System.out.println("Price: "+disert.getPrice());
                double  summa = scanner.nextDouble();
                if(summa > disert.getPrice()){
                    double result = summa - disert.getPrice();
                    System.out.println("Ваша сдача : "+result);
                }else if(summa < disert.getPrice()){
                    System.out.println("Не хватает средств!");
                }
            }

        }

    }

    @Override
    void udalit(List<Disert> diserts) {
        System.out.println("Delete");

    }

    @Override
    void poluchitVse(List<Disert> diserts) {
        for (Disert disert:diserts) {
            System.out.println(disert);
        }

    }

    @Override
    void sortPrice(List<Disert> diserts) {
        SortDisert sortDisert = new SortDisert();
        diserts.sort(sortDisert.disertComparator);
        for (Disert disert:diserts) {
            System.out.println(disert);
        }


    }

    @Override
    void sortName(List<Disert> diserts) {
        SortDisert sortDisert = new SortDisert();
        diserts.sort(sortDisert.disertComparator2);
        for (Disert disert:diserts) {
            System.out.println(disert);
        }

    }

    @Override
    void scoroctPodachi() {

    }

}
