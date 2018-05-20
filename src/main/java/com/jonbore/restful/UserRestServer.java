package com.jonbore.restful;

import com.jonbore.entity.User;
import com.jonbore.entity.ViewObject;
import com.jonbore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bo.zhou
 * @date 2018/5/19
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserRestServer {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/sayHi")
    public ViewObject greeting() {
        ViewObject viewObject = new ViewObject();
        viewObject.setCode(0);
        viewObject.setContent("hi,my jonbore");
        viewObject.setMessage("请求成功");
        viewObject.setStatus("success");
        return viewObject;
    }

    @GetMapping(value = "/echo")
    public ViewObject echo(@RequestParam(value = "name", defaultValue = "bo.zhou") String name) {
        ViewObject viewObject = new ViewObject();
        viewObject.setCode(0);
        viewObject.setContent("hello,my " + name);
        viewObject.setMessage("请求成功");
        viewObject.setStatus("success");
        return viewObject;
    }

    @PostMapping(value = "/creating")
    public ViewObject creating(User user) {
        String id = userService.save(user);
        ViewObject viewObject = new ViewObject();
        viewObject.setCode(0);
        viewObject.setContent("用户 " + user.getUserName() + " 数据库唯一标识ID: " + id);
        viewObject.setMessage("保存成功");
        viewObject.setStatus("success");
        return viewObject;
    }

    @DeleteMapping(value = "/deleting")
    public ViewObject deleting(@RequestParam(value = "id") String id) {
        boolean result = userService.deleteById(id);
        ViewObject viewObject = new ViewObject();
        viewObject.setCode(result?0:1);
        viewObject.setContent(result);
        viewObject.setMessage(result?"删除成功":"删除失败");
        viewObject.setStatus("success");
        return viewObject;
    }

    @PutMapping(value = "/updating")
    public ViewObject updating(User user) {
        boolean result = userService.update(user);
        ViewObject viewObject = new ViewObject();
        viewObject.setCode(result?0:1);
        viewObject.setContent(result);
        viewObject.setMessage(result?"更新成功":"更新失败");
        viewObject.setStatus("success");
        return viewObject;
    }

    @GetMapping(value = "/findById")
    public ViewObject findById(@RequestParam(value = "id") String id) {
        User user = userService.findById(id);
        ViewObject viewObject = new ViewObject();
        viewObject.setCode(0);
        viewObject.setContent(user);
        viewObject.setMessage("查询成功");
        viewObject.setStatus("success");
        return viewObject;
    }

    @PostMapping(value = "/findByMap")
    public ViewObject findByMap(User user) {
        List<User> userList = userService.findByMap(user);
        ViewObject viewObject = new ViewObject();
        viewObject.setCode(0);
        viewObject.setContent(userList);
        viewObject.setMessage("查询成功");
        viewObject.setStatus("success");
        return viewObject;
    }

}
