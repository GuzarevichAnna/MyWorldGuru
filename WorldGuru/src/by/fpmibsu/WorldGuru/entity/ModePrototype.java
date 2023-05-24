package by.fpmibsu.WorldGuru.entity;

import java.sql.Time;

public abstract class ModePrototype {
    Time modeTimer;
    String nameOfRegime;
    VisitorPrototype userNow;
    public abstract boolean complete();
}
