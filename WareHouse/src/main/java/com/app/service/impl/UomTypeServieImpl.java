package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUomDao;
import com.app.model.UomType;
import com.app.service.IUomService;
@Service
public class UomTypeServieImpl implements IUomService
{
	@Autowired
private IUomDao dao;
	@Override
@Transactional
	public Integer SaveUom(UomType uom) {
		// TODO Auto-generated method stub
		return dao.SaveUom(uom);
	}

	@Override
	@Transactional
	public void UpdateUom(UomType uom) {
		// TODO Auto-generated method stub
		dao.UpdateUom(uom);
	}

	@Override
	@Transactional
	public void deleteUom(Integer uomId) {
		// TODO Auto-generated method stub
		dao.deleteUom(uomId);
	}

	@Override
	@Transactional(readOnly = true)
	public UomType getUomById(Integer uomId) {
		// TODO Auto-generated method stub
		return dao.getUomById(uomId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UomType> getalluoms() {
		// TODO Auto-generated method stub
		return dao.getalluoms();
	}

}
