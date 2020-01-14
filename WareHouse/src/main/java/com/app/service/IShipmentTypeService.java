package com.app.service;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeService 
{
	public Integer SaveShipment(ShipmentType shipmentType);
	public void updateShipmentType(ShipmentType shipmentType);
	public void deleteshipmenttype(Integer shipmentId);
	public ShipmentType getShipmentTypeById(Integer shipmentId);
	public List<ShipmentType> getallshipments();
	
	
}
