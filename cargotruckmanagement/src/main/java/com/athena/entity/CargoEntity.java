package com.athena.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cargo")
public class CargoEntity {

	@Id
	@Column(name = "Cargo_ID_No")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cIdNo;

	@Column(name = "Cargo_Type")
	private String cType;

	@Column(name = "Maximum_Cargo_Weight")
	private int maxCWeight;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Truck_ID_No", referencedColumnName = "Truck_ID_No")
	private TruckEntity tEntity;

	@Column(name = "Cargo_Destination")
	private String cDest;

	public int getcIdNo() {
		return cIdNo;
	}

	public void setcIdNo(int cIdNo) {
		this.cIdNo = cIdNo;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public int getMaxCWeight() {
		return maxCWeight;
	}

	public void setMaxCWeight(int maxCWeight) {
		this.maxCWeight = maxCWeight;
	}

	public TruckEntity gettEntity() {
		return tEntity;
	}

	public void settEntity(TruckEntity tEntity) {
		this.tEntity = tEntity;
	}

	public String getcDest() {
		return cDest;
	}

	public void setcDest(String cDest) {
		this.cDest = cDest;
	}

	public CargoEntity(int cIdNo, String cType, int maxCWeight, TruckEntity tEntity, String cDest) {
		super();
		this.cIdNo = cIdNo;
		this.cType = cType;
		this.maxCWeight = maxCWeight;
		this.tEntity = tEntity;
		this.cDest = cDest;
	}

	public CargoEntity() {
		super();
	}

}
