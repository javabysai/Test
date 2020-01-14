package com.app.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
import com.app.view.ShipmentTypeExcelView;

@Controller
@RequestMapping("/ship")
public class ShipController {

	@Autowired
	private IShipmentTypeService ser;

	@RequestMapping("/Regpage")
	public String regpage(ModelMap map)
	{
		map.addAttribute(new ShipmentType());
		return "ShipmentReg";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveship(@ModelAttribute ShipmentType shipmentType,ModelMap map)
	{
		Integer id=	ser.SaveShipment(shipmentType);
		map.addAttribute("id",id);
		return "ShipmentReg";

	}

	@RequestMapping("/viewall")
	public String viewall(ModelMap map)
	{
		List<ShipmentType> st=ser.getallshipments();
		map.addAttribute("data",st);
		return "ShipmentData";
	}
	// 6.show edit page
	@RequestMapping("/editOne")
	public String showEdit(@RequestParam Integer shipmentId,ModelMap map) {

		//load db row as object and send data to ui
		map.addAttribute("shipmentType", ser.getShipmentTypeById(shipmentId));

		return "ShipmentTypeEdit";
	}

	@RequestMapping(value="/update",method =RequestMethod.POST)
	public String update(@ModelAttribute ShipmentType shipmentType,ModelMap map)
	{
		ser.updateShipmentType(shipmentType);
		List<ShipmentType> st=	ser.getallshipments();
		map.addAttribute("data",st);
		return "ShipmentData";
	}

	
	@RequestMapping(value="/delete")
	public String deleteRecord(@RequestParam Integer shipmentId,ModelMap map)
	{
		ser.deleteshipmenttype(shipmentId);
		map.addAttribute("data",ser.getallshipments());
		return "ShipmentData";
	}
	
	//7.export to excel
	@RequestMapping("/excel")
	public ModelAndView doexport(@RequestParam(value = "id",required = false,defaultValue = "0")Integer shipmentId)
	{
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		if(shipmentId==0)
		{
			m.addObject("list",ser.getallshipments());
		}
		else
		{
			m.addObject("list",Collections.singletonList(ser.getShipmentTypeById(shipmentId)));
		}
		return m;
		
	}	
	
	//export to pdf
	
	
	
	
	
	
}
