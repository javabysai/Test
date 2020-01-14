package com.app.dao;

import java.util.List;

import com.app.model.UomType;

public interface IUomDao {
public Integer SaveUom(UomType uom);
public void UpdateUom(UomType uom);
public void deleteUom(Integer uomId);
public UomType getUomById(Integer UomId);
public List<UomType> getalluoms();
}
