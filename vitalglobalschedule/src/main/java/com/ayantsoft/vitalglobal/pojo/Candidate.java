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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Candidate generated by hbm2java
 */
@Entity
@Table(name = "candidate", catalog = "jobmonial")
public class Candidate implements java.io.Serializable {

	private Integer candidateId;
	private CandidateCourse candidateCourse;
	private CandidateRemarks candidateRemarks;
	private ContactAddress contactAddress;
	private Employee employee;
	private UserProfile userProfile;
	private String availiability;
	private Long billRate;
	private Date birthDate;
	private String credentialType;
	private String currentLocation;
	private String employementType;
	private Date entryDate;
	private Integer expYearsInUsa;
	private String firstName;
	private String gender;
	private Date immigrationStartDate;
	private String immigrationType;
	private String jobTitle;
	private Date joiningDate;
	private Date lastModifiedOn;
	private String lastName;
	private String maritalStatus;
	private String middleName;
	private Date nextFollowUpDate;
	private String nickName;
	private Boolean onHold;
	private Long payRate;
	private String payType;
	private String preferedLocation;
	private String profileName;
	private String reasonForNotAvailiable;
	private String recruitmentRemarks;
	private String recruitmentSource;
	private String recruitmentStatus;
	private String recruitmentSubStatus;
	private String refundCondition;
	private Long salaryExpactation;
	private String ssn;
	private Integer techSkillRating;
	private Long totalAmount;
	private String totalExp;
	private Date yearOfPassing;
	private Integer yearsInUsa;
	private String dueDate;
	private String candidateStatus;
	private String resumePath;
	private Date enrollmentDate;
	private Set<CandidateSkills> candidateSkillses = new HashSet<CandidateSkills>(0);
	private Set<Immigration> immigrations = new HashSet<Immigration>(0);
	private Set<Employee> employees = new HashSet<Employee>(0);
	private Set<CandidatePayment> candidatePayments = new HashSet<CandidatePayment>(0);
	private Set<ProgrammeSchedule> programmeSchedules = new HashSet<ProgrammeSchedule>(0);
	private Set<Documents> documentses = new HashSet<Documents>(0);
	private Set<FollowUp> followUps = new HashSet<FollowUp>(0);
	private Set<CandidateGroup> candidateGroups = new HashSet<CandidateGroup>(0);
	private Set<EducationCertification> educationCertifications = new HashSet<EducationCertification>(0);

	public Candidate() {
	}

	public Candidate(String firstName) {
		this.firstName = firstName;
	}

