package DesignPatterns._01Singleton;

public class DBConn {
    private static DBConn obj;

    private DBConn(){

    }

    public static DBConn getObj(){
        //single threaded
        if(obj==null) obj = new DBConn();

        //multithreaded
        if(obj==null){
            synchronized(DBConn.class){
                if(obj==null){
                    obj = new DBConn();
                }
            }
        }
        return obj;
    }

}
