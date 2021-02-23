package eu.senla.javacources.menu;

import eu.senla.javacources.menu.actions.DisplayPortInfoAction;

import java.util.ArrayList;

// Создаёт меню
public class MenuInitializer {

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

    public Menu menu;

    public MenuItem root;


    public MenuInitializer() {
        menu = new Menu();
        initRootMenuItem();

    }

    private void initRootMenuItem() {
        root = new MenuItem();
        root.text = "Выберите один из пунктов меню:";
        root.items = new ArrayList<>();

        MenuItem displayPortInfo = new MenuItem();
        displayPortInfo.text = "Посмотреть сколько воды в порту";
        displayPortInfo.action = new DisplayPortInfoAction();

        MenuItem displayShipsInPort = new MenuItem();
        displayPortInfo.text = "Посмотреть список кораблей в порту";
        displayPortInfo.action = new DisplayPortInfoAction();
    }

    public void initMenu() {
    }
}
