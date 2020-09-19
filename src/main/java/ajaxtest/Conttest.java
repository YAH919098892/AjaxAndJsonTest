package ajaxtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Conttest {
    @RequestMapping("/aa")
    public String an(){
        return "杨安华hhhhhh";
    }
}
