package com.app.dao;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentDao {
	
	public Integer SaveShipment(ShipmentType shipmentType);
	public void updateShipmentType(ShipmentType shipmentType);
	public void deleteshipmenttype(Integer shipmentId);
	public List<ShipmentType> getallshipments();
	public ShipmentType getShipmentTypeById(Integer shipmentId);

}
