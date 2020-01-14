package com.app.service;

import java.util.List;

import com.app.model.UomType;

public interface IUomService {
	public Integer SaveUom(UomType uom);
	public void UpdateUom(UomType uom);
	public void deleteUom(Integer uomId);
	public UomType getUomById(Integer uomId);
	public List<UomType> getalluoms();

}
