package com.chr.service;

import com.chr.domain.User;

public interface UserOperationsService {
    void add(User user);

    User getUser(String key);

}
