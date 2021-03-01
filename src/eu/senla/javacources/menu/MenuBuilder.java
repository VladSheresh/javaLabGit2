package eu.senla.javacources.menu;

import eu.senla.javacources.menu.actions.ExitAction;
import lombok.Getter;

public class MenuBuilder {

    @Getter
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

/*
     1. Посмотреть сколько воды в порту
     2. Посмотреть список кораблей в порту
     3. Удалить корабль из порта (вода остаётся в порту)
     4. Создать корабль
        -> наполнить корабль контейнерами с водой
     5. Посмотреть список кораблей, ожидающих прибытия в порт
        -> посмотреть инормацию по конкретному кораблю
     6. Загрузить корабль в порт
     7. Выйти из программы
 */
    public void buildMenu() {
        mainMenu = new Menu("Main");
        mainMenuInit();

        Navigator.getInstance().setCurrentMenu(mainMenu);
    }

    public void mainMenuInit() {
        mainMenu.getMenuItems().add(new MenuItem("1. Посмотреть сколько воды в порту", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("2. Посмотреть список кораблей в порту", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("3. Удалить корабль из порта", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("4. Создать корабль", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("5. Посмотреть список кораблей, ожидающих прибытия в порт", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("6. Загрузить корабль в порт", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("7. Выйти из программы", new ExitAction(), null, null));
    }

}
