package pers.th.oc.entity;

import java.io.Serializable;


import java.sql.Timestamp;

public class UserID implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;

	private Timestamp createDate;

	private String createUser;

	private String email;

	private Timestamp lastUpdateDate;

	private String lastUpdateUser;

	private String locale;

	private String password;

	private String securitycode;

	private Timestamp securitycodeGenTime;

	private String telNo;

	private String userId;

	private String userName;

	private String mobileDeviceId;

	private String mobileDeviceType;

	private Long doctorId;

	private String clinicCode;

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getClinicCode() {
		return clinicCode;
	}

	public void setClinicCode(String clinicCode) {
		this.clinicCode = clinicCode;
	}

	public String getMobileDeviceId() {
		return mobileDeviceId;
	}

	public void setMobileDeviceId(String mobileDeviceId) {
		this.mobileDeviceId = mobileDeviceId;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdateUser() {
		return this.lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecuritycode() {
		return this.securitycode;
	}

	public void setSecuritycode(String securitycode) {
		this.securitycode = securitycode;
	}

	public Timestamp getSecuritycodeGenTime() {
		return this.securitycodeGenTime;
	}

	public void setSecuritycodeGenTime(Timestamp securitycodeGenTime) {
		this.securitycodeGenTime = securitycodeGenTime;
	}

	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileDeviceType() {
		return mobileDeviceType;
	}

	public void setMobileDeviceType(String mobileDeviceType) {
		this.mobileDeviceType = mobileDeviceType;
	}

	@Override
	public String toString() {
		return "UserID{" +
				"id=" + id +
				", createDate=" + createDate +
				", createUser='" + createUser + '\'' +
				", email='" + email + '\'' +
				", lastUpdateDate=" + lastUpdateDate +
				", lastUpdateUser='" + lastUpdateUser + '\'' +
				", locale='" + locale + '\'' +
				", password='" + password + '\'' +
				", securitycode='" + securitycode + '\'' +
				", securitycodeGenTime=" + securitycodeGenTime +
				", telNo='" + telNo + '\'' +
				", userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", mobileDeviceId='" + mobileDeviceId + '\'' +
				", mobileDeviceType='" + mobileDeviceType + '\'' +
				", doctorId=" + doctorId +
				", clinicCode='" + clinicCode + '\'' +
				'}';
	}
}