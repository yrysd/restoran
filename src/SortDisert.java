import java.util.Comparator;

public class SortDisert implements Comparator<Disert> {
    @Override
    public int compare(Disert o1, Disert o2) {
        return 0;
    }
    public Comparator<Disert>disertComparator = new Comparator<Disert>() {
        @Override
        public int compare(Disert o1, Disert o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
    public Comparator<Disert>disertComparator2 = new Comparator<Disert>() {
        @Override
        public int compare(Disert o1, Disert o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
