package jdte.friendmatch.api.service;

import java.io.IOException;



/**
 * 
* @ClassName: ExcelDataService
* @Description: 将excel中的数据存入到数据库中
* @author zhangmeng
* @date 2017年12月3日 下午4:49:59
* @version V1.0 
 */
public interface ExcelDataService {

	/**
	 * 
	* @Title: setUserData
	* @Description: 将excel中的数据写入到数据库中
	* @param  excelPath  excel文件路径
	* @param  excelStartCol  excel文件中数据开始的列数
	* @return boolean    返回类型
	* @throws
	 */
	boolean setUserData(String excelPath,int excelStartCol) throws IOException;
}
