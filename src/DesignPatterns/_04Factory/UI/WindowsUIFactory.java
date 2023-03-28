package DesignPatterns._04Factory.UI;

import DesignPatterns._04Factory.UI.components.button.Button;
import DesignPatterns._04Factory.UI.components.dropdown.Dropdown;
import DesignPatterns._04Factory.UI.components.menu.Menu;
import DesignPatterns._04Factory.UI.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        System.out.println("Windows menu");
        return new WindowsMenu();
    }

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
