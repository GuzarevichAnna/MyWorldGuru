package by.fpmibsu.WorldGuru.DAO;


import by.fpmibsu.WorldGuru.entity.CompareFactsQuiz;

import java.util.List;

public class CompareFactsQuizDao implements ModeDao<String, CompareFactsQuiz>{
    @Override
    public boolean create(CompareFactsQuiz compareFactsQuiz) throws DaoException {
        return false;
    }

    @Override
    public CompareFactsQuiz read(String s) throws DaoException {
        return null;
    }

    @Override
    public CompareFactsQuiz update(String s) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(String s) throws DaoException {
        return false;
    }

    @Override
    public List<CompareFactsQuiz> readAll() throws DaoException {
        return null;
    }
}
