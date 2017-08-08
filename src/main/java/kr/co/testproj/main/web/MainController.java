package kr.co.testproj.main.web;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import kr.co.testproj.main.service.MainService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@Resource(name = "mainService")
	private MainService mainService;
	
	@RequestMapping(value = "/main/main.do")
	public String main(@RequestParam(value="page",required=false,defaultValue="1") int page, Model model) {
		
		// 현재 페이지
		// 글 갯수
		int totalCount = mainService.getTotalCount();
		
		int firstPage = 1, begin, end;
		int lastPage = totalCount/(10+1)+1;
		int prevPage = (int)((page-1)/10)*10;
		if( prevPage < 1 ) prevPage = 1;
		int nextPage = ((int)(((page-1)/10)+1)*10+1);
		if( nextPage > lastPage ) nextPage = lastPage;

		begin = (int)((page-1)/10)*10+1;
		end = begin+9;
		if( end > lastPage ) end = lastPage;
		
		model.addAttribute("result", mainService.getResult());
		
		model.addAttribute("list", mainService.getListResult(page));
		model.addAttribute("firstPage", firstPage);
		model.addAttribute("prevPage", prevPage);
		model.addAttribute("nextPage", nextPage);
		model.addAttribute("lastPage", lastPage);
		model.addAttribute("begin", begin);
		model.addAttribute("end", end);
		model.addAttribute("totalCount", totalCount);
		
		return "/main/main";
		
	}
	
	@RequestMapping(value = "/main/sub.do")
	public @ResponseBody String sub(Model model) {
		return "BBB";
	}
}
