import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static List<Bluda> bludas = new ArrayList<>();
    private static List<Salat> salats = new ArrayList<>();
    private static List<Napitki> napitkis = new ArrayList<>();
    private static List<Disert> diserts = new ArrayList<>();

    private static final Restoran  r = new Bluda();
    public static void main(String[] args) {

        bludas = new ArrayList<>(Arrays.asList(
                new Bluda("Pilaf",300,350.0,5),
                new Bluda("Shorpo",250,200.0,5),
                new Bluda("Manty",200,150.0,6),
                new Bluda("Kuurdak",150,250.0,2)));

       salats = new ArrayList<>(Arrays.asList(
                new Salat("Dollar",150,100.0),
                new Salat("Kimchi",250,250.0),
                new Salat("Alivia",300,350.0),
                new Salat("Buratina",150,250.0)
        ));

       napitkis = new ArrayList<>(Arrays.asList(
                new Napitki("Coca-Cola",75,1.0),
                new Napitki("Pepsi",80,1.0),
                new Napitki("Lyubimyi",100,1.0),
                new Napitki("Kymyz",100,1.0)
        ));

       diserts = new ArrayList<>(Arrays.asList(
                new Disert("Pirojnyi",150,50.0),
                new Disert("Cace",200,300.0),
                new Disert("Tokoch",150,100.0),
                new Disert("Malina",300,150.0)
        ));


       PersonMethod();

    }
    public static void PersonMethod(){
        while (true) {
            System.out.println("""
                     * ~~~~~~~~~~~ * Menu * ~~~~~~~~~~~~ *
                                   * 1.Bluda *
                                   * 2.Salat *
                                   * 3.Napitki *
                                   * 4.Disert * 
                    """);
            start();
}




    }
    public static  void commants(){
        System.out.println("""
                    1.Sozdaite 
                    2.udalit
                    3.puluchitVse
                    4.sort price
                    5.sort name
                 
                    """);
    }

    public static void start(){
        Bluda bluda = new Bluda();
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println(bludas);
            commants();
            int num = scanner.nextInt();
            if (num == 1) {
                bluda.sozdaite(bludas);
            } else if (num == 2) {
                bluda.udalit(bludas);
            }else if(num == 3){
                bluda.puluchitVse(bludas);
            } else if (num == 4) {
                bluda.sortPrice(bludas);
            }else{
                bluda.sortName(bludas);
            }


        } else if (number == 2) {
            Salat salat = new Salat();
            System.out.println(salats);
            commants();
            int num = scanner.nextInt();
            if (num == 1) {
                salat.sozdaite(salats);
            } else if (num == 2) {
                salat.udalit(salats);
            }else if(num == 3){
                salat.puluchitVse(salats);
            } else if (num == 4) {
                salat.sortPrice(salats);
            }else {
                salat.sortName(salats);
            }
        } else if (number == 3) {
            Napitki napitki = new Napitki();
            System.out.println(salats);
            commants();
            int num = scanner.nextInt();
            if (num == 1) {
                napitki.sosdaite(napitkis);
            } else if (num == 2) {
                napitki.ualit(napitkis);
            } else if (num == 3) {
                napitki.poluchitVse(napitkis);
            } else if (num == 4) {
                napitki.sortPrice(napitkis);
            }else {
                napitki.sortName(napitkis);
            }
        }else {
            Disert disert = new Disert();
            System.out.println(diserts);
            commants();
            int num = scanner.nextInt();
            if (num == 1) {
                disert.sozkaite(diserts);
            } else if (num == 2) {
                disert.udalit(diserts);
            } else if (num == 3) {
                disert.poluchitVse(diserts);
            } else if (num == 4) {
                disert.sortPrice(diserts);
            }else {
                disert.sortName(diserts);
            }
        }

    }

}