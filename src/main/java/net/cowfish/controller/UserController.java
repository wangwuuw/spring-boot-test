
package net.cowfish.controller;


import net.cowfish.dao.UserDao;
import net.cowfish.entity.User;
import net.cowfish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDao userDao;

	@RequestMapping("/createUser")
	public String createUser(String name, Integer age) {
		userService.createUser(name, age);
		return "success";
	}

	@RequestMapping("/getUser")
	public User getUser(Integer id) {

		return userDao.findOne(id);
	}

}
