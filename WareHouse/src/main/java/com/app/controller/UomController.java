package com.app.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.UomType;
import com.app.service.IUomService;
import com.app.view.ShipmentTypeExcelView;
import com.app.view.UomTypeExcelView;

@Controller
@RequestMapping("/uom")
public class UomController {
@Autowired
	private IUomService ser;
@RequestMapping("/regpage")	
public String uompage(ModelMap map)
	{
	map.addAttribute(new UomType());
	return "UomRegisterPage";
	}
@RequestMapping(value="/save",method = RequestMethod.POST)
public String saveuom(@ModelAttribute UomType uomType,ModelMap map)
{
Integer id=ser.SaveUom(uomType);
map.addAttribute("id","the id saved is "+id);
return "UomRegisterPage";
}

@RequestMapping("/viewall")
public String showall(ModelMap map)
{
List<UomType> uom =ser.getalluoms();
map.addAttribute("all",uom);
//System.out.println(uom+"----------------");
	return "UomData";
}

@RequestMapping("/edituom")
public String edituom(@RequestParam Integer uomId,ModelMap map)
{
UomType uom=ser.getUomById(uomId);
map.addAttribute("data",uom);
return "UomEditPage";
}

/*@RequestMapping(value="/save",method=RequestMethod.POST)
public String doUpdate(@ModelAttribute UomType uomType,ModelMap map) {

	ser.UpdateUom(uomType);
	map.addAttribute("data", ser.getalluoms());

	return "UomRegisterPage";
}*/
//delete method
@RequestMapping("/delete")
public String delete(@RequestParam Integer uomId,ModelMap map)
{
	ser.deleteUom(uomId);
	map.addAttribute("all",ser.getalluoms());
	return "UomData";
}

@RequestMapping("/excel")
public ModelAndView doexport(@RequestParam(value = "id",required = false,defaultValue = "0")Integer uomId)
{
	ModelAndView m=new ModelAndView();
	m.setView(new UomTypeExcelView());
	if(uomId==0)
	{
		m.addObject("list",ser.getalluoms());
	}
	else
	{
		m.addObject("list",Collections.singletonList(ser.getalluoms()));
	}
	return m;
	
}	


}