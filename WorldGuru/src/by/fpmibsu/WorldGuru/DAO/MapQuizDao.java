package by.fpmibsu.WorldGuru.DAO;

import by.fpmibsu.WorldGuru.entity.MapQuiz;

import java.util.List;

public class MapQuizDao implements ModeDao<String, MapQuiz> {
    @Override
    public boolean create(MapQuiz mapQuiz) throws DaoException {
        return false;
    }

    @Override
    public MapQuiz read(String s) throws DaoException {
        return null;
    }

    @Override
    public MapQuiz update(String s) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(String s) throws DaoException {
        return false;
    }

    @Override
    public List<MapQuiz> readAll() throws DaoException {
        return null;
    }
}
