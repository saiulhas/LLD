package DesignPatterns._04Factory.DB;

public class SQLFactory implements DBFactory{
    @Override
    public Query createQuery() {
        System.out.println("SQL Query");
        return new MySqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        System.out.println("SQL Transaction");
        return new SQLTransaction();
    }

    @Override
    public Updation createUpdation() {
        return null;
    }
}
