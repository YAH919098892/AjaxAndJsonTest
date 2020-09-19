package jsontest;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.ObjectArrayCodec;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.geo.LineString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
//    解决json乱码
//    ,produces="application/json;charset=utf-8"
    @RequestMapping(value = "/a3",produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<User> an(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        User user=new User(11,"杨安56华","广州");
        User user2=new User(22,"杨安华","广州");
        User user3=new User(33,"杨安华","广州");
        User user4=new User(44,"杨安华","广州");
        List<User> userList=new ArrayList<>();
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
//        JSONObject object=new JSONObject();
//        String userstring=object.toJSONString(user);
//        System.out.println("对象转化为字符串"+userstring);
//        JSONObject object1 = object.parseObject(userstring);
//        System.out.println(object1.toJavaObject(User.class).toString());
////        System.out.println("字符串转化成对象"+user1);
////        System.out.println(user1.getName());
//        System.out.println(user.toString());
//        response.getWriter().println(userList);

        return userList;
    }



}
