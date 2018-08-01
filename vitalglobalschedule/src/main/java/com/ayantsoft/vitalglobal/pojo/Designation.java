package com.ayantsoft.vitalglobal.pojo;
// Generated 21 Dec, 2017 4:58:49 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Designation generated by hbm2java
 */
@Entity
@Table(name = "designation", catalog = "jobmonial")
public class Designation implements java.io.Serializable {

	private Integer id;
	private String designationName;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Designation() {
	}

	public Designation(String designationName) {
		this.designationName = designationName;
	}

	public Designation(String designationName, Set<Employee> employees) {
		this.designationName = designationName;
		this.employees = employees;
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

	@Column(name = "designation_name", nullable = false, length = 45)
	public String getDesignationName() {
		return this.designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "designation")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}