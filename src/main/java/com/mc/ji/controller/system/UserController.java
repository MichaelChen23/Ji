package com.mc.ji.controller.system;

import com.mc.ji.model.UserDO;
import com.mc.ji.service.system.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 系统使用者的Controller
 * @author mc
 * @date 2017-8-8
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping("/")
    String home() {
        return "Hello World! dll";
    }

    @RequestMapping(value = "/view/{id}")
    public UserDO view(@PathVariable Integer id) {
        ModelAndView result = new ModelAndView();
        UserDO userDO = userServiceImpl.getById(id);
        return userDO;
    }

}
