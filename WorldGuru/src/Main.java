import by.fpmibsu.WorldGuru.DAO.ConnectionCreator;
import by.fpmibsu.WorldGuru.DAO.CountryDao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println(1);
        Connection connection = ConnectionCreator.createConnection();
        System.out.println(2);
        CountryDao countryDao = new CountryDao(connection);
        System.out.println(3);
    }
}