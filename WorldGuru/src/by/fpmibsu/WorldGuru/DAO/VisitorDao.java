package by.fpmibsu.WorldGuru.DAO;

import by.fpmibsu.WorldGuru.entity.User;
import by.fpmibsu.WorldGuru.entity.VisitorPrototype;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface VisitorDao<ID, T extends VisitorPrototype> {
    boolean create(T t) throws DaoException;

    T read(ID id) throws DaoException;

    User update(Integer id, User user) throws DaoException;

    boolean delete(ID id) throws DaoException;

    List<T> readAll() throws DaoException;

    default void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            // log
        }
    }

    default void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close(); // or connection return code to the pool
            }
        } catch (SQLException e) {
            // log
        }
    }
}


