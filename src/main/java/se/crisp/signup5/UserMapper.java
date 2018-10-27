package se.crisp.signup5;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

  @Select(
    "select * from users where email = #{email}"
  )
  User findByEmail(@Param("email") String email);

  @Select(
    "select * from users"
  )
  List<User> findAll();

}
