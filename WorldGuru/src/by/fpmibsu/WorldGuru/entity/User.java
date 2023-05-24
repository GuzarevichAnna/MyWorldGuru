package by.fpmibsu.WorldGuru.entity;

import java.sql.Time;

public class User extends VisitorPrototype {
    int ID;
    String password;
    double flagsPercent;
    double compareFactsPercent;
    double factQuizPercent;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getFlagsPercent() {
        return flagsPercent;
    }

    public void setFlagsPercent(double flagsPercent) {
        this.flagsPercent = flagsPercent;
    }

    public double getCompareFactsPercent() {
        return compareFactsPercent;
    }

    public void setCompareFactsPercent(double compareFactsPercent) {
        this.compareFactsPercent = compareFactsPercent;
    }

    public double getFactQuizPercent() {
        return factQuizPercent;
    }

    public void setFactQuizPercent(double factQuizPercent) {
        this.factQuizPercent = factQuizPercent;
    }

    public double getMapPercent() {
        return mapPercent;
    }

    public void setMapPercent(double mapPercent) {
        this.mapPercent = mapPercent;
    }

    public double getUserMark() {
        return userMark;
    }

    public void setUserMark(double userMark) {
        this.userMark = userMark;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public int getFlagPassed() {
        return flagPassed;
    }

    public void setFlagPassed(int flagPassed) {
        this.flagPassed = flagPassed;
    }

    public int getMapPassed() {
        return mapPassed;
    }

    public void setMapPassed(int mapPassed) {
        this.mapPassed = mapPassed;
    }

    public int getFactQuizPassed() {
        return factQuizPassed;
    }

    public void setFactQuizPassed(int factQuizPassed) {
        this.factQuizPassed = factQuizPassed;
    }

    public int getCompareFactsPassed() {
        return compareFactsPassed;
    }

    public void setCompareFactsPassed(int compareFactsPassed) {
        this.compareFactsPassed = compareFactsPassed;
    }

    public int getFlagFailed() {
        return flagFailed;
    }

    public void setFlagFailed(int flagFailed) {
        this.flagFailed = flagFailed;
    }

    public int getMapFailed() {
        return mapFailed;
    }

    public void setMapFailed(int mapFailed) {
        this.mapFailed = mapFailed;
    }

    public int getFactQuizFailed() {
        return factQuizFailed;
    }

    public void setFactQuizFailed(int factQuizFailed) {
        this.factQuizFailed = factQuizFailed;
    }

    public int getCompareFactsFailed() {
        return compareFactsFailed;
    }

    public void setCompareFactsFailed(int compareFactsFailed) {
        this.compareFactsFailed = compareFactsFailed;
    }

    String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

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
}
