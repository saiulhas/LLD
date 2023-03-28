package DesignPatterns._04Factory.UI;

import DesignPatterns._04Factory.UI.components.button.Button;
import DesignPatterns._04Factory.UI.components.button.iosButton;
import DesignPatterns._04Factory.UI.components.dropdown.Dropdown;
import DesignPatterns._04Factory.UI.components.dropdown.iosDropdown;
import DesignPatterns._04Factory.UI.components.menu.Menu;
import DesignPatterns._04Factory.UI.components.menu.iosMenu;

public class iosUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new iosMenu();
    }

    @Override
    public Button createButton() {
        return new iosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new iosDropdown();
    }
}
