package spring.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import spring.project.domain.QnaVO;

public interface QnaMapper {

	//@Select("select * from qna_board where qno > 0")
	public List<QnaVO> getList();
	
	
}
