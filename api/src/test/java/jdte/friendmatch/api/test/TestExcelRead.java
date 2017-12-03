package jdte.friendmatch.api.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.utils.ReadExcelData;

import org.junit.Test;

/**
 * 
* @ClassName: TestExcelRead
* @Description: 测试excel读取工具类
* @author zhangmeng
* @date 2017年12月3日 下午3:21:32
* @version V1.0 
 */
public class TestExcelRead {

	@Test
	public void testReadExcel(){
		ReadExcelData excelData =new ReadExcelData();
		String excelPath="D:\\test.xls";
		List<UserPO> listUserPO=new ArrayList<>();
		try {
			listUserPO=excelData.readExcelData(excelPath, 6);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(listUserPO!=null){
			for (UserPO userPO : listUserPO) {
				System.out.println(userPO.toString());
			}
		}
		else{
			System.out.println("无数据");
		}
	}
	
}
