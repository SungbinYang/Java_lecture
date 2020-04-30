package kr.ac.mjc.sungbin.java.jdbc;

public class BoardGetEx {
	
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = boardDao.getBoard("50");
		System.out.println(board);
	}

}
