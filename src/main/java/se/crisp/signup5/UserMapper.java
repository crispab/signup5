package se.crisp.signup5;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

  @Select(
    "select * from users where email = #{email}"
  )
  @Results({ @Result(property = "password", column = "pwd") })
  User findByEmail(@Param("email") String email);

  @Select(
    "select * from users"
  )
  @Results({ @Result(property = "password", column = "pwd") })
  List<User> findAll();

}
