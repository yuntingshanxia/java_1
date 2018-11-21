package javaProject;

public class Student {
	private	int on;
	private String name;
	private int age;
	private int java;
	private int c_shar;
	private int sql;
	private int sum;
	private int avg;
	private int html;
	private int[] renshu;
	public void setOn(int on) {
		this.on = on;
	}
	public int getOn() {
		return this.on;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getC_shar() {
		return c_shar;
	}
	public void setC_shar(int c_shar) {
		this.c_shar = c_shar;
	}
	public void setHtml(int html) {
		this.html=html;
	}
	public int setHtml() {
		return html;
	}
	public int getsql() {
		return sql;
	}
	public void setsql(int sql) {
		this.sql = sql;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = this.java+this.c_shar+this.html+this.sql;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = this.sum/4;
	}
	
	
	public String toString() {
		
		String msg ="\t"+this.on+"\t"+this.name+"\t"+this.age+"\t"+
		this.java+"\t"+this.c_shar+"\t"+this.html+"\t"+this.sql+"\t"+ this.sum+"\t"+
		this.avg;
		
		return msg;
	}
	
	public int[][] getfenshu(Student[] stuArr){
		int[][] arr = new int[stuArr.length][5];
		for(int i=0;i<stuArr.length;i++) {
					arr[i][1]=this.java;
					arr[i][2]=this.c_shar;arr[i][3]=this.html;
					arr[i][4]=this.sql;arr[i][5]=this.sum;
		}
		
		return arr;
	}
}
