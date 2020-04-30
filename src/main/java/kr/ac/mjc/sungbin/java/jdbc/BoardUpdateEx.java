package kr.ac.mjc.sungbin.java.jdbc;

public class BoardUpdateEx {
	
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = new Board();
		board.setSeq("52");
		board.setTitle("미래통합당이 'n번방 사건' 관련 폭로를 하지 않겠다고 밝혔다");
		board.setContent(
				"방송인 김어준과 이해찬 더불어민주당 대표가 ‘텔레그램 n번방 사건‘을 두고 미래통합당의 ‘정치 공작설‘을 제기한 가운데, 통합당의 ‘텔레그램 n번방 근절’ 태스크포스(TF)가 ”사건 본질 흐리는 것을 단호히 거부하겠다”고 밝혔다.");
		boardDao.updateBoard(board);

		board = boardDao.getBoard("52");
		System.out.println("수정했습니다.\n" + board);
	}

}
