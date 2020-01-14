package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUomDao;
import com.app.model.UomType;
@Repository
public class UomTypeImpl implements IUomDao{

	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer SaveUom(UomType uom) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(uom);
	}

	@Override
	public void UpdateUom(UomType uom) {
		// TODO Auto-generated method stub
		ht.update(uom);
	}

	@Override
	public void deleteUom(Integer uomId) {
		// TODO Auto-generated method stub
		UomType u=new UomType();
		u.setUomId(uomId);
		ht.delete(u);
	}

	@Override
	public UomType getUomById(Integer uomId) {
		// TODO Auto-generated method stub
		return ht.get(UomType.class,uomId);
	}

	@Override
	public List<UomType> getalluoms() {
		// TODO Auto-generated method stub
		return ht.loadAll(UomType.class);
	}

}
