package DesignPatterns._04Factory.DB;

import DesignPatterns._04Factory.UI.AndroidUIFactory;
import DesignPatterns._04Factory.UI.WindowsUIFactory;
import DesignPatterns._04Factory.UI.iosUIFactory;

public class DBFactoryFactory {
    public static DBFactory createUIFactory(SupportedDB supportedDB) {
        return switch(supportedDB){
            case SQL -> new SQLFactory();
            case NoSQL -> new NoSQLFactory();
        };
    }
}
