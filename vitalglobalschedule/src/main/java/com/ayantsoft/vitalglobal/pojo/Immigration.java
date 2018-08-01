package com.ayantsoft.vitalglobal.pojo;
// Generated 21 Dec, 2017 4:58:49 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Immigration generated by hbm2java
 */
@Entity
@Table(name = "immigration", catalog = "jobmonial")
public class Immigration implements java.io.Serializable {

	private Integer id;
	private Candidate candidate;
	private Date immigrationEndDate;
	private String immigrationRemarks;
	private Date immigrationStartDate;
	private String immigrationType;

	public Immigration() {
	}

	public Immigration(Candidate candidate, String immigrationType) {
		this.candidate = candidate;
		this.immigrationType = immigrationType;
	}

	public Immigration(Candidate candidate, Date immigrationEndDate, String immigrationRemarks,
			Date immigrationStartDate, String immigrationType) {
		this.candidate = candidate;
		this.immigrationEndDate = immigrationEndDate;
		this.immigrationRemarks = immigrationRemarks;
		this.immigrationStartDate = immigrationStartDate;
		this.immigrationType = immigrationType;
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
	@JoinColumn(name = "candidate_id", nullable = false)
	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "immigration_end_date", length = 10)
	public Date getImmigrationEndDate() {
		return this.immigrationEndDate;
	}

	public void setImmigrationEndDate(Date immigrationEndDate) {
		this.immigrationEndDate = immigrationEndDate;
	}

	@Column(name = "immigration_remarks", length = 145)
	public String getImmigrationRemarks() {
		return this.immigrationRemarks;
	}

	public void setImmigrationRemarks(String immigrationRemarks) {
		this.immigrationRemarks = immigrationRemarks;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "immigration_start_date", length = 10)
	public Date getImmigrationStartDate() {
		return this.immigrationStartDate;
	}

	public void setImmigrationStartDate(Date immigrationStartDate) {
		this.immigrationStartDate = immigrationStartDate;
	}

	@Column(name = "immigration_type", nullable = false, length = 45)
	public String getImmigrationType() {
		return this.immigrationType;
	}

	public void setImmigrationType(String immigrationType) {
		this.immigrationType = immigrationType;
	}

}
