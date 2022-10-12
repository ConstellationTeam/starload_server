package com.example.starload.Service;

import com.example.starload.Domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
public interface UserService {
    /**
     * 주어진 userCode를 가진 사용자 정보를 되돌린다.
     *
     * @param userCode 사용자 userCode
     * @return 사용자 정보
     */
    public User get(int userCode);

    /**
     * 주어진 이메일을 가진 사용자 정보를 되돌린다.
     *
     * @param userEmail userEmail
     * @return 사용자 정보
     */
    public User get(String userEmail);

    /**
     * 사용자를 등록한다.
     *
     * @param user 사용자 정보
     * @return 등록된 사용자의 idx
     */
    public User register(User user);
}
