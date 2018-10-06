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

  @Autowired
  public MainController(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @GetMapping(path = "/find")
  public @ResponseBody
  User findUser(@RequestParam String email) {
    return userMapper.findByEmail(email);
  }

  @GetMapping(path = "/all")
  public @ResponseBody
  List<User> getAllUsers() {
    return userMapper.findAll();
  }


  //  @GetMapping(path = "/add")
//  public @ResponseBody
//  String addNewUser(@RequestParam String name, @RequestParam String email) {
//    User n = new User();
//    n.setName(name);
//    n.setEmail(email);
//    userMapper.save(n);
//    return "Saved";
//  }

}