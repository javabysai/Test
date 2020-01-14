package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentDao;
import com.app.model.ShipmentType;

@Repository
public class ShipmentTypeImpl  implements IShipmentDao{
	@Autowired
private HibernateTemplate ht;
	
	@Override
	public Integer SaveShipment(ShipmentType shipmentType) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(shipmentType);
	}

	@Override
	public void updateShipmentType(ShipmentType shipmentType) {
		// TODO Auto-generated method stub
		ht.update(shipmentType);
	}

	@Override
	public void deleteshipmenttype(Integer shipmentId) {
		// TODO Auto-generated method stub
		ShipmentType s=new ShipmentType();
		s.setShipmentId(shipmentId);
		ht.delete(s);
	}

	@Override
	public List<ShipmentType> getallshipments() {
		// TODO Auto-generated method stub
		return ht.loadAll(ShipmentType.class);
	}

	@Override
	public ShipmentType getShipmentTypeById(Integer shipmentId) {
		// TODO Auto-generated method stub
		return ht.get(ShipmentType.class, shipmentId);
	}

}
