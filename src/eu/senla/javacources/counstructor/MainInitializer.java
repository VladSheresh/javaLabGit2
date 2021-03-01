package eu.senla.javacources.counstructor;

import eu.senla.javacources.entitiy.Port;
import eu.senla.javacources.entitiy.Ship;
import eu.senla.javacources.menu.MenuController;

import java.util.ArrayList;

public class MainInitializer {

    public static void init() {
        initContext();
        initMenu();
    }

    private static void initContext() {
        Context.port = new Port();
        Context.waitingShips = new ArrayList<>();
        generatePort();
        generateWaitingShip();
    }

    private static void initMenu() {
        MenuController.getInstance().run();
    }

    private static void generateWaitingShip() {

    }

    private static void generatePort() {
        Port port = new Port();
        port.setCapacity(0);
        port.setShips(new ArrayList<>());
    }
}
