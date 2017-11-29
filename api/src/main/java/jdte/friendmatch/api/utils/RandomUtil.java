package jdte.friendmatch.api.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class RandomUtil {
	/**
	 * ����20λ�������ǰ17λ����ʱ�䣬��3Ϊ�������
	 * @return
	 */
	public static String getRandmDigital20(){
		Random random = new Random();
        int s = random.nextInt(999)%(999-100+1) + 100;
		return (LocalDate.now().toString()+LocalTime.now().toString()).replace("-","").replace(".", "").replace(":","")+s;
	}
}
