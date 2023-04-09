package by.fpmibsu.WorldGuru.DAO;
import by.fpmibsu.WorldGuru.entity.User;

import java.util.List;

public class UserDao implements VisitorDao<Integer, User>{
    @Override
    public boolean create(User user) throws DaoException {
        return false;
    }

    @Override
    public User read(Integer integer) throws DaoException {
        return null;
    }

    @Override
    public User update(Integer integer) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(Integer integer) throws DaoException {
        return false;
    }

    @Override
    public List<User> readAll() throws DaoException {
        return null;
    }
}
