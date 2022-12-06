import java.util.Comparator;

public class SortBluda implements Comparator<Bluda> {
    @Override
    public int compare(Bluda o1, Bluda o2) {
        return 0;
    }
    public Comparator<Bluda>bludaComparator  = new Comparator<Bluda>() {
        @Override
        public int compare(Bluda o1, Bluda o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
    public Comparator<Bluda>bludaComparator2 = new Comparator<Bluda>() {
        @Override
        public int compare(Bluda o1, Bluda o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

}
