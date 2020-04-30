package kr.ac.mjc.sungbin.java.jdbc;

import lombok.Data;

@Data
public class Board {

	private String seq = null;
	private String title = null;
	private String content = null;
	private String regdate = null;
	private String writer = null;
	private int cnt = 0;
}