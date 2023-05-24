package by.fpmibsu.WorldGuru.entity;

import java.sql.Time;

public class User extends VisitorPrototype {
    int ID;
    String password;
    double flagsPercent;
    double compareFactsPercent;
    double factQuizPercent;
    double mapPercent;
    double userMark;
    boolean isAdmin;
    int flagPassed;
    int mapPassed;
    int factQuizPassed;
    int compareFactsPassed;
    int flagFailed;
    int mapFailed;
    int factQuizFailed;
    int compareFactsFailed;
    public User(int ID, String nickname, String password,
                int flagPassed, int mapPassed, int factQuizPassed, int compareFactsPassed,
                int flagFailed, int mapFailed, int factQuizFailed, int compareFactsFailed,
                double userMark, boolean isAdmin) {
        this.ID = ID;
        this.nickname = nickname;
        this.password = password;

        this.flagPassed = flagPassed;
        this.mapPassed = mapPassed;
        this.factQuizPassed = factQuizPassed;
        this.compareFactsPassed =compareFactsPassed;

        this.flagFailed = flagFailed;
        this.mapFailed = mapFailed;
        this.factQuizFailed = factQuizFailed;
        this.compareFactsFailed = compareFactsFailed;

        this.flagsPercent = (double) (flagPassed / (flagPassed + flagFailed));
        this.factQuizPercent = (double) (factQuizPassed / (factQuizPassed + factQuizFailed));
        this.compareFactsPercent = (double) (compareFactsPassed / (compareFactsFailed + compareFactsPassed));
        this.mapPercent = (double) (mapPassed / (mapFailed + mapPassed));

        if (isAdmin) {
            this.userMark = 10;
            this.isAdmin = true;
        } else {
            this.userMark = userMark;
            this.isAdmin = false;
        }
    }

    public int getID() {
        return this.ID;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPassword() {
        return this.password;
    }

    public int getFlagPassed() {
        return this.flagPassed;
    }

    public int getMapPassed() {
        return this.mapPassed;
    }

    public int getFactQuizPassed() {
        return this.factQuizPassed;
    }

    public int getCompareFactsPassed() {
        return this.compareFactsPassed;
    }

    public int getFlagFailed() {
        return this.flagFailed;
    }

    public int getMapFailed() {
        return this.mapFailed;
    }

    public int getFactQuizFailed() {
        return this.factQuizFailed;
    }

    public int getCompareFactsFailed() {
        return this.compareFactsFailed;
    }

    public double getUserMark() {
        return this.userMark;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }
}
