package portal.com.learn.springboot.start.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AppController {
    @Autowired
     AppRepository appRepository;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloworld(){
        return appRepository.findByAppkey("myappkey").getName();
    }

}
