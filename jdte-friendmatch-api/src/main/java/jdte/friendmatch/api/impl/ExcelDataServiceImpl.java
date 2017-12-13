package jdte.friendmatch.api.impl;

import jdte.friendmatch.api.mapper.UserPOMapper;
import jdte.friendmatch.api.pojo.UserPO;
import jdte.friendmatch.api.service.ExcelDataService;
import jdte.friendmatch.api.utils.ReadExcelData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;
@Service("excelDataService")
public class ExcelDataServiceImpl implements ExcelDataService{
	@Autowired
	private UserPOMapper userPOMapper;
	@Override
	public boolean setUserData(String excelPath,int excelStartCol,int idIndex) throws IOException {
		List<UserPO> userPOList=null;
		try {
			userPOList=ReadExcelData.readExcelData(excelPath,excelStartCol,idIndex);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		if(userPOList.size()==0){
			return false;
		}
		return userPOMapper.setUserData(userPOList);
	}
	@Override
	public Integer getMaxId() throws Exception{
		Integer result=0;
		try {
			result=userPOMapper.selectMaxId();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

}
