import java.util.ArrayList;

public class Container extends ArrayList<Luggage> {
    private int maxSize;
    private int currentSize;

    public Container(int maxSize) {
        this.maxSize = maxSize;
    }

    public void put(Luggage lug) {
        if (!canContain(lug)) throw new RuntimeException("Can not put luggage");
        super.add(lug);
        currentSize += lug.getSize();
    }

    public void extract(Luggage lug) {
        super.remove(lug);
        this.currentSize -= lug.getSize();
    }

    public boolean canContain(Luggage lug) {
        return maxSize >= currentSize + lug.getSize();
    }
}
