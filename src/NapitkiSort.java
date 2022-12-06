import java.util.Comparator;

public class NapitkiSort implements Comparator<Napitki> {
    @Override
    public int compare(Napitki o1, Napitki o2) {
        return 0;
    }
    public Comparator<Napitki> napitkiComparator = new Comparator<Napitki>() {
        @Override
        public int compare(Napitki o1, Napitki o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };
    public Comparator<Napitki>napitkiComparator2 = new Comparator<Napitki>() {
        @Override
        public int compare(Napitki o1, Napitki o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}

