package bays.service;

public interface UserService {
    Object selectUserById(int id);
    Object selectUserByName(String name);
}
