package com.ayantsoft.vitalglobal.pojo;
// Generated 21 Dec, 2017 4:58:49 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProgrammeSchedule generated by hbm2java
 */
@Entity
@Table(name = "programme_schedule", catalog = "jobmonial")
public class ProgrammeSchedule implements java.io.Serializable {

	private Integer id;
	private CandidateCourse candidateCourse;
	private Trainer trainer;
	private String dayOfWeek;
	private Integer duration;
	private Date endDate;
	private Integer noOfOccurrence;
	private Date startDate;
	private Date startTime;
	private String title;
	private Date endTime;
	private String isComplete;
	private Set<Candidate> candidates = new HashSet<Candidate>(0);
	private Set<TrainerInvoice> trainerInvoices = new HashSet<TrainerInvoice>(0);

	public ProgrammeSchedule() {
	}

	public ProgrammeSchedule(CandidateCourse candidateCourse, Trainer trainer) {
		this.candidateCourse = candidateCourse;
		this.trainer = trainer;
	}

	public ProgrammeSchedule(CandidateCourse candidateCourse, Trainer trainer, String dayOfWeek, Integer duration,
			Date endDate, Integer noOfOccurrence, Date startDate, Date startTime, String title, Date endTime,
			String isComplete, Set<Candidate> candidates, Set<TrainerInvoice> trainerInvoices) {
		this.candidateCourse = candidateCourse;
		this.trainer = trainer;
		this.dayOfWeek = dayOfWeek;
		this.duration = duration;
		this.endDate = endDate;
		this.noOfOccurrence = noOfOccurrence;
		this.startDate = startDate;
		this.startTime = startTime;
		this.title = title;
		this.endTime = endTime;
		this.isComplete = isComplete;
		this.candidates = candidates;
		this.trainerInvoices = trainerInvoices;
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
	@JoinColumn(name = "course_id", nullable = false)
	public CandidateCourse getCandidateCourse() {
		return this.candidateCourse;
	}

	public void setCandidateCourse(CandidateCourse candidateCourse) {
		this.candidateCourse = candidateCourse;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trainer_id", nullable = false)
	public Trainer getTrainer() {
		return this.trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Column(name = "day_of_week", length = 145)
	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Column(name = "duration")
	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date", length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "no_of_occurrence")
	public Integer getNoOfOccurrence() {
		return this.noOfOccurrence;
	}

	public void setNoOfOccurrence(Integer noOfOccurrence) {
		this.noOfOccurrence = noOfOccurrence;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "start_date", length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "start_time", length = 8)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Column(name = "title", length = 145)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "end_time", length = 8)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "is_complete", length = 45)
	public String getIsComplete() {
		return this.isComplete;
	}

	public void setIsComplete(String isComplete) {
		this.isComplete = isComplete;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "programmeSchedules")
	public Set<Candidate> getCandidates() {
		return this.candidates;
	}

	public void setCandidates(Set<Candidate> candidates) {
		this.candidates = candidates;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "programmeSchedule")
	public Set<TrainerInvoice> getTrainerInvoices() {
		return this.trainerInvoices;
	}

	public void setTrainerInvoices(Set<TrainerInvoice> trainerInvoices) {
		this.trainerInvoices = trainerInvoices;
	}

}
