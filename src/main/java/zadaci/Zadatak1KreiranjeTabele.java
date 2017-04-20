package zadaci;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by androiddevelopment on 20.4.17..
 */
public class Zadatak1KreiranjeTabele {

    public static void main(String[] args) {

        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:knjigaOblast.db");

        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                c.close();
            }catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("Uspesno konektovano na bazu");

    }
}
