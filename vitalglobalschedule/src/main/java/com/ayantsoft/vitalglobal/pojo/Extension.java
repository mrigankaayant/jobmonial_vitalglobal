package com.ayantsoft.vitalglobal.pojo;
// Generated 21 Dec, 2017 4:58:49 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Extension generated by hbm2java
 */
@Entity
@Table(name = "extension", catalog = "jobmonial")
public class Extension implements java.io.Serializable {

	private Integer id;
	private String employeeName;
	private String managerName;
	private String extension;
	private String email;

	public Extension() {
	}

	public Extension(String employeeName) {
		this.employeeName = employeeName;
	}

	public Extension(String employeeName, String managerName, String extension) {
		this.employeeName = employeeName;
		this.managerName = managerName;
		this.extension = extension;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "employee_name", nullable = false, length = 100)
	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Column(name = "manager_name", length = 100)
	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Column(name = "extension", length = 45)
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	
	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
