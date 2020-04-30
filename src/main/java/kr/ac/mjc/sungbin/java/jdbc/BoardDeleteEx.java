package kr.ac.mjc.sungbin.java.jdbc;

public class BoardDeleteEx {
	
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		String seq = "67";
		int updatedRows = boardDao.deleteBoard(seq);

		if (updatedRows > 0)
			System.out.println("삭제했습니다. seq=" + seq);
		else
			System.out.println("잘못된 글번호입니다. seq=" + seq);
	}


}
