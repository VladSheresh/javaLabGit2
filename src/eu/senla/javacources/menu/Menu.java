package eu.senla.javacources.menu;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Menu {

    private List<MenuItem> menuItems = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Menu(String name, List<MenuItem> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }
}
