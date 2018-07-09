package pers.caijx.restful.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/12/14/014.
 */
public class DataBaseUtil {

    public static Connection getConnection(String url,String user,String pwd) throws SQLException {
        Connection conn= null;
        try {
            conn = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
