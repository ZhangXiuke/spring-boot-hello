package com.example.demo.controller;

import com.example.demo.model.CodeVo;
import com.example.demo.service.CodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
public class CodeController {

    @Autowired
    private CodeService codeService;

   @RequestMapping(value = "/getCodeLists")
   @ResponseBody
    public String getCodeLists(){
       List<CodeVo> lists = codeService.getCodeLists();
       for (CodeVo c : lists){
           log.info("Begin Start {}",c.getName());
          // System.out.print("========="+ c.getName());
       }
       return "success";

   }
}
