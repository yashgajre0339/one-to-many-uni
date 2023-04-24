package com.jsp.HospitalBranch;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int id;
private String name;
private String gst_no;

@OneToMany
private List<Branch> branches; 

public List<Branch> getBranches() {
	return branches;
}
public void setBranches(List<Branch> branch) {
	this.branches = branch;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGst_no() {
	return gst_no;
}
public void setGst_no(String gst_no) {
	this.gst_no = gst_no;
}
	

}
