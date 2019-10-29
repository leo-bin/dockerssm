package com.docker.controller;

import com.docker.service.DockerSSMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leo-bin
 * @date 2019/10/24 15:26
 * @apiNote docker部署ssm项目控制器
 */
@RequestMapping("/docker")
@RestController
public class DockerSSMController {

    @Autowired
    private DockerSSMService dockerSSMService;

    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET,produces = "text/html; charset=utf-8")
    public String insert(){
        dockerSSMService.insert();
        return "测试成功!";
    }
}
