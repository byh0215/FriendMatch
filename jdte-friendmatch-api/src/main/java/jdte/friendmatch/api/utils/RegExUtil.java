package jdte.friendmatch.api.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtil {
	/**
	 * �ж��Ƿ����Ӣ����ĸ��.-_�ȷ������
	 * @param str
	 * @return
	 */
	public static Boolean isSn(String str){
		Pattern pattern = Pattern.compile("[-A-Za-z0-9._]*");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	/**
	 * �ж��Ƿ����������ɵ���λ��
	 * @param str
	 * @return
	 */
	public static Boolean isTwoNumber(String str){
		Pattern pattern = Pattern.compile("^\\d{2}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	/**
	 * �ж��Ƿ�����������
	 * @param str
	 * @return
	 */
	public static Boolean isNumber(String str){
		Pattern pattern = Pattern.compile("^\\d*$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
