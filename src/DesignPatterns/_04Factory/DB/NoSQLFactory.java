package DesignPatterns._04Factory.DB;

public class NoSQLFactory implements DBFactory{
    @Override
    public Query createQuery() {
        System.out.println("No SQL Query");
        return new NoSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        System.out.println("No SQL Transaction");
        return new NoSqlTransaction();
    }

    @Override
    public Updation createUpdation() {
        return null;
    }
}
