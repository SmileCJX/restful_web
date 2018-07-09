package pers.caijx.restful.utils;

import pers.caijx.restful.utils.constants.DBConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by [DBConstants]|描述:Logminer配置参数 on 2017/7/14/014.
 */
public class DataBase {

    public static Connection getSourceDataBase() throws SQLException {
        Connection conn= null;
        String url = DBConstants.DB_URL;
        String user = DBConstants.DB_USERNAME;
        String pwd = DBConstants.DB_PASSWORD;
        try {
            conn = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
