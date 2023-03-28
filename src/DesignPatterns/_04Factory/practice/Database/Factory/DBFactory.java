package DesignPatterns._04Factory.practice.Database.Factory;

import DesignPatterns._04Factory.practice.Database.Db.Database;
import DesignPatterns._04Factory.practice.Database.Query.Query;

public interface DBFactory {
    public Database getDb();
}
