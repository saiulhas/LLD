package DesignPatterns._04Factory.practice.Database.Factory;

import DesignPatterns._04Factory.practice.Database.Db.Database;
import DesignPatterns._04Factory.practice.Database.Db.NoSqlDb;
import DesignPatterns._04Factory.practice.Database.Query.NoSqlQuery;
import DesignPatterns._04Factory.practice.Database.Query.Query;

public class NoSqlFactory implements DBFactory{

    @Override
    public Database getDb() {
        return new NoSqlDb();
    }
}
