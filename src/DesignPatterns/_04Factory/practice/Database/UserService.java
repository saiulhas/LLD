package DesignPatterns._04Factory.practice.Database;

import DesignPatterns._04Factory.practice.Database.Db.DBType;
import DesignPatterns._04Factory.practice.Database.Db.Database;
import DesignPatterns._04Factory.practice.Database.Factory.DBFactory;
import DesignPatterns._04Factory.practice.Database.Factory.DBFactoryFactory;

public class UserService {
    DBType type;
    DBFactory db;

    public UserService(DBType type) {
        this.type = type;
        db = DBFactoryFactory.createFactory(type);
    }

    public Database getDatabaseObj() {
        return db.getDb();
    }

}
