import java.util.List;
import java.util.Scanner;

public class Salat extends SalatAbstract{
    private static final Scanner scanner = new Scanner(System.in);
    public Salat(String name, int price, double kolomu) {
        super(name, price, kolomu);
    }

    public Salat() {
    }

    @Override
    void sozdaite(List<Salat> salatList) {
        System.out.println("Choose salad:");
        String name = scanner.nextLine();
        for (Salat salat:salatList) {
            if(name.equalsIgnoreCase(salat.getName())){
                System.out.println("Name: "+salat.getName());
                System.out.println("Price: "+salat.getPrice());
                System.out.println("Kolomu: "+salat.getKolomu());
                System.out.println("Price: "+salat.getPrice());
                double summa = scanner.nextDouble();
                if(summa > salat.getPrice()){
                    double result = summa - salat.getPrice();
                    System.out.println("Ваша сдача: "+result);
                }else if(summa < salat.getPrice()){
                    System.out.println("Не хватает средств!");
                }
            }

        }

    }

    @Override
    void udalit(List<Salat> salatList) {
        System.out.println("Delete");
    }

    @Override
    void puluchitVse(List<Salat> salatList) {
        for (Salat salat:salatList) {
            System.out.println(salat);
        }

    }

    @Override
    void sortPrice(List<Salat> salatList) {
        SortSalat salat =  new SortSalat();
        salatList.sort(salat.salatComparator);
        for (Salat salat1:salatList) {
            System.out.println(salat1);
        }

    }

    @Override
    void sortName(List<Salat> salatList) {
        SortSalat salat = new SortSalat();
        salatList.sort(salat.salatComparator2);
        for (Salat salat1:salatList) {
            System.out.println(salat1);
        }

    }

    @Override
    void scorostPodachi() {

    }

}
