package com.kob.backen.controller.user.bot;

import com.kob.backen.pojo.Bot;
import com.kob.backen.service.user.bot.GetListService;
import com.kob.backen.service.user.bot.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetListController {
    @Autowired
    private GetListService getListService;

    @GetMapping("/user/bot/getlist/")
    public List<Bot> getList() {
        return getListService.getlist();
    }
}
