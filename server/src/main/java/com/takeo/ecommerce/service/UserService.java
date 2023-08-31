package com.takeo.ecommerce.service;

import com.takeo.ecommerce.model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    // Add more service methods as needed
}
