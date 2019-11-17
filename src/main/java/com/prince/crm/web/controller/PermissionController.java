package com.prince.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 权限相关
 * @Author prince Chen
 * @Date 2019/11/17 13:12
 */
@Controller
public class PermissionController {

    @RequestMapping("/permission")
    public String index() {
        return "permission";
    }
}
