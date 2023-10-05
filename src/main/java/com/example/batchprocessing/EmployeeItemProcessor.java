package com.example.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeItemProcessor implements ItemProceccor<Employee, Employee> {
	//ログ出力用のオブジェクトを生成
	private static final Logger log = LoggerFactory.getLogger(EmployeeItemProcesser.class);
	
	//ItemProcessorの処理を定義
	@Override
	public Employee process(final Employee employee) throws Exception{
		//名前を大文字に
		final String name = employee.getName().toUpperCase();
		//フィールドを差し替えた新しいEmployeeオブジェクトを生成
		final Employee transformedEmployee = new Employee(name, employee.getDepartment());
		//差分をログに出力します
		log.info("変換結果 （" + employee + ") => (" + transformedEmployee + ")");
		//変換後のオブジェクトを返却
		return transformedEmployee;
	}

}
