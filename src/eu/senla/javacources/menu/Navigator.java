package eu.senla.javacources.menu;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Navigator {

    @Getter @Setter
    private Menu currentMenu;

    private static Navigator instance;

    private Navigator() {}

    public static Navigator getInstance() {
        if (instance == null) {
            instance = new Navigator();
        }
        return instance;
    }

    public void printMenu() {
        for (MenuItem menuItem : currentMenu.getMenuItems()) {
            System.out.println(menuItem.getTitle());
        }
    }

    public void navigate(int index) {
        --index;

        int itemsCounter = currentMenu.getMenuItems().size();
        if (itemsCounter < index && itemsCounter < 0) {
            System.out.println("we have a problem Huston");
            return;
        }

        MenuItem menuChoice = currentMenu.getMenuItems().get(index);

        if (menuChoice.getAction() == null) {
            if (menuChoice.getNextMenu() == null) {
                this.setCurrentMenu(getCurrentMenu().getMenuItems().get(index).getPreviousMenu());
            } else {
                this.setCurrentMenu(getCurrentMenu().getMenuItems().get(index).getNextMenu());
            }
        } else {
            menuChoice.executeAction();
        }
    }
}
