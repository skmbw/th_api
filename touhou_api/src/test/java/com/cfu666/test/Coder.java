package com.cfu666.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.generator.GenMain;

import com.vteba.ext.codegen.CodeBuilder;
import com.vteba.ext.codegen.DB;
import com.vteba.ext.codegen.KeyType;
import com.vteba.ext.codegen.TempType;

public class Coder {

	public static void main(String[] args) {
		Map<String, String> tableListMap = new HashMap<String, String>();
		//customer模块
		tableListMap.put("news", "新闻");
//		tableListMap.put("employee_commission", "员工产品佣金");
//		tableListMap.put("employee_commission_history", "员工历史佣金");
		
	    //项目绝对路径
		String rootPath = "C:\\Users\\Administrator\\git\\touhou_api\\touhou_api\\";
		CodeBuilder builder = new CodeBuilder(rootPath, TempType.MyBatisSimpleGeneric);
		builder.setConfigFilePath("src/main/resources/config.properties")
		.setSrcPath("src/main/java/")
		.schema("jrt")
		.setDb(DB.MySQL)// 可以不使用，只要jdbc url是正确的
		.keyType(KeyType.String)
		.setTableList(tableListMap)
		.module("com.cfu666.cs.news")
		.setPojo(false)
		.setMongo(false)
		.setGenAction(false)
        .setGenDao(false)
        .setGenMapper(false)
        .setGenModel(false)
        .setGenService(false)
        .setMybatisShards(false)
        .setMybatisAction(true)
        .setJsonAction(true);
        //.setOnlyDao(true);
		
		Map<String, List<String>> map = builder.build();

		GenMain.main(map, tableListMap.size(), rootPath);
	}

}
