package by.fpmibsu.WorldGuru.DAO;
import by.fpmibsu.WorldGuru.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements VisitorDao<Integer, User> {
    private Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(User user) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO User (ID, Nickname, Password, FlagsPassed, MapPassed, FactQuizPassed, CompareFactsPassed, FlagsFailed, MapFailed, FactQuizFailed, CompareFactsFailed, UserMark, IsAdmin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            statement.setInt(1, user.getID());
            statement.setString(2, user.getNickname());
            statement.setString(3, user.getPassword());
            statement.setInt(4, user.getFlagPassed());
            statement.setInt(5, user.getMapPassed());
            statement.setInt(6, user.getFactQuizPassed());
            statement.setInt(7, user.getCompareFactsPassed());
            statement.setInt(8, user.getFlagFailed());
            statement.setInt(9, user.getMapFailed());
            statement.setInt(10, user.getFactQuizFailed());
            statement.setInt(11, user.getCompareFactsFailed());
            statement.setDouble(12, user.getUserMark());
            statement.setBoolean(13, user.isAdmin());
            int rowsInserted = statement.executeUpdate();
            statement.close();
            return rowsInserted > 0;
        } catch (SQLException e) {
            throw new DaoException("Error creating user", e);
        }
    }

    @Override
    public User read(Integer id) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM User WHERE ID = ?"
            );
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            User user = null;
            if (resultSet.next()) {
                user = createFromResultSet(resultSet);
            }
            resultSet.close();
            statement.close();
            if (user == null) {
                throw new DaoException("User not found with ID " + id);
            }
            return user;
        } catch (SQLException e) {
            throw new DaoException("Error reading user", e);
        }
    }

    @Override
    public User update(Integer id, User user) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE User SET Nickname = ?, Password = ?, FlagsPassed = ?, MapPassed = ?, FactQuizPassed = ?, CompareFactsPassed = ?, FlagsFailed = ?, MapFailed = ?, FactQuizFailed = ?, CompareFactsFailed = ?, UserMark = ?, IsAdmin = ? WHERE ID = ?"
            );
            statement.setInt(1, user.getID());
            statement.setString(2, user.getNickname());
            statement.setString(3, user.getPassword());
            statement.setInt(4, user.getFlagPassed());
            statement.setInt(5, user.getMapPassed());
            statement.setInt(6, user.getFactQuizPassed());
            statement.setInt(7, user.getCompareFactsPassed());
            statement.setInt(8, user.getFlagFailed());
            statement.setInt(9, user.getMapFailed());
            statement.setInt(10, user.getFactQuizFailed());
            statement.setInt(11, user.getCompareFactsFailed());
            statement.setDouble(12, user.getUserMark());
            statement.setBoolean(13, user.isAdmin());
            int rowsUpdated = statement.executeUpdate();
            statement.close();
            if (rowsUpdated == 0) {
                throw new DaoException("User not found with ID " + id);
            }
            return user;
        } catch (SQLException e) {
            throw new DaoException("Error updating user", e);
        }
    }

    @Override
    public boolean delete(Integer id) throws DaoException {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM User WHERE ID = ?"
            );
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            statement.close();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            throw new DaoException("Error deleting user", e);
        }
    }

    @Override
    public List<User> readAll() throws DaoException {
        try {
            List<User> users = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM User");
            while (resultSet.next()) {
                User user = createFromResultSet(resultSet);
                users.add(user);
            }
            resultSet.close();
            statement.close();
            return users;
        } catch (SQLException e) {
            throw new DaoException("Error reading all users", e);
        }
    }

    private User createFromResultSet(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("ID");
        String nickname = resultSet.getString("Nickname");
        String password = resultSet.getString("Password");
        int flagsPassed = resultSet.getInt("FlagsPassed");
        int mapPassed = resultSet.getInt("MapPassed");
        int factQuizPassed = resultSet.getInt("FactQuizPassed");
        int compareFactsPassed = resultSet.getInt("CompareFactsPassed");
        int flagsFailed = resultSet.getInt("FlagsFailed");
        int mapFailed = resultSet.getInt("MapFailed");
        int factQuizFailed = resultSet.getInt("FactQuizFailed");
        int compareFactsFailed = resultSet.getInt("CompareFactsFailed");
        double userMark = resultSet.getDouble("UserMark");
        boolean isAdmin = resultSet.getBoolean("IsAdmin");
        return new User(id, nickname, password, flagsPassed, mapPassed, factQuizPassed, compareFactsPassed, flagsFailed, mapFailed, factQuizFailed, compareFactsFailed, userMark, isAdmin);
    }
}
