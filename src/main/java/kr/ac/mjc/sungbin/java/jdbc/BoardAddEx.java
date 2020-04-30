package kr.ac.mjc.sungbin.java.jdbc;

public class BoardAddEx {
	
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = new Board();
		board.setTitle("21대 총선 사전 투표율이 제도 도입 이래 최고치를 기록했다: 26.69%");
		board.setContent("전국 4399만4247명 유권자 중 1174만2677명이 사전투표에 참여했다.");
		board.setWriter("허핑턴포스트코리아");
		boardDao.addBoard(board);
		System.out.println("게시글을 추가했습니다.\n" + board);
	}

}
