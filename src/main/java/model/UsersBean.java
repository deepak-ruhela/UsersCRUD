package model;

public class UsersBean {

	public UsersBean() {

	}

	public UsersBean(String strId, String strName, String strEmail, String strCountry) {
		super();
		this.strId = strId;
		this.strName = strName;
		this.strEmail = strEmail;
		this.strCountry = strCountry;
	}

	String strId, strName, strEmail, strCountry;

	@Override
	public String toString() {
		return "UsersBean [strId=" + strId + ", strName=" + strName + ", strEmail=" + strEmail + ", strCountry="
				+ strCountry + "]";
	}

	public String getStrId() {
		return strId;
	}

	public void setStrId(String strId) {
		this.strId = strId;
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
