package DesignPatterns._04Factory.practice.Database.Db;

import DesignPatterns._04Factory.DB.DBFactory;
import DesignPatterns._04Factory.practice.Database.Db.Database;
import DesignPatterns._04Factory.practice.Database.Query.Query;
import DesignPatterns._04Factory.practice.Database.Query.SqlQuery;

public class MySqlDb implements Database {
    @Override
    public void connect() {

    }

    @Override
    public void setThreadPool() {

    }

    @Override
    public Query createQuery() {
        System.out.println("SQL query generated");
        return new SqlQuery();
    }
}
