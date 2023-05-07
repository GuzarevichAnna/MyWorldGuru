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
    User(int ID, String nickname, String password,
         int flagPassed, int mapPassed, int factQuizPassed, int compareFactsPassed,
         int flagFailed, int mapFailed, int factQuizFailed, int compareFactsFailed,
         double userMark, boolean isAdmin){
        this.ID = ID;
        this.nickname = nickname;
        this.password = password;
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
