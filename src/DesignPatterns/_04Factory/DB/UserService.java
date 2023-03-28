package DesignPatterns._04Factory.DB;

import DesignPatterns._04Factory.UI.UIFactory;
import DesignPatterns._04Factory.UI.UIFactoryFactory;

public class UserService {
    private SupportedDB supportedDB;

    public UserService(SupportedDB db) {
        this.supportedDB = db;
    }

    public DBFactory createDBFactory(){
        return DBFactoryFactory.createUIFactory(supportedDB);
    }
}
