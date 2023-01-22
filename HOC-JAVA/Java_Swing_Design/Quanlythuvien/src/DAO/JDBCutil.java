package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutil {
    public static java.sql.Connection ketnoiJDBC(){

        // xac dinh duong lin va thong so cua msql
        final String url = "jdbc:mysql://localhost:3306/quanlybanhang";
        final String user = "root";
        final String password = "Huuphuc1995ct@";


        try {
            //  Ðang ký Driver phuowg thuong thuc ket noi JDBC
            Class.forName("com.mysql.jdbc.Driver");
            //  tien hanh add dg link url cuar sql vao method connection
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
