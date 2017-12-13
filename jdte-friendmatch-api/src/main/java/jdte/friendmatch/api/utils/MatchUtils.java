package jdte.friendmatch.api.utils;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;

/** 
 * 读取excel文件 
 * 
 */
public class MatchUtils {
  public  List<MatchResult> getFriend(UserPO majorUser,){
	TaskModel queryModel = null;
	for (TaskModel taskModel : testList) {
		if (taskModel.getName().indexOf(name)>=0) {
			queryModel=taskModel;
			break;
		}
	}
	if(queryModel==null){
		System.out.println("你没有填写问卷");
		return false;
	}
	for (TaskModel tm : testList) {
		if(tm.open==2.0){continue;}
		double value =  110-getCharacteristic(queryModel,tm);
		tm.setValue(value);
	}
	for (TaskModel tm : testList) {
		if(tm.getValue()==110.0){continue;}
		if(tm.getValue()>=80.0){
			bestList.add(tm);
		}else if(tm.getValue()>=40.0){
			betterList.add(tm);
		}
	}
	return true;
  }
  public static double getCharacteristic(TaskModel tm1,TaskModel tm2){
	  double res=0.0;
	  if(tm1.getDiffSex()+tm2.getDiffSex()==2.0){
		  res = Math.abs(tm1.getSex()-tm2.getSex())+
				  20*Math.abs(tm1.getTimeTag()-tm2.getTimeTag())+
				  5*Math.abs(tm1.getArea()-tm2.getArea())+
				  3*Math.abs(tm1.getCenter()-tm2.getCenter())+
				  3*Math.abs(tm1.getTrain()-tm2.getTrain())+
				  3*Math.abs(tm1.getRide()-tm2.getRide())+
				  15*Math.abs(tm1.getPrice()-tm2.getPrice())+
				  10*Math.abs(tm1.getMusic()-tm2.getMusic())+
				  10*Math.abs(tm1.getAnimal()-tm2.getAnimal())+
				  5*Math.abs(tm1.getWorkStation()-tm2.getWorkStation())+
				  5*Math.abs(tm1.getGame()-tm2.getGame())+
				  5*Math.abs(tm1.getTableGame()-tm2.getTableGame())+
				  5*Math.abs(tm1.getTourism()-tm2.getTourism())+
				  5*Math.abs(tm1.getHealth()-tm2.getHealth())+
				  25*Math.abs(tm1.getQuiet()-tm2.getQuiet());
	  }else{
		  res = Math.abs(tm1.getSex()-tm2.getSex())+
				  20*Math.abs(tm1.getTimeTag()-tm2.getTimeTag())+
				  5*Math.abs(tm1.getArea()-tm2.getArea())+
				  61*Math.abs(tm1.getSex()-tm2.getSex())+
				  3*Math.abs(tm1.getCenter()-tm2.getCenter())+
				  5*Math.abs(tm1.getTrain()-tm2.getTrain())+
				  5*Math.abs(tm1.getRide()-tm2.getRide())+
				  15*Math.abs(tm1.getPrice()-tm2.getPrice())+
				  10*Math.abs(tm1.getMusic()-tm2.getMusic())+
				  10*Math.abs(tm1.getAnimal()-tm2.getAnimal())+
				  5*Math.abs(tm1.getWorkStation()-tm2.getWorkStation())+
				  5*Math.abs(tm1.getGame()-tm2.getGame())+
				  5*Math.abs(tm1.getTableGame()-tm2.getTableGame())+
				  5*Math.abs(tm1.getTourism()-tm2.getTourism())+
				  5*Math.abs(tm1.getHealth()-tm2.getHealth())+
				  25*Math.abs(tm1.getQuiet()-tm2.getQuiet());
	  }
	  return res;
  }
} 