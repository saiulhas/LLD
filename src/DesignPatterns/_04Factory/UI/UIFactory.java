package DesignPatterns._04Factory.UI;

import DesignPatterns._04Factory.UI.components.button.Button;
import DesignPatterns._04Factory.UI.components.dropdown.Dropdown;
import DesignPatterns._04Factory.UI.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    Dropdown createDropdown();
}
