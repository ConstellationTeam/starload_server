package com.example.starload.Mapper;

import com.example.starload.Domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    //public User select(@Param("userCode") int userCode);

    /**
     * 주어진 유저 코드를 가진 사용자 정보를 되돌린다.
     *
     * @param userCode user_code
     * @return 사용자 정보
     */
    public User get(@Param("userCode") int userCode);

    /**
     * 주어진 유저 코드를 가진 사용자 정보를 되돌린다.
     *
     * @param userIdentity user_identity
     * @return 사용자 정보
     */
    public User getById(@Param("userIdentity") String userIdentity);
     /**
     * 주어진 이메일을 가진 사용자 정보를 되돌린다.
     *
     * @param userEmail user_email
     * @return 사용자 정보
     */
    public User getByEmail(@Param("userEmail") String userEmail);

    /**
     * 사용자를 등록한다.
     *
     * @param user 사용자 정보
     * @return 등록된 사용자의 idx
     */
    public int register(User user);

}