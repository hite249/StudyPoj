package kr.co.testproj.board01.service.impl;

import java.util.List;

import kr.co.testproj.board01.vo.BoardVO;
import kr.co.testproj.util.annotation.Mapper;
@Mapper
public interface BoardServiceMapper {
	String getResult();

	List<BoardVO> getListResult();

}
