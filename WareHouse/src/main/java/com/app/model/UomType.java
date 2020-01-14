package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uomtab")
public class UomType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="uid")
	private Integer uomId;
	@Column(name="utype")
	private String uomType;
	@Column(name="ucode")
	private String uomCode;
	@Column(name="euom")
	private String enableUom;
	@Column(name="mcode")
	private String metaCode;
	@Column(name="adjsize")
	private String adjSize;
	@Column(name="note")
	private String note;
	public UomType() {
		super();
	}
	@Override
	public String toString() {
		return "UomType [uomId=" + uomId + ", uomType=" + uomType + ", uomCode=" + uomCode + ", enableUom=" + enableUom
				+ ", metaCode=" + metaCode + ", adjSize=" + adjSize + ", note=" + note + "]";
	}
	public Integer getUomId() {
		return uomId;
	}
	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}
	public String getUomType() {
		return uomType;
	}
	public void setUomType(String uomType) {
		this.uomType = uomType;
	}
	public String getUomCode() {
		return uomCode;
	}
	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
	}
	public String getEnableUom() {
		return enableUom;
	}
	public void setEnableUom(String enableUom) {
		this.enableUom = enableUom;
	}
	public String getMetaCode() {
		return metaCode;
	}
	public void setMetaCode(String metaCode) {
		this.metaCode = metaCode;
	}
	public String getAdjSize() {
		return adjSize;
	}
	public void setAdjSize(String adjSize) {
		this.adjSize = adjSize;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}	
	
}
