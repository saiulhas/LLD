package DesignPatterns._04Factory.practice.Database.Factory;
import DesignPatterns._04Factory.practice.Database.Db.DBType;

public class DBFactoryFactory {
    public static DBFactory  createFactory(DBType db){
        return switch(db){
            case SQL -> new MySqlFactory();
            case NoSQL -> new NoSqlFactory();
        };
    }
}
