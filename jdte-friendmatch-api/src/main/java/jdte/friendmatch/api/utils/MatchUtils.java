package jdte.friendmatch.api.utils;


import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;

import java.util.ArrayList;
import java.util.List;

public class MatchUtils {
  public static List<MatchResult> getFriend(UserPO majorUser,List<UserPO> matchList){
	  List<MatchResult> ansList=new ArrayList<>();
	  for (UserPO aUser:matchList) {
		  double adaptValue=getCharacteristic(majorUser,aUser);
		  if (aUser.getPhOpen()!=0)continue;
		  if (aUser.getPhTelphone().equals(majorUser.getPhTelphone()))continue;
		  if((100.0-adaptValue) > 60.0){
			  MatchResult res=new MatchResult();
			  res.setName(aUser.getPhName());
			  res.setPhTelphone(aUser.getPhTelphone());
			  res.setSkill(aUser.getPhSkill());
			  res.setCall(aUser.getPhQQWechar());
			  res.setValue(adaptValue);
			  ansList.add(res);
		  }
	  }
	  return ansList;
  }
  public static double getCharacteristic(UserPO u1,UserPO u2){
	  double res=0.0;
	  if(u1.getPhDiffsex()!=u2.getPhDiffsex()||u1.getPhTimetag()!=u2.getPhTimetag()||u1.getPhSameroom()!=u2.getPhSameroom()){
	  	return 40.0;
	  }
	  if (u1.getPhDiffsex()+u2.getPhDiffsex()==2.0){
		  res = Math.abs(u1.getPhSex()-u2.getPhSex())+
				  4*Math.abs(u1.getPhSubway()-u2.getPhSubway())+
				  2*Math.abs(u1.getPhRide()-u2.getPhRide())+
				  10*Math.abs(u1.getPhPrice()-u2.getPhPrice())+
				  2*Math.abs(u1.getPhCenter()-u2.getPhCenter())+
				  4*Math.abs(u1.getPhJob()-u2.getPhJob())+
				  10*Math.abs(u1.getPhAnimal()-u2.getPhAnimal())+
				  10*Math.abs(u1.getPhMusic()-u2.getPhMusic())+
				  4*Math.abs(u1.getPhGame()-u2.getPhGame())+
				  4*Math.abs(u1.getPhTablegame()-u2.getPhTablegame())+
				  4*Math.abs(u1.getPhTourism()-u2.getPhTourism())+
				  4*Math.abs(u1.getPhHealth()-u2.getPhHealth())+
				  4*Math.abs(u1.getPhFood()-u2.getPhFood())+
				  20*Math.abs(u1.getPhQuiet()-u2.getPhQuiet());
	  }else{
		  res = 40*Math.abs(u1.getPhSex()-u2.getPhSex())+
				  4*Math.abs(u1.getPhSubway()-u2.getPhSubway())+
				  2*Math.abs(u1.getPhRide()-u2.getPhRide())+
				  10*Math.abs(u1.getPhPrice()-u2.getPhPrice())+
				  2*Math.abs(u1.getPhCenter()-u2.getPhCenter())+
				  4*Math.abs(u1.getPhJob()-u2.getPhJob())+
				  10*Math.abs(u1.getPhAnimal()-u2.getPhAnimal())+
				  10*Math.abs(u1.getPhMusic()-u2.getPhMusic())+
				  4*Math.abs(u1.getPhGame()-u2.getPhGame())+
				  4*Math.abs(u1.getPhTablegame()-u2.getPhTablegame())+
				  4*Math.abs(u1.getPhTourism()-u2.getPhTourism())+
				  4*Math.abs(u1.getPhHealth()-u2.getPhHealth())+
				  4*Math.abs(u1.getPhFood()-u2.getPhFood())+
				  20*Math.abs(u1.getPhQuiet()-u2.getPhQuiet());
	  }


	  return res;
  }
} 