package jdte.friendmatch.api.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdte.friendmatch.api.dao.ExcelDataDao;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.ExcelDataService;
import jdte.friendmatch.api.utils.ReadExcelData;
@Service("excelDataService")
public class ExcelDataServiceImpl implements ExcelDataService{

	@Autowired
	private ExcelDataDao excelDataDao;
	@Override
	public boolean setUserData(String excelPath,int excelStartCol) throws IOException {
		List<UserPO> userPOList;
		try {
			userPOList=ReadExcelData.readExcelData(excelPath, excelStartCol);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		return excelDataDao.setUserData(userPOList);
	}

}