	public Candidate(CandidateCourse candidateCourse, CandidateRemarks candidateRemarks, ContactAddress contactAddress,
			Employee employee, UserProfile userProfile, String availiability, Long billRate, Date birthDate,
			String credentialType, String currentLocation, String employementType, Date entryDate,
			Integer expYearsInUsa, String firstName, String gender, Date immigrationStartDate, String immigrationType,
			String jobTitle, Date joiningDate, Date lastModifiedOn, String lastName, String maritalStatus,
			String middleName, Date nextFollowUpDate, String nickName, Boolean onHold, Long payRate, String payType,
			String preferedLocation, String profileName, String reasonForNotAvailiable, String recruitmentRemarks,
			String recruitmentSource, String recruitmentStatus, String recruitmentSubStatus, String refundCondition,
			Long salaryExpactation, String ssn, Integer techSkillRating, Long totalAmount, String totalExp,
			Date yearOfPassing, Integer yearsInUsa, String dueDate, String candidateStatus, String resumePath,
			Date enrollmentDate, Set<CandidateSkills> candidateSkillses, Set<Immigration> immigrations,
			Set<Employee> employees, Set<CandidatePayment> candidatePayments, Set<ProgrammeSchedule> programmeSchedules,
			Set<Documents> documentses, Set<FollowUp> followUps, Set<CandidateGroup> candidateGroups,
			Set<EducationCertification> educationCertifications) {
		this.candidateCourse = candidateCourse;
		this.candidateRemarks = candidateRemarks;
		this.contactAddress = contactAddress;
		this.employee = employee;
		this.userProfile = userProfile;
		this.availiability = availiability;
		this.billRate = billRate;
		this.birthDate = birthDate;
		this.credentialType = credentialType;
		this.currentLocation = currentLocation;
		this.employementType = employementType;
		this.entryDate = entryDate;
		this.expYearsInUsa = expYearsInUsa;
		this.firstName = firstName;
		this.gender = gender;
		this.immigrationStartDate = immigrationStartDate;
		this.immigrationType = immigrationType;
		this.jobTitle = jobTitle;
		this.joiningDate = joiningDate;
		this.lastModifiedOn = lastModifiedOn;
		this.lastName = lastName;
		this.maritalStatus = maritalStatus;
		this.middleName = middleName;
		this.nextFollowUpDate = nextFollowUpDate;
		this.nickName = nickName;
		this.onHold = onHold;
		this.payRate = payRate;
		this.payType = payType;
		this.preferedLocation = preferedLocation;
		this.profileName = profileName;
		this.reasonForNotAvailiable = reasonForNotAvailiable;
		this.recruitmentRemarks = recruitmentRemarks;
		this.recruitmentSource = recruitmentSource;
		this.recruitmentStatus = recruitmentStatus;
		this.recruitmentSubStatus = recruitmentSubStatus;
		this.refundCondition = refundCondition;
		this.salaryExpactation = salaryExpactation;
		this.ssn = ssn;
		this.techSkillRating = techSkillRating;
		this.totalAmount = totalAmount;
		this.totalExp = totalExp;
		this.yearOfPassing = yearOfPassing;
		this.yearsInUsa = yearsInUsa;
		this.dueDate = dueDate;
		this.candidateStatus = candidateStatus;
		this.resumePath = resumePath;
		this.enrollmentDate = enrollmentDate;
		this.candidateSkillses = candidateSkillses;
		this.immigrations = immigrations;
		this.employees = employees;
		this.candidatePayments = candidatePayments;
		this.programmeSchedules = programmeSchedules;
		this.documentses = documentses;
		this.followUps = followUps;
		this.candidateGroups = candidateGroups;
		this.educationCertifications = educationCertifications;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "candidate_id", unique = true, nullable = false)
	public Integer getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tech_skills")
	public CandidateCourse getCandidateCourse() {
		return this.candidateCourse;
	}

	public void setCandidateCourse(CandidateCourse candidateCourse) {
		this.candidateCourse = candidateCourse;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "candidate_remarks_id")
	public CandidateRemarks getCandidateRemarks() {
		return this.candidateRemarks;
	}

