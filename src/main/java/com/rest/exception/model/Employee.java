package com.rest.exception.model;

public class Employee {

	private Integer eid;
	private String ename;
	/**
	 * @return the eid
	 */
	public Integer getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
}
