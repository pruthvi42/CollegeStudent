package com.pruthvi.college.VO;

public class Student {
		private long rollno;
		private String name;
		
		private String gender;
		private int age;
		private String stream;
		private long clg_id;
		
		
		
		public long getRollno() {
			return rollno;
		}
		public void setRollno(long rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getClg_id() {
			return clg_id;
		}
		public void setClg_id(long clg_id) {
			this.clg_id = clg_id;
		}
		
		public String getStream() {
			return stream;
		}
		public void setStream(String stream) {
			this.stream = stream;
		}
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", gender=" + gender + ", age=" + age + ", stream=" + stream + ", clg_id="
					+ clg_id + "]";
		}
		public Student() {
			super();
		}
}
