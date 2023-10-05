package com.example.batchprocessing;

public class Employee {

	private String name;
	
	private String department;
	
	//コンストラクタ2つ定義
	public Employee() {
		
		
	}
	
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	//アクセサメソッド
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//ログ出力の為toStringを実装
	@Override
	public String toString() {
		return "name: " + this.name + " department: " + this.department;
	}
}
