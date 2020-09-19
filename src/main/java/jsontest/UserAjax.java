package jsontest;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserAjax {
    @RequestMapping("/aj1")
    public void an(String name, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        System.out.println(name);
        if ("anhua".equals(name)){
            response.getWriter().println("我是安华");
        }
        else response.getWriter().println("不知道是谁");
    }


    @RequestMapping("/a2")
    @ResponseBody
    public List<User> com(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        List<User> userList=new ArrayList<>();
        User user=new User(1,"abh","gz");
        User user1=new User(2,"ah","sh");
        User user2=new User(3,"ah","mm");
        User user3=new User(4,"ah","sz");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

//      //response.getWriter().println(userList);
//        JSONObject object=new JSONObject();
//        String userstring=object.toJSONString(userList);
//       // User u=object.toJavaObject(userstring,User.class);
      return userList;
    }
}
