package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="shiptab")
public class ShipmentType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private Integer shipmentId;
	@Column(name="smode")
	private String shipmentMode;
	@Column(name="scode")
	private String shipmentCode;
	@Column(name="eship")
	private String enableShipment;
	@Column(name="sgrade")
	private String shipmentGrade;
	@Column(name="note")
	private String note;
	public ShipmentType() {
		super();
	}
	@Override
	public String toString() {
		return "ShipmentType [shipmentId=" + shipmentId + ", shipmentMode=" + shipmentMode + ", shipmentCode="
				+ shipmentCode + ", enableShipment=" + enableShipment + ", shipmentGrade=" + shipmentGrade + ", note="
				+ note + "]";
	}
	public Integer getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getShipmentMode() {
		return shipmentMode;
	}
	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}
	public String getShipmentCode() {
		return shipmentCode;
	}
	public void setShipmentCode(String shipmentCode) {
		this.shipmentCode = shipmentCode;
	}
	public String getEnableShipment() {
		return enableShipment;
	}
	public void setEnableShipment(String enableShipment) {
		this.enableShipment = enableShipment;
	}
	public String getShipmentGrade() {
		return shipmentGrade;
	}
	public void setShipmentGrade(String shipmentGrade) {
		this.shipmentGrade = shipmentGrade;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}
