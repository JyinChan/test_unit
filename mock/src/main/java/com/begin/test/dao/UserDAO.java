package com.begin.test.dao;

import com.begin.test.models.UserDO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserDAO {

    private final Map<String, Long> table = new HashMap<>();

    public Long getIdByName(String name) {
        return table.get(name);
    }

    public void create(UserDO userDO) {
        table.put(userDO.getName(), userDO.getId());
    }

    public void modify(UserDO userDO) {
        table.put(userDO.getName(), userDO.getId());
    }
}
