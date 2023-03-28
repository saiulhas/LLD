package DesignPatterns._04Factory.DB;

public class Client {
    public static void main(String[] args) {
        UserService us = new UserService(SupportedDB.NoSQL);
        DBFactory db = us.createDBFactory();
        Query q = db.createQuery();
        Transaction t = db.createTransaction();
    }
}
