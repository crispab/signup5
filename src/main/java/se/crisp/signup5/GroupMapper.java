package se.crisp.signup5;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GroupMapper {

  @Select(
    "select * from groups where name = #{name}"
  )
  Group findByName(@Param("name") String name);

  @Select(
    "select * from groups"
  )
  List<Group> findAll();

  @Select(
    "select g.* " +
      "from groups g, memberships m, users u " +
      "where m.groupx = g.id and m.userx = u.id and u.email = #{email}"
  )
  List<Group> findByUser(String email);
}
