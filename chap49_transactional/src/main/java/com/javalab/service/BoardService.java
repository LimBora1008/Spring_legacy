package com.javalab.service;

import java.util.List;

import com.javalab.vo.BoardVo;


public interface BoardService {

	// 게시물 등록
	int insertBoard(BoardVo vo);

	// 게시물 수정
	void updateBoard(BoardVo vo);

	// 게시물 삭제
	void deleteBoard(BoardVo vo);

	// 게시물 상세 조회
	BoardVo getBoardById(BoardVo vo);

	// 게시물 목록 조회
	List<BoardVo> getBoardList(BoardVo vo);

	// 게시물 조회수 증가
	void updateHit(BoardVo vo);	
	
	// 전체 게시물 숫자
	int getTotalBoardCount();
}

