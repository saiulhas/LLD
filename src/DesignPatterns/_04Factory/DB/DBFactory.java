package DesignPatterns._04Factory.DB;

public interface DBFactory {

    public Query createQuery();
    public Transaction createTransaction();
    public Updation createUpdation();
}
