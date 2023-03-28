package DesignPatterns._04Factory.UI;

import DesignPatterns._04Factory.UI.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter f = new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactory = f.createUIFactory();
        Menu menu = uiFactory.createMenu();
    }
}
