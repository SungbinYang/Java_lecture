package kr.ac.mjc.sungbin.java.jdbc;

import java.util.List;

public class BoardListEx {
	
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		List<Board> boardList = boardDao.listBoards(5, 1); // 5개씩, 1 page
		for (Board board : boardList)
			System.out.println(board);
	}


}
