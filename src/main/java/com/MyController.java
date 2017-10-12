package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
	
@RequestMapping("/")
public ModelAndView showFirstPage()

{
 ModelAndView obj=new ModelAndView("index");
  return obj;
}
}
