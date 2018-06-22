package com.sjt.cdmapi.domain.v1;

/*import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement*/
public class UserInfo {
	
    private int id;//用户id
    private String nickname;//用户昵称
    private String avatar;//用户头像
    private String openfireUser;//openfire用户帐号
    private String deviceId;//登录手机设备id
    private String userStatus;//用户状�?
    private String userType;//登录用户类型
    private String bindType;//绑定用户类型
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getOpenfireUser() {
		return openfireUser;
	}
	public void setOpenfireUser(String openfireUser) {
		this.openfireUser = openfireUser;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getBindType() {
		return bindType;
	}
	public void setBindType(String bindType) {
		this.bindType = bindType;
	}
}