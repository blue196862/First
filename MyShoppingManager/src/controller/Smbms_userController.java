package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Smbms_user;

import service.Smbms_userService;

@Controller
public class Smbms_userController {
	@Autowired
	private Smbms_userService ss;

	public Smbms_userService getSs() {
		return ss;
	}

	public void setSs(Smbms_userService ss) {
		this.ss = ss;
	}
	@RequestMapping("/selUser")
	public void selUser(HttpServletRequest request,HttpServletResponse response){
		PrintWriter out = null;
		try {
			 out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String userName = request.getParameter("userName");
		int num = ss.selUser(userName);
		if(num>0){
			out.print("true");
		}else{
			out.print("false");
		}
	}
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		int num = ss.login(userName, userPassword);
		if(num>0){
			return "getAll";
		}else{
			return "index.jsp";
		}
	}
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request){
		String userCode = request.getParameter("userCode");
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String birthday = request.getParameter("birthday");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		int userRole = Integer.parseInt(request.getParameter("userRole"));
		Smbms_user su = new Smbms_user();
		su.setUserCode(userCode);
		su.setUserName(userName);
		su.setUserPassword(userPassword);
		su.setGender(gender);
		su.setBirthday(birthday);
		su.setPhone(phone);
		su.setAddress(address);
		su.setUserRole(userRole);
		int num = ss.addUser(su);
		if(num>0){
			return "getAll";
		}else{
			return "adduser.jsp";
		}
	}
	@RequestMapping("/getAll")
	public String getAll(HttpServletRequest request){
		List<Smbms_user> list = ss.getAll();
		request.getSession().setAttribute("list", list);
		System.out.println("sssssssssss");
		return "user_menu.jsp";
	}
	@RequestMapping("/delUser")
	public String delUser(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		ss.delUser(id);
		return "getAll";
	}
}
