package pojo;



public class Smbms_user {
	//ID
	private int id;
	//�û�����
	private String userCode;
	//�û�����
	private String userName;
	//�û�����
	private String userPassword;
	//�Ա�1.Ů     2.�У�
	private int gender;
	//��������
	private String birthday;
	//�ֻ�
	private String phone;
	//��ַ
	private String address;
	//�û���ɫ��ȡ�Խ�ɫ��-��ɫid��
	private int userRole;
	//������
	private int createdBy;
	//����ʱ��
	private String creationDate;
	//������
	private int modifyBy;
	//����ʱ��
	private String modifyDate;
	//��ɫ���
	private Smbms_role sr;
	
	public Smbms_role getSr() {
		return sr;
	}

	public void setSr(Smbms_role sr) {
		this.sr = sr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUserRole() {
		return userRole;
	}

	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public int getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

}
