package kr.co.testproj.board01.web;

import javax.annotation.Resource;

import kr.co.testproj.board01.service.BoardService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Board01Controller {
	@Resource(name = "boardService")
	private BoardService boardService;

	@RequestMapping(value = "/board01/board.do")
	public String main(Model model) {
		model.addAttribute("result1", boardService.getResult());
		model.addAttribute("result2", boardService.getListResult());

		return "/board01/board";
	}

	@RequestMapping(value = "/board01/sub.do")
	public @ResponseBody
	String sub(Model model) {
		return "BBB";
	}
}
