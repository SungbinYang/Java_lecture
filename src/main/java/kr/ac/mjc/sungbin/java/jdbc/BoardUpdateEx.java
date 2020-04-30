package kr.ac.mjc.sungbin.java.jdbc;

public class BoardUpdateEx {
	
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = new Board();
		board.setSeq("52");
		board.setTitle("Spring Project");
		board.setContent("Gradle Project");
		boardDao.updateBoard(board);

		board = boardDao.getBoard("52");
		System.out.println("수정했습니다.\n" + board);
	}

}
