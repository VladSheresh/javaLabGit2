package eu.senla.javacources.menu;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Пункт меню
@Getter
@Setter
public class MenuItem {

    private String title;
    private Action action;
    private Menu nextMenu;
    private Menu previousMenu;

    public MenuItem(String title, Action action, Menu nextMenu, Menu previousMenu) {
        this.title = title;
        this.action = action;
        this.nextMenu = nextMenu;
        this.previousMenu = previousMenu;
    }

    public void executeAction() {
        action.execute();
    }

}
