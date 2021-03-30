package eu.senla.javacources.counstructor;

import eu.senla.javacources.menu.MenuController;

import java.util.ArrayList;

public class MainInitializer {

    public static void init() {
        initMenu();
    }

    private static void initMenu() {
        MenuController.getInstance().run();
    }
}
