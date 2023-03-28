package DesignPatterns._04Factory.UI;

import DesignPatterns._04Factory.UI.components.button.AndroidButton;
import DesignPatterns._04Factory.UI.components.button.Button;
import DesignPatterns._04Factory.UI.components.dropdown.AndroidDropdown;
import DesignPatterns._04Factory.UI.components.dropdown.Dropdown;
import DesignPatterns._04Factory.UI.components.menu.AndroidMenu;
import DesignPatterns._04Factory.UI.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        System.out.println("Android menu");
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
