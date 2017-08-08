package kr.co.testproj.board01.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.co.testproj.board01.service.BoardService;
import kr.co.testproj.board01.vo.BoardVO;

import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Resource(name = "boardServiceMapper")
	BoardServiceMapper boardServiceMapper;

	@Override
	public String getResult() {
		return boardServiceMapper.getResult();
	}

	@Override
	public List<BoardVO> getListResult() {
		return boardServiceMapper.getListResult();
	}

}
