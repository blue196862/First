package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Smbms_user;

public interface Smbms_userService {
	/*
	 * 判断用户名是否存在
	 */
	public int selUser(String userName);
	/*
	 * 登录
	 */
	public int login(@Param("userName")String userName,@Param("userPassword")String userPassword);
	/*
	 * 添加用户
	 */
	public int addUser(Smbms_user su);
	/*
	 * 	显示所有用户
	 */
	public List<Smbms_user> getAll();
	/*
	 * 删除用户
	 */
	public int delUser(int id);
	/*
	 * 查询单个用户
	 */
	public Smbms_user selOne(int id);
}
