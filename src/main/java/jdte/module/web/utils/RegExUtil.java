package jdte.module.web.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtil {
	/**
	 * 判断是否仅由英文字母、.-_等符号组成
	 * @param str
	 * @return
	 */
	public static Boolean isSn(String str){
		Pattern pattern = Pattern.compile("[-A-Za-z0-9._]*");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	/**
	 * 判断是否仅由数字组成的两位数
	 * @param str
	 * @return
	 */
	public static Boolean isTwoNumber(String str){
		Pattern pattern = Pattern.compile("^\\d{2}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	/**
	 * 判断是否仅由数字组成
	 * @param str
	 * @return
	 */
	public static Boolean isNumber(String str){
		Pattern pattern = Pattern.compile("^\\d*$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
