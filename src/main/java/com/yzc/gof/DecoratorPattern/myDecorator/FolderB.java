package com.yzc.gof.DecoratorPattern.myDecorator;

/**
 * <p>文件夹B</p>
 */
public class FolderB implements Folder{

	@Override
	public void mkDir() {
		System.out.println("在Linux系统中创建文件夹B");
	}

	@Override
	public void rmdir() {
		System.out.println("在Linux系统中删除文件夹B");
	}

}
