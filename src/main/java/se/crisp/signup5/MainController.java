package se.crisp.signup5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(path = "/signup")
public class MainController {

  private final UserMapper userMapper;
  private final GroupMapper groupMapper;

  @Autowired
  public MainController(UserMapper userMapper, GroupMapper groupMapper) {
    this.userMapper = userMapper;
    this.groupMapper = groupMapper;
  }

  @GetMapping(path = "/user/find")
  public @ResponseBody
  User findUser(@RequestParam String email) {
    return userMapper.findByEmail(email);
  }

  @GetMapping(path = "/user/all")
  public @ResponseBody
  List<User> getAllUsers() {
    return userMapper.findAll();
  }

  @GetMapping(path = "/group/find")
  public @ResponseBody
  Group findGroupByName(@RequestParam String name) {
    return groupMapper.findByName(name);
  }

  @GetMapping(path = "/group/findByUser")
  public @ResponseBody
  List<Group> findGroupByUser(@RequestParam String email) {
    return groupMapper.findByUser(email);
  }

  @GetMapping(path = "/group/all")
  public @ResponseBody
  List<Group> getAllGroups() {
    return groupMapper.findAll();
  }

}