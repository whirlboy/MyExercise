package com.yzc.gof.DecoratorPattern.myDecorator;

/**
 * <p>文件夹接口 == 提供两个基础的文件夹操作方法</p>
 */
public interface Folder {
	
	/**
	 * 创建文件夹
	 */
	void mkDir();
	
	/**
	 * 删除文件夹
	 */
	void rmdir();
}
