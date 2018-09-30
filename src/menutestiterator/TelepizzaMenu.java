package menutestiterator;

public class TelepizzaMenu implements Menu {
    static final int MAX_ITEMS = 2;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public TelepizzaMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Hawaiana", "Tomate, queso, piña", false, 4.75);
        addItem("Vegetariana", "Tomate, berenjenas, champiñones", true, 4.00);
    }
  
    public void addItem(String name, String description,boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("MENÚ LLENO");
        } else {
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public java.util.Iterator createIterator() {
        return new PizzasMenuIterator(menuItems);
    }

}
