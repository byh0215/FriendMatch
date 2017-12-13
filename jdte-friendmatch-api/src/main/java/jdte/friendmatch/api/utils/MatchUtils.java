package jdte.friendmatch.api.utils;


import jdte.friendmatch.api.domain.MatchResult;
import jdte.friendmatch.api.pojo.UserPO;

import java.util.ArrayList;
import java.util.List;

public class MatchUtils {
  public static List<MatchResult> getFriend(UserPO majorUser,List<UserPO> matchList){
	  List<MatchResult> ansList=new ArrayList<>();
	  for (UserPO aUser:matchList) {
		  if((100.0-getCharacteristic(majorUser,aUser))>75.0){
			  MatchResult res=new MatchResult();
			  res.setName(aUser.getPhName());
			  res.setCall(aUser.);
			  res.setPhTelphone(aUser);
		  }
	  }
	  return ansList;
  }
  public static double getCharacteristic(UserPO u1,UserPO u2){
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