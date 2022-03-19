package main;

import java.util.Date;

public class UserCreateOutputData {
    public String userId;
    public Date created;
    public UserCreateOutputData(String userId, Date created) {
        this.userId = userId;
        this.created = created;
    }
}
