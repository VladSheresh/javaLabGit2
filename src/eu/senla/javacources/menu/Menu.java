package eu.senla.javacources.menu;

import java.util.List;
import java.util.Scanner;

// Содержит текущий пункт меню
public class Menu {

    public List<MenuItem> items;

    public void executeUserComand() {
        Scanner scanner = null;
        int num = scanner.nextInt();

        MenuItem item = items.get(num-1);
        item.action.doAction();
    }


}
