import java.util.Comparator;

public class SortSalat implements Comparator<Salat> {
    @Override
    public int compare(Salat o1, Salat o2) {
        return 0;
    }
    public Comparator<Salat>salatComparator = new Comparator<Salat>() {
        @Override
        public int compare(Salat o1, Salat o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
    public Comparator<Salat>salatComparator2 = new Comparator<Salat>() {
        @Override
        public int compare(Salat o1, Salat o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
