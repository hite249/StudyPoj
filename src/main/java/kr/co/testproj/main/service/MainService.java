package kr.co.testproj.main.service;

import java.util.List;
import java.util.Map;

import kr.co.testproj.main.vo.MainVO;

public interface MainService {
	
	int getTotalCount();
	String getResult();
	
	List<MainVO> getListResult(int page);
}
