package com.progressoft.abusair;

public interface IUserDao {
    void persist(User user);

    void approveUser(User user);

    void checkerApproveUser(User user);

    void checkerRejectUser(User user);

    void rejectUser(User user);

    void returnUser(User user);

    void checkerCancel(User user);
}
