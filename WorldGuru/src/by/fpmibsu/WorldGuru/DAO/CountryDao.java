package by.fpmibsu.WorldGuru.DAO;

import by.fpmibsu.WorldGuru.entity.Country;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class CountryDao {
    private Connection connection;

    public CountryDao(Connection connection) {
    }

    public void CountryDAO(Connection connection) {
        this.connection = connection;
    }

    public void update(Country country) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "UPDATE countries SET Name = ?, Area = ?, Population = ?, Continent = ?, Fact = ?, Flag = ?, Territory = ? WHERE County_ID = ?"
        );
        statement.setString(1, country.getName());
        statement.setFloat(2, country.getArea());
        statement.setInt(3, country.getPopulation());
        statement.setString(4, country.getContinent());
        statement.setString(5, country.getFact());
        statement.setBytes(6, imageToByteArray(country.getFlag()));
        statement.setBytes(7, imageToByteArray(country.getTerritory()));
        statement.setInt(8, country.getID());
        statement.executeUpdate();
        statement.close();
    }

    public void delete(Country country) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM countries WHERE County_ID = ?"
        );
        statement.setInt(1, country.getID());
        statement.executeUpdate();
        statement.close();
    }

    public ArrayList<Country> readAll() throws SQLException {
        ArrayList<Country> countries = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM countries");
        while (resultSet.next()) {
            Country country = new Country(
                    resultSet.getInt("County_ID"),
                    resultSet.getString("Name"),
                    resultSet.getFloat("Area"),
                    resultSet.getInt("Population"),
                    resultSet.getString("Continent"),
                    resultSet.getString("Fact"),
                    byteArrayToImage(resultSet.getBytes("Flag")),
                    byteArrayToImage(resultSet.getBytes("Territory"))
            );
            countries.add(country);
        }
        resultSet.close();
        statement.close();
        return countries;
    }

    public Country read(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM countries WHERE County_ID = ?"
        );
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Country country = null;
        if (resultSet.next()) {
            country = new Country(
                    resultSet.getInt("County_ID"),
                    resultSet.getString("Name"),
                    resultSet.getFloat("Area"),
                    resultSet.getInt("Population"),
                    resultSet.getString("Continent"),
                    resultSet.getString("Fact"),
                    byteArrayToImage(resultSet.getBytes("Flag")),
                    byteArrayToImage(resultSet.getBytes("Territory"))
            );
        }
        resultSet.close();
        statement.close();
        return country;
    }

    // Helper method to convert Image to byte array
    private byte[] imageToByteArray(Image image) {
        // TODO: Implement this method
        return null;
    }

    // Helper method to convert byte array to Image
    private Image byteArrayToImage(byte[] bytes) {
        // TODO: Implement this method
        return null;
    }
}
