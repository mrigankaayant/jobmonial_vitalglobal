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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * States generated by hbm2java
 */
@Entity
@Table(name = "states", catalog = "jobmonial")
public class States implements java.io.Serializable {

	private Integer id;
	private Countries countries;
	private String name;
	private String timeZone;
	private Set<Cities> citieses = new HashSet<Cities>(0);

	public States() {
	}

	public States(Countries countries, String name) {
		this.countries = countries;
		this.name = name;
	}

	public States(Countries countries, String name, String timeZone, Set<Cities> citieses) {
		this.countries = countries;
		this.name = name;
		this.timeZone = timeZone;
		this.citieses = citieses;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id", nullable = false)
	public Countries getCountries() {
		return this.countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	@Column(name = "name", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "time_zone", length = 20)
	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "states")
	public Set<Cities> getCitieses() {
		return this.citieses;
	}

	public void setCitieses(Set<Cities> citieses) {
		this.citieses = citieses;
	}

}
