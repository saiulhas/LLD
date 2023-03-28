package DesignPatterns._04Factory.practice.Database.Db;

import DesignPatterns._04Factory.DB.DBFactory;
import DesignPatterns._04Factory.practice.Database.Query.Query;

public interface Database {
    public void connect();
    public void setThreadPool();
    public Query createQuery();
}
