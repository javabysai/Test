package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.ShipmentType;
import com.app.model.UomType;

public class UomTypeExcelView extends AbstractXlsxView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//1.change filename
		response.addHeader("Content-Disposition","attachment;fileName=Uom.xlsx");
		//read data from model map
	List<UomType> list=(List<UomType>)model.get("list");
	//create sheet
Sheet	sheet=workbook.createSheet();
	//create row
setHead(sheet);
//create the data to the Body
setBody(sheet, list);
	}
public void setHead(Sheet sheet1)
{
Row row=sheet1.createRow(0);
row.createCell(0).setCellValue("id");
row.createCell(1).setCellValue("mode");
row.createCell(2).setCellValue("code");
row.createCell(3).setCellValue("enable");
row.createCell(4).setCellValue("grade");
row.createCell(5).setCellValue("note");
}
public void setBody(Sheet sheet,List<UomType> list)	
{
	int rowid=1;
	for(UomType s1:list)
	{
Row r =	sheet.createRow(rowid++);
r.createCell(0).setCellValue(s1.getUomId());
r.createCell(1).setCellValue(s1.getUomCode());
r.createCell(2).setCellValue(s1.getUomType());
r.createCell(3).setCellValue(s1.getEnableUom());
r.createCell(4).setCellValue(s1.getAdjSize());
r.createCell(5).setCellValue(s1.getNote());
r.createCell(6).setCellValue(s1.getMetaCode());
	}
}

}
