package com.demo.easyweb.hello.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

  @GetMapping("world")
  public String world(@RequestParam(required = false) String name) {
    return "hello world: " +  (StringUtils.isBlank(name) ? "Annoymous" : name);

  }

}
