package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardAttachVO;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {

	public void register(BoardVO board);
	public BoardVO get(int bno);
	public Boolean modify(BoardVO board);
	public Boolean remove(int bno);
	//public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
	public List<BoardAttachVO> getAttachList(int bno);
}
