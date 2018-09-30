package menutestiterator;

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
    
}
