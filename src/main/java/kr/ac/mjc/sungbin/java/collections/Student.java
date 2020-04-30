package kr.ac.mjc.sungbin.java.collections;

public class Student {
	
	private String id = null;
	private String name = null;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	/**
	 * id 의 hashCode()를 사용
	 */
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return this.id.equals(student.getId());
		}
		return false;
	}

}
