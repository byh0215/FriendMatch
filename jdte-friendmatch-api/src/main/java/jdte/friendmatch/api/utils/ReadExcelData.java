package jdte.friendmatch.api.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jdte.friendmatch.api.pojo.UserPO;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

/**
 * 
* @ClassName: ReadExcelData
* @Description: 读取Excel中的问卷调查数据
* @author zhangmeng0725
* @date 2017年12月3日 下午1:40:49
* @version V1.0 
 */
public class ReadExcelData {

	private static InputStream inputStream;
	private static HSSFWorkbook hssfWorkbook;
	
	/**
	 * 
	* @Title: readExcelData
	* @Description: 读取excel中的问卷信息
	* @param excelPath   问卷的路径名
	* @param excelStartCol   问卷中有效信息开始的列数(从1开始计数)
	* @return List<UserPO>  返回UserPO的list集合
	* @throws IOException  文件IO异常
	 */
	public static List<UserPO> readExcelData(String excelPath,int excelStartCol) throws IOException{
		inputStream=new FileInputStream(excelPath);
		hssfWorkbook=new HSSFWorkbook(inputStream);
		List<UserPO> listUserPO=new ArrayList<>();
		System.out.println(hssfWorkbook.getNumberOfSheets());
		for(int sheetNum=0;sheetNum<hssfWorkbook.getNumberOfSheets();sheetNum++){
			HSSFSheet hssfSheet=hssfWorkbook.getSheetAt(sheetNum);
			if(hssfSheet==null){
				continue;
			}
			//从第7列开始获取有用信息
			for(int rowNum=1;rowNum<=hssfSheet.getLastRowNum();rowNum++){
				HSSFRow hssfRow=hssfSheet.getRow(rowNum);
				if(hssfRow==null){
					continue;
				}
				UserPO userPO=transfSheetRow2UserPO(hssfRow,excelStartCol);
				listUserPO.add(userPO);
			}
		}
		return listUserPO;
	}

	/**
	 * 
	* @Title: transfSheetRow2UserPO
	* @Description: 封装UserPO对象
	* @param hssfRow  excel单张表对象每行的记录
	* @param excelStartCol 问卷中有效信息开始的列数(从1开始计数)
	* @return UserPO    返回UserPO对象
	 */
	private static UserPO transfSheetRow2UserPO(HSSFRow hssfRow,int excelStartCol){
		UserPO userPO=new UserPO();
		//1、姓名
		userPO.setPhName(transfCell2String(hssfRow,excelStartCol++));
		//2、性别
		userPO.setPhSex(transfCell2Integer(hssfRow,excelStartCol++));
		//3、电话号码
		userPO.setPhCall(transfCell2String(hssfRow,excelStartCol++));
		//4、入职时间
		userPO.setPhTimetag(transfCell2Integer(hssfRow,excelStartCol++));
		//5、工作地点
		userPO.setPhWorkstation(transfCell2Integer(hssfRow,excelStartCol++));
		//6、接受异性混住
		userPO.setPhDiffsex(transfCell2Integer(hssfRow,excelStartCol++));
		//7、接受合租者有对象
		userPO.setPhSingle(transfCell2Integer(hssfRow,excelStartCol++));
		//8、接受地铁15分钟内
		userPO.setPhSubway(transfCell2Integer(hssfRow,excelStartCol++));
		//9、接受步行/骑行15分钟内
		userPO.setPhRide(transfCell2Integer(hssfRow,excelStartCol++));
		//10、预期房租
		userPO.setPhPrice(transfCell2Integer(hssfRow, excelStartCol++));
		//11、距离市区距离	
		userPO.setPhArea(transfCell2Integer(hssfRow, excelStartCol++));
		//12、岗位
		userPO.setPhJob(transfCell2Integer(hssfRow, excelStartCol++));
		//13、喜欢宠物	
		userPO.setPhAnimal(transfCell2Integer(hssfRow, excelStartCol++));
		//14、喜欢音乐	
		userPO.setPhMusic(transfCell2Integer(hssfRow, excelStartCol++));
		//15、游戏爱好者	
		userPO.setPhGame(transfCell2Integer(hssfRow, excelStartCol++));
		//16、桌游爱好者（狼人杀，三国杀等）	
		userPO.setPhTablegame(transfCell2Integer(hssfRow, excelStartCol++));
		//17、是否喜爱旅游/摄影？	
		userPO.setPhTourism(transfCell2Integer(hssfRow, excelStartCol++));
		//18、是否喜欢健身	
		userPO.setPhHealth(transfCell2Integer(hssfRow, excelStartCol++));
		//19、喜欢安静	
		userPO.setPhQuiet(transfCell2Integer(hssfRow, excelStartCol++));
		//20、个人技能（使用,隔开）	
		userPO.setPhSkill(transfCell2String(hssfRow, excelStartCol++));
		//21、个人QQ/微信	
		userPO.setPhQQWechar(transfCell2String(hssfRow, excelStartCol++));
		//22、是否公开自己的合租信息给18的其他京东小伙伴
		userPO.setPhOpen(transfCell2Integer(hssfRow, excelStartCol++));
		return userPO;
	}
	
	/**
	 * 
	* @Title: transfCell2Integer
	* @Description: 将excel单元格中的内容转换为Integer
	* @param @param hssfRow
	* @param @param excelStartCol
	* @return Integer    返回类型
	 */
	private static Integer transfCell2Integer(HSSFRow hssfRow,int excelStartCol){
		HSSFCell hssfCell=hssfRow.getCell(excelStartCol);
		hssfCell.setCellType(Cell.CELL_TYPE_NUMERIC);
		if(hssfCell!=null){
			return new Double(hssfCell.getNumericCellValue()).intValue();
		}
		return null;
	}
	/**
	 * 
	* @Title: transfCell2String
	* @Description: 将excel单元格中的内容转换为String
	* @param @param hssfRow
	* @param @param excelStartCol
	* @return String    返回类型
	* @throws
	 */
	private static String transfCell2String(HSSFRow hssfRow,int excelStartCol){
		HSSFCell hssfCell=hssfRow.getCell(excelStartCol);
		hssfCell.setCellType(Cell.CELL_TYPE_STRING);
		if(hssfCell!=null){
			return hssfCell.getStringCellValue();
		}
		return null;
	}
}
