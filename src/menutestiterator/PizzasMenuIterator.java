package menutestiterator;

import java.util.Iterator;

public class PizzasMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public PizzasMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
           return false;
        } else {
            return true;
        }        
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("NO SE PUEDE QUITAR UN ITEM: ");
        }
        if (items[position-1] != null) {
            for (int i = position-1; i < (items.length-1); i++) {
                 items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
    
}
