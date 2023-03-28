package DesignPatterns._04Factory.DB;

import DesignPatterns._01Singleton.DBConn;
import DesignPatterns._04Factory.UI.UIFactoryFactory;

public class OracleDB implements Database {
    @Override
    public void connect() {

    }

    @Override
    public void changeURL() {

    }

    @Override
    public DBFactory createFactory() {
       return null;
    }

    @Override
    public String getVersion() {
        return null;
    }
}
