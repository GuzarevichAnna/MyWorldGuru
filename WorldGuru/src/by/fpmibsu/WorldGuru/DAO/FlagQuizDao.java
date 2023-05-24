package by.fpmibsu.WorldGuru.DAO;

import by.fpmibsu.WorldGuru.entity.Country;
import by.fpmibsu.WorldGuru.entity.FlagQuiz;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlagQuizDao implements ModeDao<Integer, FlagQuiz> {
    private Connection connection;

    public FlagQuizDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(FlagQuiz flagQuiz) throws DaoException {
        String sql = "INSERT INTO FlagQuiz (Country_ID, Variant1, Variant2, Variant3, 4) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, flagQuiz.getAnswerCountry().getID());
            statement.setInt(2, flagQuiz.getFirstVariant().getID());
            statement.setInt(3, flagQuiz.getSecondVariant().getID());
            statement.setInt(4, flagQuiz.getThirdVariant().getID());
            statement.setInt(5, flagQuiz.getFourthVariant().getID());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            throw new DaoException("Error creating FlagQuiz", e);
        }
    }

    @Override
    public FlagQuiz read(Integer id) throws DaoException {
        String sql = "SELECT * FROM FlagQuiz WHERE FlagQuiz_ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int flagQuizID = resultSet.getInt("FlagQuiz_ID");
                int answerCountryID = resultSet.getInt("Country_ID");
                int variant1ID = resultSet.getInt("Variant1");
                int variant2ID = resultSet.getInt("Variant2");
                int variant3ID = resultSet.getInt("Variant3");
                int variant4ID = resultSet.getInt("Variant4");
                Country answerCountry = new CountryDao(connection).read(answerCountryID);
                Country variant1 = new CountryDao(connection).read(variant1ID);
                Country variant2 = new CountryDao(connection).read(variant2ID);
                Country variant3 = new CountryDao(connection).read(variant3ID);
                Country variant4 = new CountryDao(connection).read(variant4ID);
                return new FlagQuiz(flagQuizID, answerCountry, variant1, variant2, variant3, variant4);
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new DaoException("Error reading FlagQuiz", e);
        }
    }

    @Override
    public FlagQuiz update(FlagQuiz flagQuiz) throws DaoException {
        String sql = "UPDATE FlagQuiz SET Country_ID = ?, Variant1 = ?, Variant2 = ?, Variant3 = ?, Variant4 = ? WHERE FlagQuiz_ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, flagQuiz.getAnswerCountry().getID());
            statement.setInt(2, flagQuiz.getFirstVariant().getID());
            statement.setInt(3, flagQuiz.getSecondVariant().getID());
            statement.setInt(4, flagQuiz.getThirdVariant().getID());
            statement.setInt(5, flagQuiz.getFourthVariant().getID());
            statement.setInt(6, flagQuiz.getFlagQuizID());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                return flagQuiz;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new DaoException("Error updating FlagQuiz", e);
        }
    }

    @Override
    public boolean delete(Integer id) throws DaoException {
        String sql = "DELETE FROM FlagQuiz WHERE FlagQuiz_ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            throw new DaoException("Error deleting FlagQuiz", e);
        }
    }

    @Override
    public List<FlagQuiz> readAll() throws DaoException {
        String sql = "SELECT * FROM FlagQuiz";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            List<FlagQuiz> flagQuizzes = new ArrayList<>();
            while (resultSet.next()) {
                int flagQuizID = resultSet.getInt("FlagQuiz_ID");
                int answerCountryID = resultSet.getInt("Country_ID");
                int variant1ID = resultSet.getInt("Variant1");
                int variant2ID = resultSet.getInt("Variant2");
                int variant3ID = resultSet.getInt("Variant3");
                int variant4ID = resultSet.getInt("Variant4");
                Country answerCountry = new CountryDao(connection).read(answerCountryID);
                Country variant1 = new CountryDao(connection).read(variant1ID);
                Country variant2 = new CountryDao(connection).read(variant2ID);
                Country variant3 = new CountryDao(connection).read(variant3ID);
                Country variant4 = new CountryDao(connection).read(variant4ID);
                flagQuizzes.add(new FlagQuiz(flagQuizID, answerCountry, variant1, variant2, variant3, variant4));
            }
            return flagQuizzes;
        } catch (SQLException e) {
            throw new DaoException("Error reading FlagQuizzes", e);
        }
    }
}
