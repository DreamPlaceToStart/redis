package com.chr.service;

import com.chr.domain.User;

/**
 * @author Edwin Chen
 */
public interface UserOperationsService {
    void add(User user);

    User getUser(String key);

}
