package com.zhiyou100.test.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@SuppressWarnings("serial")
public class Dept implements Serializable {

	private Integer deptno;
	private String dname;
	private String loc;
	
	// 项目组
	private List<String> groups;
	
	private Set<String> groupSet;
	
	private Map<Integer, String> groupMap;
	
	private Properties groupProp; 
	
	private List<Emp> emps;

	public Dept() {
		// TODO Auto-generated constructor stub
	}
	
	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<String> getGroups() {
		return groups;
	}

	public void setGroups(List<String> groups) {
		this.groups = groups;
	}

	
	
	public Map<Integer, String> getGroupMap() {
		return groupMap;
	}

	public void setGroupMap(Map<Integer, String> groupMap) {
		this.groupMap = groupMap;
	}

	public Set<String> getGroupSet() {
		return groupSet;
	}

	public void setGroupSet(Set<String> groupSet) {
		this.groupSet = groupSet;
	}

	
	public Properties getGroupProp() {
		return groupProp;
	}

	public void setGroupProp(Properties groupProp) {
		this.groupProp = groupProp;
	}
	

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", groups=" + groups + ", groupSet="
				+ groupSet + ", groupMap=" + groupMap + ", groupProp=" + groupProp + ", emps=" + emps + "]";
	}

//	@Override
//	public String toString() {
//		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", groups=" + groups + ", groupSet="
//				+ groupSet + ", groupMap=" + groupMap + ", groupProp=" + groupProp + "]";
//	}

//	@Override
//	public String toString() {
//		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", groups=" + groups + ", groupSet="
//				+ groupSet + ", groupMap=" + groupMap + "]";
//	}

//	@Override
//	public String toString() {
//		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", groups=" + groups + ", groupSet="
//				+ groupSet + "]";
//	}

//	@Override
//	public String toString() {
//		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", groups=" + groups + "]";
//	}

//	@Override
//	public String toString() {
//		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
//	}

	
}
