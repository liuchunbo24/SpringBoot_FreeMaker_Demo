package com.freemaker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/11/29.
 */
@Controller
public class StudentController {

    @RequestMapping("testFreeMaker")
    public String student(Map<String,Object> map){
        map.put("name", "Eminem");
        map.put("sex", 1);    //sex:性别，1：男；0：女；

        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "Dr.Dre");
        friend.put("age", 53);
        friends.add(friend);
        friend = new HashMap<String, Object>();
        friend.put("name", "Skylar Grey");
        friend.put("age", 32);
        friends.add(friend);
        map.put("friends", friends);

        return "freemaker";
    }

    @RequestMapping("/testFreeMaker2")
    public String testFreemarker(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello dalaoyang , this is freemarker");
        return "freemaker2";
    }

}
