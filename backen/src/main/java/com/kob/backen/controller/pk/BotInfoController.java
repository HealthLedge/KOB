package com.kob.backen.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public List<Map<String, String>> getBotInfo() {
        List<Map<String, String>> list = new LinkedList<>();
        Map<String, String> a = new HashMap<>();
        a.put("caonima", "shabi");
        a.put("nimabi", "dashabi");
        Map<String, String> b = new HashMap<>();
        b.put("shabilaji", "bi");
        b.put("nima", "legebi");
        list.add(a);
        list.add(b);
        return list;
    }
}
