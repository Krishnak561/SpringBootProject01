package com.athena.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Truck")
public class TruckEntity {

	@Id
	@Column(name = "Truck_ID_No")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tIdNo;

	@Column(name = "Truck_License_No")
	private String tLNo;

	@Column(name = "FHWA_Class")
	private String axleNo;

	@Column(name = "Maintainance")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	private Date mainFlag;

	@OneToOne(mappedBy = "tEntity")
	private CargoEntity cEntity;

	public int gettIdNo() {
		return tIdNo;
	}

	public void settIdNo(int tIdNo) {
		this.tIdNo = tIdNo;
	}

	public String gettLNo() {
		return tLNo;
	}

	public void settLNo(String tLNo) {
		this.tLNo = tLNo;
	}

	public String getAxleNo() {
		return axleNo;
	}

	public void setAxleNo(String axleNo) {
		this.axleNo = axleNo;
	}

	public Date getMainFlag() {
		return mainFlag;
	}

	public void setMainFlag(Date mainFlag) {
		this.mainFlag = mainFlag;
	}

	public TruckEntity(int tIdNo, String tLNo, String axleNo, Date mainFlag) {
		super();
		this.tIdNo = tIdNo;
		this.tLNo = tLNo;
		this.axleNo = axleNo;
		this.mainFlag = mainFlag;
	}

	@Override
	public String toString() {
		return "[tIdNo=" + tIdNo + ", tLNo=" + tLNo + ", axleNo=" + axleNo + ", mainFlag=" + mainFlag + "]";
	}

	public TruckEntity() {
		super();
	}

}
