import java.util.*;

public class Bluda extends Restoran  {

    private static final Scanner scanner = new Scanner(System.in);

    public Bluda(String name, int price, double kolomu,int time) {
        super(name, price, kolomu,time);
    }

    public Bluda() {

    }


    @Override
    void sozdaite(List<Bluda>bludas) {
        System.out.println("Choose food:");
        String name = scanner.nextLine();
        for (Bluda bluda : bludas) {
            if (name.equalsIgnoreCase(bluda.getName())) {
                System.out.println("Name: " + bluda.getName());
                System.out.println("Price: " + bluda.getPrice());
                System.out.println("Kolomu: " + bluda.getKolomu());
                System.out.println("Price: "+bluda.getPrice());
                double summa = scanner.nextDouble();
                if(summa > bluda.getPrice()){
                    double result = summa - bluda.getPrice();
                    System.out.println("Ваша сдача: "+result);
                }
            }
        }
    }




    @Override
    void udalit(List<Bluda>bludas) {

        System.out.println("Delete");

    }

    @Override
    void puluchitVse(List<Bluda>bludas) {
        for (Bluda bluda:bludas) {
            System.out.println(bluda);
        }
    }

    @Override
    void sortPrice(List<Bluda>bludas) {
        SortBluda sortBluda = new SortBluda();
        bludas.sort(sortBluda.bludaComparator);
        for (Bluda bluda:bludas) {
            System.out.println(bluda);

        }



    }

    @Override
    void sortName(List<Bluda>bludas) {
        SortBluda sortBluda = new SortBluda();
        bludas.sort(sortBluda.bludaComparator2);
        for (Bluda bluda:bludas) {
            System.out.println(bluda);
        }


    }

    @Override
    void scorostPodachi() {

    }


}
