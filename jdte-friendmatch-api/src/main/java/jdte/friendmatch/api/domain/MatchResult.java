package jdte.friendmatch.api.domain;

import java.io.Serializable;

/**
 * 
 * @ClassName: MatchResult
 * @Description: 匹配结果实体
 * @author weizhirong
 * @date 2017/12/06
 * @version V1.0 
 */
public class MatchResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;             //用户姓名
	private String skill;		   	 //个人技能
	private String phTelphone;  	  //手机号
	private String call;			   //联系方式
	private float value;			   //匹配度

	@Override
	public String toString() {

		return "非常适合你的小伙伴:" +getName()
		+",他/她的技能有:" + getSkill()
		+",他/她的联系方式是:" +getPhTelphone()
		+",他/她的qq/微信是:" +getCall()
		+",匹配度:" + getValue();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getPhTelphone() {
		return phTelphone;
	}

	public void setPhTelphone(String phTelphone) {
		this.phTelphone = phTelphone;
	}
}

