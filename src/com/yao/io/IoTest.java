package com.yao.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IoTest {
	public static void main(String[] args) {
		//test1();
		test2();
	}

	private static void test3() {
		char[]  cs = {'a','b','c','d','e'};
	}
	
	
	
	private static void test2() {
		String s = "我错误地把自己定义为商人，造成公私不分，合法违法违纪不分，我诚恳接受法律制裁。”被告席上的彭曙在二审最后陈述中，如此反省，“我上缴了一个多亿的钱款，没有挥霍和浪费，希望法庭能给我一个悔过自新的机会11月2日，湖南高院二审开庭湖南省高速公路投资集团原副总经理彭曙、湖南省高广投资公司原总经理胡浩龙贪腐案。法庭经11个小时的庭审，宣布择期宣判。此前，娄底中院一审认定彭曙、胡浩龙受贿金额分别达1.88亿、1.7亿元，以受贿罪、贪污罪、泄露内幕信息罪等，数罪并罚，判处两人死刑，并处没收个人全部财产。一审判决书显示，娄底市人民检察院扣押彭曙、胡浩龙共有赃款1.64亿元，分别扣押彭、胡两人赃款1957万、1646万元，分别扣押同案另两名被告人张晖、彭江林赃款1200万、565万元。";
		File file1 = new File("H:" + File.separator + "ss.txt");
		OutputStreamWriter osw=null;
		char[] b=s.toCharArray();
		int len=b.length;
		try {
			osw=new OutputStreamWriter(new FileOutputStream(file1));
			osw.write(b, 0, len);
			osw.flush();
		} catch (Exception e) {
		}finally{
			try {
				osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ok");
		
	}

	// =======================================================================//
	private static void test1() {
		File file = new File("H:" + File.separator + "aa.jpg");
		File file1 = new File("H:" + File.separator + "bb.jpg");
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream(file);
			os = new FileOutputStream(file1);
			byte[] b = new byte[10];
			int len;
			while ((len = is.read(b)) != -1) {
				os.write(b, 0, len);
				os.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ok");
	}
}
