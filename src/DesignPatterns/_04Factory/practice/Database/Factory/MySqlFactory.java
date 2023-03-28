package DesignPatterns._04Factory.practice.Database.Factory;

import DesignPatterns._04Factory.practice.Database.Db.Database;
import DesignPatterns._04Factory.practice.Database.Db.MySqlDb;

public class MySqlFactory implements DBFactory{

    @Override
    public Database getDb() {
        return new MySqlDb();
    }
}
