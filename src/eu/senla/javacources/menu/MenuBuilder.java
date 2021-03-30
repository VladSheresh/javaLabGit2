package eu.senla.javacources.menu;

import eu.senla.javacources.menu.actions.*;

public class MenuBuilder {

    public Menu mainMenu;

    private static MenuBuilder instance;

    private MenuBuilder() {
        buildMenu();
    }

    public static MenuBuilder getInstance() {
        if (instance == null) {
            instance = new MenuBuilder();
        }
        return instance;
    }
    public void buildMenu() {
        mainMenu = new Menu("Main");
        mainMenuInit();
        Navigator.getInstance().setCurrentMenu(mainMenu);
    }

    public void mainMenuInit() {
        mainMenu.getMenuItems().add(new MenuItem("1. Вывести трёхзначное натуральное число и его наибольшую цифру", new BiggestFigureAction()));
        mainMenu.getMenuItems().add(new MenuItem("2. Вывести 3 трёхзначных натуральных чисел и сумму их первых цифр", new SumFirstDigitsAction()));
        mainMenu.getMenuItems().add(new MenuItem("3. Выводит на экран 3 случайно сгенерированных трёхзначных числа и разницу между числом получившимся методом последовательной записи 1-го и 2-го числа и третьим числом", new ComparisonNumbersAction()));
        mainMenu.getMenuItems().add(new MenuItem("4. Вывести трёхзначное натуральное число и его сумму цифр", new SumDigitsAction()));
    }


}
