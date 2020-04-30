package kr.ac.mjc.java.concurrency;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	
	List<String> nameList = new ArrayList<>();
	String lastName = null;
	int nameCount = 0;

	public void addName(String name) {
		synchronized (this) { // synchronized block
			lastName = name;
			nameCount++;
		}
		nameList.add(name);
	}

}
