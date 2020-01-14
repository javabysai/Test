package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShipmentDao;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
@Service
public class ShipmentTypeService implements IShipmentTypeService{
@Autowired
	private IShipmentDao dao;
	@Override
	@Transactional
	public Integer SaveShipment(ShipmentType shipmentType) {
		// TODO Auto-generated method stub
		return dao.SaveShipment(shipmentType);
	}

	@Override
	@Transactional
	public void updateShipmentType(ShipmentType shipmentType) {
		// TODO Auto-generated method stub
		dao.updateShipmentType(shipmentType);
	}

	@Override
	@Transactional
	public void deleteshipmenttype(Integer shipmentId) {
		// TODO Auto-generated method stub
		dao.deleteshipmenttype(shipmentId);
	}

	
	@Override
	@Transactional(readOnly = true)
	public List<ShipmentType> getallshipments() {
		// TODO Auto-generated method stub
		return dao.getallshipments();
	}

	@Override
@Transactional(readOnly = true)
	public ShipmentType getShipmentTypeById(Integer shipmentId) {
		// TODO Auto-generated method stub
		return dao.getShipmentTypeById(shipmentId);
	}

}
