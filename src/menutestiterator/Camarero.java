package menutestiterator;

import java.util.Iterator;

public class Camarero {
    Menu macdonaldsMenu;
    Menu telepizzaMenu;

    public Camarero(Menu macdonaldsMenu, Menu telepizzaMenu) {
        this.macdonaldsMenu = macdonaldsMenu;
        this.telepizzaMenu = telepizzaMenu;
    }

    public void imprimeMenu() {
        Iterator hamburguesasIterator = macdonaldsMenu.createIterator();
        Iterator pizzasIterator = telepizzaMenu.createIterator();
        System.out.println("MENU\n----\nHAMBURGUESAS");
        imprimeMenu(hamburguesasIterator);
        System.out.println("\nPIZZAS");
        imprimeMenu(pizzasIterator);
    }

    private void imprimeMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " – ");
            System.out.println(menuItem.getDescription());
        }
    }
    
}
