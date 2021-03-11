package com.offcn.Controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/user-test")
public class UserController {
   /* private List<User> listUser= Collections.synchronizedList(new ArrayList<User>());*/
    @Autowired
    //nihao
    private UserService userService;

    /**
     * 获取一个
     * @return
     */
    @GetMapping("/{id}")
    public User findOne(@PathVariable("id") Integer id){
        return userService.findOne(id);
    }

    /**
     * 查询全部
     * @return
     */
    @GetMapping("/")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
  /*  public List<User> getUserList(){
        return listUser;
    }*/
    /***
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/")
    public String addUser(User user){
        userService.addUser(user);
        return "success";
    }
   /* public String createUser(User user) {
        listUser.add(user);
        return "success";
    }*/

    /**
     * 根据id查询user
     * @param id
     * @return
     */
   // @GetMapping("/{id}")

   /* public User getUser(@PathVariable("id") Integer id){
        for (User user : listUser) {
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }*/

    /**
     * 根据id删除user
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return "success";
    }
    /*public String deleteUser(@PathVariable("id")Integer id){
        listUser.remove(getUser(id));
        return "success";
    }*/
    /**
     * 修改指定id用户信息
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/")
    public String updateUser(User user){
        userService.updateUser(user);
        return "sucess";
    }
  /*  public String updateUser(@PathVariable("id") Integer id,User user) {
        for (User user1 : listUser) {
            if(user1.getId()==id){
                user1.setId(user.getId());
                user1.setAge(user.getAge());
                user1.setUserName(user.getUserName());
            }

        }
        return "success";
    }*/

}
