package BankMangementSystem.src;
import java.sql.*;
public class Conn {
    // public static void main(String[] args) {
    //     System.out.println("hello");
    // }
    Connection c;
    Statement s;
    public Conn(){
        try{
        // Class.forName(driverClassName);
         c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Rahul@#123");
         s= c.createStatement();
         
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
