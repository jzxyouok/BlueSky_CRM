package com.bluesky.bluesky_crm2.model;

/**
 * 用户实体类
 * 
 * @author 刘光岳
 * @date 2016年7月2日
 */
public class Users {

	/**
	 * 标识
	 */
	private int id;

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 密码
	 */
	private String pwd;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 身份证号码
	 */
	private String idcard;
	/**
	 * 店铺
	 */
	private int store;
	/**
	 * 角色
	 */
	private int ulevel;
	/**
	 * 状态
	 */
	private int state;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the idcard
	 */
	public String getIdcard() {
		return idcard;
	}

	/**
	 * @param idcard
	 *            the idcard to set
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	/**
	 * @return the store
	 */
	public int getStore() {
		return store;
	}

	/**
	 * @param store
	 *            the store to set
	 */
	public void setStore(int store) {
		this.store = store;
	}

	/**
	 * @return the ulevel
	 */
	public int getUlevel() {
		return ulevel;
	}

	/**
	 * @param ulevel
	 *            the ulevel to set
	 */
	public void setUlevel(int ulevel) {
		this.ulevel = ulevel;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

}
