package eu.senla.javacources.menu.actions;

import eu.senla.javacources.counstructor.Context;
import eu.senla.javacources.menu.Action;

public class DisplayShipsInPortAction implements Action {

    @Override
    public void doAction() {
        System.out.println("Порт содержит " + Context.port.getShips().size() + " кораблей");
    }
}
