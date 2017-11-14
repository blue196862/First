package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Smbms_user;

public interface Smbms_userService {
	/*
	 * �ж��û����Ƿ����
	 */
	public int selUser(String userName);
	/*
	 * ��¼
	 */
	public int login(@Param("userName")String userName,@Param("userPassword")String userPassword);
	/*
	 * ����û�
	 */
	public int addUser(Smbms_user su);
	/*
	 * 	��ʾ�����û�
	 */
	public List<Smbms_user> getAll();
	/*
	 * ɾ���û�
	 */
	public int delUser(int id);
	/*
	 * ��ѯ�����û�
	 */
	public Smbms_user selOne(int id);
}
