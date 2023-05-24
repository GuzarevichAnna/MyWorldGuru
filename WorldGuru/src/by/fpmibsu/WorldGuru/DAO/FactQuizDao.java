package by.fpmibsu.WorldGuru.DAO;

import by.fpmibsu.WorldGuru.entity.Country;
import by.fpmibsu.WorldGuru.entity.FactQuiz;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FactQuizDao implements ModeDao<Integer, FactQuiz> {
    private Connection connection;

    public FactQuizDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(FactQuiz factQuiz) throws DaoException {
        String sql = "INSERT INTO FactQuiz (FactText, Answer, Variant1, Variant2, Variant3, Variant4) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, factQuiz.getFact());
            statement.setInt(2, factQuiz.getAnswer());
            statement.setInt(3, factQuiz.getFirstVariant().getID());
            statement.setInt(4, factQuiz.getSecondVariant().getID());
            statement.setInt(5, factQuiz.getThirdVariant().getID());
            statement.setInt(6, factQuiz.getFourthVariant().getID());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            throw new DaoException("Error creating FactQuiz", e);
        }
    }

    @Override
    public FactQuiz read(Integer id) throws DaoException {
        String sql = "SELECT * FROM FactQuiz WHERE FactQuiz_ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int factQuizID = resultSet.getInt("FactQuiz_ID ");
                String fact = resultSet.getString("FactText");
                int answer = resultSet.getInt("Answer");
                int variant1ID = resultSet.getInt("Variant1");
                int variant2ID = resultSet.getInt("Variant2");
                int variant3ID = resultSet.getInt("Variant3");
                int variant4ID = resultSet.getInt("Variant4");
                Country variant1 = new CountryDao(connection).read(variant1ID);
                Country variant2 = new CountryDao(connection).read(variant2ID);
                Country variant3 = new CountryDao(connection).read(variant3ID);
                Country variant4 = new CountryDao(connection).read(variant4ID);
                return new FactQuiz(factQuizID, fact, variant1, variant2, variant3, variant4, answer);
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new DaoException("Error reading FactQuiz", e);
        }
    }

    @Override
    public FactQuiz update(FactQuiz factQuiz) throws DaoException {
        String sql = "UPDATE FactQuiz SET FactText = ?, Answer = ?, Variant1 = ?, Variant2 = ?, Variant3 = ?, Variant4 = ? WHERE FactQuiz_ID  = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, factQuiz.getFact());
            statement.setInt(2, factQuiz.getAnswer());
            statement.setInt(3, factQuiz.getFirstVariant().getID());
            statement.setInt(4, factQuiz.getSecondVariant().getID());
            statement.setInt(5, factQuiz.getThirdVariant().getID());
            statement.setInt(6, factQuiz.getFourthVariant().getID());
            statement.setInt(7, factQuiz.getFactQuizID());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                return factQuiz;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new DaoException("Error updating FactQuiz", e);
        }
    }

    @Override
    public boolean delete(Integer id) throws DaoException {
        String sql = "DELETE FROM FactQuiz WHERE FactQuiz_ID  = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            throw new DaoException("Error deleting FactQuiz", e);
        }
    }

    @Override
    public List<FactQuiz> readAll() throws DaoException {
        String sql = "SELECT * FROM FactQuiz";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            List<FactQuiz> factQuizzes = new ArrayList<>();
            while (resultSet.next()) {
                int factQuizID = resultSet.getInt("FactQuiz_ID ");
                String fact = resultSet.getString("FactText");
                int answer = resultSet.getInt("Answer");
                int variant1ID = resultSet.getInt("Variant1");
                int variant2ID = resultSet.getInt("Variant2");
                int variant3ID = resultSet.getInt("Variant3");
                int variant4ID = resultSet.getInt("Variant4");
                Country variant1 = new CountryDao(connection).read(variant1ID);
                Country variant2 = new CountryDao(connection).read(variant2ID);
                Country variant3 = new CountryDao(connection).read(variant3ID);
                Country variant4 = new CountryDao(connection).read(variant4ID);
                factQuizzes.add(new FactQuiz(factQuizID, fact, variant1, variant2, variant3, variant4, answer));
            }
            return factQuizzes;
        } catch (SQLException e) {
            throw new DaoException("Error reading FactQuizzes", e);
        }
    }
}