	public void setCandidateRemarks(CandidateRemarks candidateRemarks) {
		this.candidateRemarks = candidateRemarks;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_address_id")
	public ContactAddress getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(ContactAddress contactAddress) {
		this.contactAddress = contactAddress;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recruiter_emp_id")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_profile_id")
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Column(name = "availiability", length = 60)
	public String getAvailiability() {
		return this.availiability;
	}

	public void setAvailiability(String availiability) {
		this.availiability = availiability;
	}

	@Column(name = "bill_rate")
	public Long getBillRate() {
		return this.billRate;
	}

	public void setBillRate(Long billRate) {
		this.billRate = billRate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "birth_date", length = 10)
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "credential_type", length = 45)
	public String getCredentialType() {
		return this.credentialType;
	}

	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}

	@Column(name = "current_location", length = 45)
	public String getCurrentLocation() {
		return this.currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	@Column(name = "employement_type", length = 45)
	public String getEmployementType() {
		return this.employementType;
	}

	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "entry_date", length = 10)
	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	@Column(name = "exp_years_in_usa")
	public Integer getExpYearsInUsa() {
		return this.expYearsInUsa;
	}

	public void setExpYearsInUsa(Integer expYearsInUsa) {
		this.expYearsInUsa = expYearsInUsa;
	}

	@Column(name = "first_name", nullable = false, length = 100)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "gender", length = 5)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "immigration_start_date", length = 10)
	public Date getImmigrationStartDate() {
		return this.immigrationStartDate;
	}

	public void setImmigrationStartDate(Date immigrationStartDate) {
		this.immigrationStartDate = immigrationStartDate;
	}

	@Column(name = "immigration_type", length = 45)
	public String getImmigrationType() {
		return this.immigrationType;
	}

	public void setImmigrationType(String immigrationType) {
		this.immigrationType = immigrationType;
	}

	@Column(name = "job_title", length = 145)
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "joining_date", length = 10)
	public Date getJoiningDate() {
		return this.joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "lastModifiedOn", length = 10)
	public Date getLastModifiedOn() {
		return this.lastModifiedOn;
	}

	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	@Column(name = "last_name", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "marital_status", length = 10)
	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	@Column(name = "middle_name", length = 45)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "nextFollowUpDate", length = 10)
	public Date getNextFollowUpDate() {
		return this.nextFollowUpDate;
	}

	public void setNextFollowUpDate(Date nextFollowUpDate) {
		this.nextFollowUpDate = nextFollowUpDate;
	}

	@Column(name = "nick_name", length = 45)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "on_hold")
	public Boolean getOnHold() {
		return this.onHold;
	}

	public void setOnHold(Boolean onHold) {
		this.onHold = onHold;
	}

	@Column(name = "pay_rate")
	public Long getPayRate() {
		return this.payRate;
	}

	public void setPayRate(Long payRate) {
		this.payRate = payRate;
	}

	@Column(name = "pay_type", length = 15)
	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Column(name = "prefered_location", length = 500)
	public String getPreferedLocation() {
		return this.preferedLocation;
	}

	public void setPreferedLocation(String preferedLocation) {
		this.preferedLocation = preferedLocation;
	}

	@Column(name = "profile_name", length = 145)
	public String getProfileName() {
		return this.profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Column(name = "reason_for_not_availiable", length = 145)
	public String getReasonForNotAvailiable() {
		return this.reasonForNotAvailiable;
	}

	public void setReasonForNotAvailiable(String reasonForNotAvailiable) {
		this.reasonForNotAvailiable = reasonForNotAvailiable;
	}

	@Column(name = "recruitment_remarks", length = 245)
	public String getRecruitmentRemarks() {
		return this.recruitmentRemarks;
	}

	public void setRecruitmentRemarks(String recruitmentRemarks) {
		this.recruitmentRemarks = recruitmentRemarks;
	}

	@Column(name = "recruitment_source", length = 45)
	public String getRecruitmentSource() {
		return this.recruitmentSource;
	}

	public void setRecruitmentSource(String recruitmentSource) {
		this.recruitmentSource = recruitmentSource;
	}

	@Column(name = "recruitment_status", length = 45)
	public String getRecruitmentStatus() {
		return this.recruitmentStatus;
	}

	public void setRecruitmentStatus(String recruitmentStatus) {
		this.recruitmentStatus = recruitmentStatus;
	}

	@Column(name = "recruitment_sub_status", length = 45)
	public String getRecruitmentSubStatus() {
		return this.recruitmentSubStatus;
	}

	public void setRecruitmentSubStatus(String recruitmentSubStatus) {
		this.recruitmentSubStatus = recruitmentSubStatus;
	}

	@Column(name = "refund_condition", length = 245)
	public String getRefundCondition() {
		return this.refundCondition;
	}

	public void setRefundCondition(String refundCondition) {
		this.refundCondition = refundCondition;
	}

	@Column(name = "salary_expactation")
	public Long getSalaryExpactation() {
		return this.salaryExpactation;
	}

	public void setSalaryExpactation(Long salaryExpactation) {
		this.salaryExpactation = salaryExpactation;
	}

	@Column(name = "ssn", length = 15)
	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Column(name = "tech_skill_rating")
	public Integer getTechSkillRating() {
		return this.techSkillRating;
	}

	public void setTechSkillRating(Integer techSkillRating) {
		this.techSkillRating = techSkillRating;
	}

	@Column(name = "total_amount")
	public Long getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "total_exp", length = 45)
	public String getTotalExp() {
		return this.totalExp;
	}

	public void setTotalExp(String totalExp) {
		this.totalExp = totalExp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "year_of_passing", length = 10)
	public Date getYearOfPassing() {
		return this.yearOfPassing;
	}

	public void setYearOfPassing(Date yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	@Column(name = "years_in_usa")
	public Integer getYearsInUsa() {
		return this.yearsInUsa;
	}

	public void setYearsInUsa(Integer yearsInUsa) {
		this.yearsInUsa = yearsInUsa;
	}

	@Column(name = "due_date", length = 45)
	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Column(name = "candidate_status", length = 45)
	public String getCandidateStatus() {
		return this.candidateStatus;
	}

	public void setCandidateStatus(String candidateStatus) {
		this.candidateStatus = candidateStatus;
	}

	@Column(name = "resume_path", length = 500)
	public String getResumePath() {
		return this.resumePath;
	}

	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "enrollment_date", length = 10)
	public Date getEnrollmentDate() {
		return this.enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
	public Set<CandidateSkills> getCandidateSkillses() {
		return this.candidateSkillses;
	}

	public void setCandidateSkillses(Set<CandidateSkills> candidateSkillses) {
		this.candidateSkillses = candidateSkillses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
	public Set<Immigration> getImmigrations() {
		return this.immigrations;
	}

	public void setImmigrations(Set<Immigration> immigrations) {
		this.immigrations = immigrations;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "candidate_has_salesresponsibility", catalog = "jobmonial", joinColumns = {
			@JoinColumn(name = "candidate_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "employee_id", nullable = false, updatable = false) })
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
	public Set<CandidatePayment> getCandidatePayments() {
		return this.candidatePayments;
	}

	public void setCandidatePayments(Set<CandidatePayment> candidatePayments) {
		this.candidatePayments = candidatePayments;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "candidate_programme_schedule", catalog = "jobmonial", joinColumns = {
			@JoinColumn(name = "candidate_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "programme_id", nullable = false, updatable = false) })
	public Set<ProgrammeSchedule> getProgrammeSchedules() {
		return this.programmeSchedules;
	}

	public void setProgrammeSchedules(Set<ProgrammeSchedule> programmeSchedules) {
		this.programmeSchedules = programmeSchedules;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "candidate_has_documents", catalog = "jobmonial", joinColumns = {
			@JoinColumn(name = "candidateId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "documentsId", nullable = false, updatable = false) })
	public Set<Documents> getDocumentses() {
		return this.documentses;
	}

	public void setDocumentses(Set<Documents> documentses) {
		this.documentses = documentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
	public Set<FollowUp> getFollowUps() {
		return this.followUps;
	}

	public void setFollowUps(Set<FollowUp> followUps) {
		this.followUps = followUps;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "group_has_candidate", catalog = "jobmonial", joinColumns = {
			@JoinColumn(name = "candidate_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "candidate_group_id", nullable = false, updatable = false) })
	public Set<CandidateGroup> getCandidateGroups() {
		return this.candidateGroups;
	}

	public void setCandidateGroups(Set<CandidateGroup> candidateGroups) {
		this.candidateGroups = candidateGroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "candidate")
	public Set<EducationCertification> getEducationCertifications() {
		return this.educationCertifications;
	}

	public void setEducationCertifications(Set<EducationCertification> educationCertifications) {
		this.educationCertifications = educationCertifications;
	}

}
