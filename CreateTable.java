import java.sql.*;


public class CreateTable{
    public static void main(String[] args){

    String url = "jdbc:mysql://localhost:3306/JDBC";
    String user = "root";
    String pass = "";
    String query = "create table if not exists students(id int primary key, name varchar(100), age int, grade varchar(20))";
    try(){
    Class.forName("com.mysql.cj.jdbc.");
    Connection con = DriverManager.getConnection(url,user,pass);
    Statement stmt = con.createStatement();
    stmt.execute(query);
    System.out.println("Table 'Students' Created SuccessFully! ");


}

    catch(Exception e){
        e.printStackTrace();
    }

}


}
