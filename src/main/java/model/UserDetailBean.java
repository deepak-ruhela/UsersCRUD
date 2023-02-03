package model;

public class UserDetailBean {

	public UserDetailBean() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDetailBean(String strName, String strEmail, String strCountry) {
		super();
		this.strName = strName;
		this.strEmail = strEmail;
		this.strCountry = strCountry;
	}
	
	String strName,strEmail,strCountry;
	
	@Override
	public String toString() {
		return "UserDetailBean [strName=" + strName + ", strEmail=" + strEmail + ", strCountry=" + strCountry + "]";
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	public String getStrCountry() {
		return strCountry;
	}

	public void setStrCountry(String strCountry) {
		this.strCountry = strCountry;
	}


}
