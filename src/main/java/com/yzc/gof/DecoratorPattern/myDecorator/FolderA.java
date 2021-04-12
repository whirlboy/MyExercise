package com.yzc.gof.DecoratorPattern.myDecorator;

/**
 * <p>文件夹A</p>
 */
public class FolderA implements Folder{

	@Override
	public void mkDir() {
		System.out.println("在Windows系统中创建文件夹A");
	}

	@Override
	public void rmdir() {
		System.out.println("在Windows系统中删除文件夹A");
	}

}
