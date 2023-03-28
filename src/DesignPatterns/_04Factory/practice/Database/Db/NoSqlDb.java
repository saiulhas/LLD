package DesignPatterns._04Factory.practice.Database.Db;

import DesignPatterns._04Factory.DB.DBFactory;
import DesignPatterns._04Factory.practice.Database.Query.NoSqlQuery;
import DesignPatterns._04Factory.practice.Database.Query.Query;

public class NoSqlDb implements Database{
    @Override
    public void connect() {

    }

    @Override
    public void setThreadPool() {

    }

    @Override
    public Query createQuery() {
        System.out.println("NoSQL query generated");
        return new NoSqlQuery();
    }
}
