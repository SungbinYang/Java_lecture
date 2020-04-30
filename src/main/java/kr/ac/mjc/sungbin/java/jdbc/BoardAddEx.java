package kr.ac.mjc.sungbin.java.jdbc;

public class BoardAddEx {
	
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = new Board();
		board.setTitle("명지전문대");
		board.setContent("웹프로그래밍과제");
		board.setWriter("양성빈");
		boardDao.addBoard(board);
		System.out.println("게시글을 추가했습니다.\n" + board);
	}

}
