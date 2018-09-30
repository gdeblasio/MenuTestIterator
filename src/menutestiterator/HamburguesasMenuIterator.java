package menutestiterator;

import java.util.ArrayList;

public class HamburguesasMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public HamburguesasMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
                return false;
        } else {
                return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }
}
