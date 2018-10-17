package com.aglife.yin.controller;

import com.aglife.yin.pojo.ALife;
import com.aglife.yin.pojo.Comment;
import com.aglife.yin.repository.ALifeRepository;
import com.aglife.yin.service.ALifeService;
import com.aglife.yin.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.*;

@Controller
public class HomeController {
    @Autowired
    private ALifeService aLifeService;
    @Autowired
    private CommentService commentService;

    @RequestMapping("/")
    public String Index(Model model) {

        model.addAttribute("hello", "心向光明，美好生活！");
        model.addAttribute("wow", "你所站立的地方，就是你的中国；你怎样，中国便怎样；你是什么，中国便是什么；你有光明，中国便不再黑暗!!!");
        List<ALife> list = aLifeService.findAll();
        if (list.isEmpty())
            list = new ArrayList<ALife>();
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                ALife stu1 = (ALife) o1;
                ALife stu2 = (ALife) o2;
                if (stu1.getCreateTime().getTime() > stu2.getCreateTime().getTime()) {
                    return -1;
                } else if (stu1.getCreateTime().getTime() == stu2.getCreateTime().getTime()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        model.addAttribute("source", list);
        model.addAttribute("hotList", list);
        return "Home/index1";
    }

    @RequestMapping("/wenzhang/{index}")
    public String GetPageArticleList(@PathVariable("index") Integer index, Model model) {
        List<ALife> list = aLifeService.findAll();
        if (list.isEmpty())
            list = new ArrayList<ALife>();
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                ALife stu1 = (ALife) o1;
                ALife stu2 = (ALife) o2;
                if (stu1.getCreateTime().getTime() > stu2.getCreateTime().getTime()) {
                    return -1;
                } else if (stu1.getCreateTime().getTime() == stu2.getCreateTime().getTime()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        model.addAttribute("source", list);
        return "Home/img";
    }

    @RequestMapping("wenzhang/xiangqing/{id}")
    public String SinglePage(@PathVariable("id") String id, Model model) {
        ALife a = aLifeService.findOne(id);
        model.addAttribute("alife", a);
        List<Comment> source=commentService.findAll("5b13b7751e03a9357ce63439");

        return "Home/single";

    }

}

