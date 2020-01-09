package com.bw.utils;

import java.io.File;

/**
 * 文件相关工具类
 * @author wanghd
 *
 */
public class FileUtil {
	/***
	 * 获取文件扩展名 后缀名
	 * @return
	 * D:/test/test.txt
	 */
	public static String getSuffixName(String path) {
		File file = new File(path);
		boolean file2 = file.isFile();
		if(file2) {
			int indexOf = path.indexOf(".");
			String substring = path.substring(indexOf,path.length());
			return substring;
		}else {
			return "该路径不对或者不是普通文件";
		}
	}
	/***
	 * 删除文件，如果是目录，则下面的文件和所有子目录中的文件都要删除
	 */
	public static void deleteFiles(String path) {
		File file = new File(path);
		if(file.isFile()) {
			file.delete();
		}else if(file.isDirectory()){
			//获取目录下的所有文件 包括目录
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				String path2 = file2.getPath();
				//d递归删除文件
				deleteFiles(path2);
			}
		}
		//删除空文件夹
		file.delete();
	}

	/***
	 * 获取操作系统用户目录
	 */
	public static String getHomeDirectory() {
		String property = System.getProperty("user.home");
		return property;
	}
	public static String getWorkDirectory() {
		String property = System.getProperty("user.dir");
		return property;
	}
}
