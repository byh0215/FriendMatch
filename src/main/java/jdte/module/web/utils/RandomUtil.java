package jdte.module.web.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class RandomUtil {
	/**
	 * 产生20位随机数：前17位基于时间，后3为随机产生
	 * @return
	 */
	public static String getRandmDigital20(){
		Random random = new Random();
        int s = random.nextInt(999)%(999-100+1) + 100;
		return (LocalDate.now().toString()+LocalTime.now().toString()).replace("-","").replace(".", "").replace(":","")+s;
	}
}
