package org.thy.thy.business.abstracts;

import org.thy.thy.business.requests.CreatUserRequest;
import org.thy.thy.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    boolean add(CreatUserRequest creatUserRequest);

    Optional<User> getByEmail(String email);

}
