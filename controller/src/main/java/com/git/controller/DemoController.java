package com.git.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.git.domain.AjaxJson;
import com.git.domain.DemoEntity;
import com.git.service.DemoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @Reference
    private DemoService demoService;

    @RequestMapping("get")
    public ResponseEntity<AjaxJson> get(Integer id) {
        DemoEntity demoEntity = demoService.get(id);
        return ResponseEntity.status(200).body(new AjaxJson(true, "success", demoEntity));
    }

}
