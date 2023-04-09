package by.fpmibsu.WorldGuru.DAO;

import by.fpmibsu.WorldGuru.entity.FactQuiz;
import java.util.List;

public class FactQuizDao implements ModeDao<String, FactQuiz>{
    @Override
    public boolean create(FactQuiz factQuiz) throws DaoException {
        return false;
    }

    @Override
    public FactQuiz read(String s) throws DaoException {
        return null;
    }

    @Override
    public FactQuiz update(String s) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(String s) throws DaoException {
        return false;
    }

    @Override
    public List<FactQuiz> readAll() throws DaoException {
        return null;
    }
}
