//package com.example.user.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="Salary Details")
//public class Salary {
//
//
//		@Id
//		@GeneratedValue
//		private int salaryid;
//		private String ctc;
//		private String basic_salary;
//		private String ta;
//		private String fa;
//		private String pf;
//		private String esi;
//		private String overall_salary;
//		
//		@OneToOne(mappedBy ="Salary")
//		private Attendance attendance;
//
//		public int getSalaryid() {
//			return salaryid;
//		}
//
//		public void setSalaryid(int salaryid) {
//			this.salaryid = salaryid;
//		}
//
//		public String getCtc() {
//			return ctc;
//		}
//
//		public void setCtc(String ctc) {
//			this.ctc = ctc;
//		}
//
//		public String getBasic_salary() {
//			return basic_salary;
//		}
//
//		public void setBasic_salary(String basic_salary) {
//			this.basic_salary = basic_salary;
//		}
//
//		public String getTa() {
//			return ta;
//		}
//
//		public void setTa(String ta) {
//			this.ta = ta;
//		}
//
//		public String getFa() {
//			return fa;
//		}
//
//		public void setFa(String fa) {
//			this.fa = fa;
//		}
//
//		public String getPf() {
//			return pf;
//		}
//
//		public void setPf(String pf) {
//			this.pf = pf;
//		}
//
//		public String getEsi() {
//			return esi;
//		}
//
//		public void setEsi(String esi) {
//			this.esi = esi;
//		}
//
//		public String getOverall_salary() {
//			return overall_salary;
//		}
//
//		public void setOverall_salary(String overall_salary) {
//			this.overall_salary = overall_salary;
//		}
//
//		public Attendance getAttendance() {
//			return attendance;
//		}
//
//		public void setAttendance(Attendance attendance) {
//			this.attendance = attendance;
//		}
//		
//}
