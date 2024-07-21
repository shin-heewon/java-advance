package board.lib;


import collectionEx.MapEx.PropertiesEx;
import com.sun.source.tree.TryTree;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

  private Properties properties = new Properties();
  private Connection con;


  private static final ConnectionFactory instance = new ConnectionFactory();

  private ConnectionFactory() {
  }

  public static ConnectionFactory getInstance() {
    return instance;
  }


  public Connection open() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL JDBC 드라이버 로드
      properties.load(ConnectionFactory.class.getResourceAsStream("../dto/db.properties"));
      con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("id"),
          properties.getProperty("pwd"));

    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } finally {

    }
    return con;
  }


  public void close() {

    try {
      con.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }

  }


}
