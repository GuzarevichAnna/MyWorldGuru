package by.fpmibsu.WorldGuru.DAO;

import by.fpmibsu.WorldGuru.entity.FlagQuiz;

import java.util.List;

public class FlagQuizDao implements ModeDao<String, FlagQuiz>{
    @Override
    public boolean create(FlagQuiz flagQuiz) throws DaoException {
        return false;
    }

    @Override
    public FlagQuiz read(String s) throws DaoException {
        return null;
    }

    @Override
    public FlagQuiz update(String s) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(String s) throws DaoException {
        return false;
    }

    @Override
    public List<FlagQuiz> readAll() throws DaoException {
        return null;
    }
}
