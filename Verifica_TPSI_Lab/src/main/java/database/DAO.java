package database;

import beans.Utente;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public class DAO {
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs = null;
    public Connection getCon() throws SQLException{
        if (con == null) {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setUser("root");
            ds.setPassword("");
            ds.setPortNumber(3306);
            ds.setDatabaseName("verifica");
            try
            {
                con = ds.getConnection();
            }catch (SQLException e)
            {
                System.out.println(e);
            }
        }

        return con;
    }

    public ResultSet getUtenti() throws SQLException {
        String sql = "select * from utenti";

        con = getCon();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        }catch (SQLException e) {
            System.out.println(e);
        }

        return rs;
    }

    public int insertUtente(Utente utente) throws SQLException {
        String sql = "insert into utenti(nome, cognome, email, password) values(?,?)";
        int result = 0;
        try
        {
            con = getCon();
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, rs.getString("nome"));
            ps.setString(2, rs.getString("cognome"));
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            rs.next();
            return rs.getInt(1);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean isUserRegistered(String email){
        boolean res = false;
        try {
            ps = getCon().prepareStatement("SELECT email FROM utenti WHERE email = ?");
            ps.setString(1, email);
            ResultSet resultSet = ps.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
