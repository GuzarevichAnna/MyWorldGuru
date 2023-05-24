package by.fpmibsu.WorldGuru.DAO;

import by.fpmibsu.WorldGuru.entity.CompareFactsQuiz;
import by.fpmibsu.WorldGuru.entity.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompareFactsQuizDao implements ModeDao<Integer, CompareFactsQuiz> {
    private Connection connection;

    public CompareFactsQuizDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(CompareFactsQuiz compareFactsQuiz) throws DaoException {
        String sql = "INSERT INTO CompareFactQuiz (Question1, Question2, Question3, Question4, Variant1, Variant2, Variant3, Variant4, Answer1, Answer2, Answer3, Answer4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, compareFactsQuiz.getFirstQuestion());
            statement.setString(2, compareFactsQuiz.getSecondQuestion());
            statement.setString(3, compareFactsQuiz.getThirdQuestion());
            statement.setString(4, compareFactsQuiz.getFourthQuestion());
            statement.setInt(5, compareFactsQuiz.getFirstVariant().getID());
            statement.setInt(6, compareFactsQuiz.getSecondVariant().getID());
            statement.setInt(7, compareFactsQuiz.getThirdVariant().getID());
            statement.setInt(8, compareFactsQuiz.getFourthVariant().getID());
            statement.setInt(9, compareFactsQuiz.getFirstAnswer());
            statement.setInt(10, compareFactsQuiz.getSecondAnswer());
            statement.setInt(11, compareFactsQuiz.getThirdAnswer());
            statement.setInt(12, compareFactsQuiz.getFourthAnswer());

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            throw new DaoException("Error creating CompareFactsQuiz", e);
        }
    }

    @Override
    public CompareFactsQuiz read(Integer id) throws DaoException {
        String sql = "SELECT * FROM CompareFactQuiz WHERE CompareFactQuiz_ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int compareFactsQuizID = resultSet.getInt("CompareFactQuiz_ID");
                String firstQuestion = resultSet.getString("Question1");
                String secondQuestion = resultSet.getString("Question2");
                String thirdQuestion = resultSet.getString("Question3");
                String fourthQuestion = resultSet.getString("Question4");
                int variant1ID = resultSet.getInt("Variant1");
                int variant2ID = resultSet.getInt("Variant2");
                int variant3ID = resultSet.getInt("Variant3");
                int variant4ID = resultSet.getInt("Variant4");
                int firstAnswer = resultSet.getInt("Answer1");
                int secondAnswer = resultSet.getInt("Answer2");
                int thirdAnswer = resultSet.getInt("Answer3");
                int fourthAnswer = resultSet.getInt("Answer4");
                Country variant1 = new CountryDao(connection).read(variant1ID);
                Country variant2 = new CountryDao(connection).read(variant2ID);
                Country variant3 = new CountryDao(connection).read(variant3ID);
                Country variant4 = new CountryDao(connection).read(variant4ID);

                return new CompareFactsQuiz(compareFactsQuizID, firstQuestion, secondQuestion, thirdQuestion, fourthQuestion, variant1, variant2, variant3, variant4, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer);
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new DaoException("Error reading CompareFactsQuiz", e);
        }
    }

    @Override
    public CompareFactsQuiz update(CompareFactsQuiz compareFactsQuiz) throws DaoException {
        String sql = "UPDATE CompareFactQuiz SET Question1 = ?, Question2 = ?, Question3 = ?, Question4 = ?, Variant1 = ?, Variant2 = ?, Variant3 = ?, Variant4 = ?, Answer1 = ?, Answer2 = ?, Answer3 = ?, Answer4 = ? WHERE CompareFactQuiz_ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, compareFactsQuiz.getFirstQuestion());
            statement.setString(2, compareFactsQuiz.getSecondQuestion());
            statement.setString(3, compareFactsQuiz.getThirdQuestion());
            statement.setString(4, compareFactsQuiz.getFourthQuestion());
            statement.setInt(5, compareFactsQuiz.getFirstVariant().getID());
            statement.setInt(6, compareFactsQuiz.getSecondVariant().getID());
            statement.setInt(7, compareFactsQuiz.getThirdVariant().getID());
            statement.setInt(8, compareFactsQuiz.getFourthVariant().getID());
            statement.setInt(9, compareFactsQuiz.getFirstAnswer());
            statement.setInt(10, compareFactsQuiz.getSecondAnswer());
            statement.setInt(11, compareFactsQuiz.getThirdAnswer());
            statement.setInt(12, compareFactsQuiz.getFourthAnswer());
            statement.setInt(13, compareFactsQuiz.getCompareFactsQuizID());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                return compareFactsQuiz;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new DaoException("Error updating CompareFactsQuiz", e);
        }
    }

    @Override
    public boolean delete(Integer id) throws DaoException {
        String sql = "DELETE FROM CompareFactQuiz WHERE CompareFactQuiz_ID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            throw new DaoException("Error deleting CompareFactsQuiz", e);
        }
    }

    @Override
    public List<CompareFactsQuiz> readAll() throws DaoException {
        String sql = "SELECT * FROM CompareFactQuiz";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            List<CompareFactsQuiz> compareFactsQuizzes = new ArrayList<>();
            while (resultSet.next()) {
                int compareFactsQuizID = resultSet.getInt("CompareFactQuiz_ID");
                String firstQuestion = resultSet.getString("Question1");
                String secondQuestion = resultSet.getString("Question2");
                String thirdQuestion = resultSet.getString("Question3");
                String fourthQuestion = resultSet.getString("Question4");
                int variant1ID = resultSet.getInt("Variant1");
                int variant2ID = resultSet.getInt("Variant2");
                int variant3ID = resultSet.getInt("Variant3");
                int variant4ID = resultSet.getInt("Variant4");
                int firstAnswer = resultSet.getInt("Answer1");
                int secondAnswer = resultSet.getInt("Answer2");
                int thirdAnswer = resultSet.getInt("Answer3");
                int fourthAnswer = resultSet.getInt("Answer4");
                Country variant1 = new CountryDao(connection).read(variant1ID);
                Country variant2 = new CountryDao(connection).read(variant2ID);
                Country variant3 = new CountryDao(connection).read(variant3ID);
                Country variant4 = new CountryDao(connection).read(variant4ID);
                CompareFactsQuiz compareFactsQuiz = new CompareFactsQuiz(compareFactsQuizID, firstQuestion, secondQuestion, thirdQuestion, fourthQuestion, variant1, variant2, variant3, variant4, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer);
                compareFactsQuizzes.add(compareFactsQuiz);
            }
            return compareFactsQuizzes;
        } catch (SQLException e) {
            throw new DaoException("Error reading CompareFactsQuizzes", e);
        }
    }
}