package main;

public interface IUserRepository {
    public User FindByUserName(String userName);
    public void Save(User user);
}
