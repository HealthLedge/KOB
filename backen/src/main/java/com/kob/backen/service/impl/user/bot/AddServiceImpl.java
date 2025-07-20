package com.kob.backen.service.impl.user.bot;

import com.kob.backen.mapper.BotMapper;
import com.kob.backen.pojo.Bot;
import com.kob.backen.pojo.User;
import com.kob.backen.service.impl.utils.UserDetailsImpl;
import com.kob.backen.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AddServiceImpl implements AddService {
    @Autowired
    private BotMapper botMapper;

    @Override
    public Map<String, String> add(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();

        String title = data.get("title");
        String description = data.get(("description"));
        String content = data.get("content");

        Map<String, String> map = new HashMap<>();

        if(title == null || title.length() == 0) {
            map.put("error_message", "标题长度不能大于100");
            return map;
        }

        if(title.length() > 100) {
            map.put("error_message", "标题长度不能大于100");
            return map;
        }

        if(description == null || description.length() == 0) {
            description = "这个用户咩都冇留底";
        }

        if(description.length() > 300) {
            map.put("error_message", "调理农务， 咁长做咩");
            return map;
        }

        if(content == null || content.length() == 0) {
            map.put("error_message", "顶你个肺，冇嘢啊！");
            return map;
        }

        if(content.length() > 10000) {
            map.put("error_message", "写咁长做咩");
            return map;
        }

        Date now = new Date();
        Bot bot = new Bot(null, user.getId(), title, description, content, 1500, now, now);

        botMapper.insert(bot);
        map.put("error_message", "success");
        return map;
    }
}
