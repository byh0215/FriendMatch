package jdte.friendmatch.api.impl;

import jdte.friendmatch.api.mapper.UserPOMapper;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.ExcelDataService;
import jdte.friendmatch.api.utils.ReadExcelData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;
@Service("excelDataService")
public class ExcelDataServiceImpl implements ExcelDataService{

	@Autowired
	private UserPOMapper userPOMapper;

	private static final Logger logger = LoggerFactory.getLogger(ExcelDataServiceImpl.class);

	@Override
	public boolean setUserData(String excelPath,int excelStartCol,int idIndex) throws IOException {
		List<UserPO> userPOList = null;
		String basePath= this.getClass().getClassLoader().getResource("/").getPath();
		File file = new File(basePath+"properties/"+excelPath);
		InputStream inputStream = new FileInputStream(file);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(inputStream);
		try {
			userPOList = ReadExcelData.readExcelData(hssfWorkbook,excelStartCol,idIndex);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("ExcelDataServiceImpl.setUserData导入出错, 错误信息为: {}", e.toString());
		}
		if(userPOList == null || userPOList.size() == 0){
			return false;
		}
		for (UserPO userPO : userPOList) {
			System.out.println("here");
		}
		return userPOMapper.setUserData(userPOList);
	}

	@Override
	public Integer getMaxId() {
		return userPOMapper.selectMaxId();
	}

}
