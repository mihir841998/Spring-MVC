package com.mihir;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mihir
{
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1") int n1, @RequestParam("t2") int n2)
	{
		ModelAndView mv = new ModelAndView();
		
		int t = n1 +n2;
		mv.addObject("result",t);
		mv.setViewName("result.jsp");
		
		return mv;
	}

}
