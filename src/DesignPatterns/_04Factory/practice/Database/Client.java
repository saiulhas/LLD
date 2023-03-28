package DesignPatterns._04Factory.practice.Database;

import DesignPatterns._04Factory.practice.Database.Db.DBType;
import DesignPatterns._04Factory.practice.Database.Db.Database;


public class Client {

    public static void main(String[] args) {
        UserService us = new UserService(DBType.SQL);
        Database db = us.getDatabaseObj();
        db.createQuery();

    }




}
