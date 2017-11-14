package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.Smbms_user;

import dao.Smbms_userMapper;

@Service("ssi")
public class Smbms_userServiceImpl implements Smbms_userService {
	
	@Autowired
	private Smbms_userMapper sm;
	
	public Smbms_userMapper getSm() {
		return sm;
	}

	public void setSm(Smbms_userMapper sm) {
		this.sm = sm;
	}

	public int selUser(String userName) {
		// TODO Auto-generated method stub
		return sm.selUser(userName);
	}

	public int login(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return sm.login(userName, userPassword);
	}

	public int addUser(Smbms_user su) {
		// TODO Auto-generated method stub
		return sm.addUser(su);
	}

	public List<Smbms_user> getAll() {
		// TODO Auto-generated method stub
		return sm.getAll();
	}

	public int delUser(int id) {
		// TODO Auto-generated method stub
		return sm.delUser(id);
	}

	public Smbms_user selOne(int id) {
		// TODO Auto-generated method stub
		return sm.selOne(id);
	}

}
