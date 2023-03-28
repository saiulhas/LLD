package DesignPatterns._04Factory.DB;

public interface Database {
    public void connect();
    public void changeURL();
    public DBFactory createFactory();
    public String getVersion();
}
