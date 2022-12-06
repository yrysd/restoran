import java.util.List;
import java.util.Scanner;

public class Napitki extends NapitkiAbstract{

    private static final Scanner scanner = new Scanner(System.in);
    public Napitki(String name, int price, double kolomu) {
        super(name, price, kolomu);
    }


    public Napitki(){

    }

    @Override
    void sosdaite(List<Napitki> napitkis) {
        System.out.println("Choose Napitki:");
        String name = scanner.nextLine();
        for (Napitki napitki:napitkis) {
            if(name.equalsIgnoreCase(napitki.getName())){
                System.out.println("Name: "+napitki.getName());
                System.out.println("Price: "+napitki.getPrice());
                System.out.println("Kolomu: "+napitki.getKolomu());
                System.out.println("Price: "+napitki.getPrice());
                double summa = scanner.nextDouble();
                if(summa > napitki.getPrice()){
                    double result = summa - napitki.getPrice();
                    System.out.println("Ваша сдача: "+result);
                }else if(summa < napitki.getPrice()){
                    System.out.println("Не хватает средств!");
                }
            }

        }
    }

    @Override
    void ualit(List<Napitki> napitkis) {
        System.out.println("Delete");

    }

    @Override
    void poluchitVse(List<Napitki> napitkis) {
        for (Napitki napitki:napitkis) {
            System.out.println(napitki);
        }

    }

    @Override
    void sortPrice(List<Napitki> napitkis) {
        NapitkiSort napitkiSort = new NapitkiSort();
        napitkis.sort(napitkiSort.napitkiComparator);
        for (Napitki napitki:napitkis) {
            System.out.println(napitki);
        }

    }

    @Override
    void sortName(List<Napitki> napitkis) {
        NapitkiSort napitkiSort = new NapitkiSort();
        napitkis.sort(napitkiSort.napitkiComparator2);
        for (Napitki napitki:napitkis) {
            System.out.println(napitki);
        }

    }




}
