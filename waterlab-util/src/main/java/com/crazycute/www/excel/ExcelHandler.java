package com.crazycute.www.excel;

import com.crazycute.www.pojo.EnumState;
import com.crazycute.www.pojo.excel.MonitorStatistics;
import com.crazycute.www.pojo.excel.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelHandler {

    private ExcelHandler() {
    };

    public static ExcelHandler instance = new ExcelHandler();

    public static ExcelHandler getInstance() {
        return instance;
    }

    public List<RiverOwner> readExcel(String path, int num) throws IOException {
        XSSFWorkbook hss = new XSSFWorkbook(new FileInputStream(path));
        List<RiverOwner> riverOwners = new ArrayList<RiverOwner>();
        FormulaEvaluator evaluator = hss.getCreationHelper().createFormulaEvaluator();
        XSSFSheet hssfSheet = hss.getSheetAt(num);
        int rowStart = hssfSheet.getFirstRowNum() + 5;
        int i = rowStart;
        int rowEnd = hssfSheet.getLastRowNum();
        while (i <= rowEnd) {
            XSSFRow row = hssfSheet.getRow(i);
            XSSFCell name = row.getCell(0);
            XSSFCell position = row.getCell(1);
            XSSFCell rivername = row.getCell(2);
            XSSFCell fixedName = row.getCell(3);
            XSSFCell oxy = row.getCell(4);
            XSSFCell kmn = row.getCell(5);
            XSSFCell hisox = row.getCell(6);
            XSSFCell nh4 = row.getCell(7);
            XSSFCell p = row.getCell(8);
            XSSFCell target = row.getCell(9);
            XSSFCell now = row.getCell(10);
            XSSFCell isfixed = row.getCell(11);
            XSSFCell N = row.getCell(12);
            RiverOwner owner;
            if (!StringUtils.isEmpty(name.getStringCellValue())) {
                owner = new RiverOwner();
                owner.setUserName(name.getStringCellValue());
                owner.setPosition(position.getStringCellValue());
                riverOwners.add(owner);
            }else {
                owner = riverOwners.get(riverOwners.size()-1);
            }
            RiverStatistics riverStatistics;
            if (!StringUtils.isEmpty(rivername.getStringCellValue())){
                riverStatistics = new RiverStatistics();
                riverStatistics.setRiverName(rivername.getStringCellValue());
                if (owner.getRiverStatisticsList() == null){
                    owner.setRiverStatisticsList(new ArrayList<RiverStatistics>());
                }
                owner.getRiverStatisticsList().add(riverStatistics);
            }else {
                riverStatistics = owner.getRiverStatisticsList().get(owner.getRiverStatisticsList().size()-1);
            }
            RiverSubStatistics subStatistics;
            if (!StringUtils.isEmpty(target.getStringCellValue() )){
                subStatistics = new RiverSubStatistics();
                //设置目标值
                subStatistics.setTargetQuality(checkQuilty(target.getStringCellValue()));
                //设置当前值
                subStatistics.setNowQuality(checkQuilty(now.getStringCellValue()));
                //是否达成
                subStatistics.setOk(isfixed.getStringCellValue().equals("是"));
                if (riverStatistics.getSubStatistics() == null){
                    riverStatistics.setSubStatistics(new ArrayList<RiverSubStatistics>());
                }
                riverStatistics.getSubStatistics().add(subStatistics);
            }else {
                subStatistics = riverStatistics.getSubStatistics().get(riverStatistics.getSubStatistics().size() - 1);
            }
            if (fixedName.getStringCellValue().contains("水质类别")){
                RiverSingleElement element = new RiverSingleElement();
                element.setCodStandard(checkQuilty(hisox.getRichStringCellValue().toString()));
                element.setDissolvedOxyStandard(checkQuilty(oxy.getRichStringCellValue().toString()));
                element.setNh3_nStandard(checkQuilty(nh4.getRichStringCellValue().toString()));
                element.setPermanganateStandard(checkQuilty(kmn.getRichStringCellValue().toString()));
                element.setPhosphorusStandard(checkQuilty(p.getRichStringCellValue().toString()));
                if (!StringUtils.isEmpty(N.getRichStringCellValue().toString())){
                    element.setTotalN(checkQuilty(N.getRichStringCellValue().toString()));
                }
                subStatistics.setElementLevel(element);
            }else if (fixedName.getStringCellValue().contains("类标准")){
                if(p.getStringCellValue().contains("湖泊")){
                    subStatistics.setType(EnumState.WaterType.LAKE);
                }else {
                    subStatistics.setType(EnumState.WaterType.RIVER);
                }
            }else if(fixedName.getStringCellValue().contains("平均值")){
                MonitorStatistics monitor = new MonitorStatistics();
                monitor.setDissolvedOxy(oxy.getNumericCellValue());
                monitor.setPermanganate(kmn.getNumericCellValue());
                monitor.setFixedName(fixedName.getStringCellValue());
                if(hisox.getCellType() == Cell.CELL_TYPE_STRING){
                    monitor.setCod(0);
                }else {
                    monitor.setCod(hisox.getNumericCellValue());
                }
                monitor.setNh3_n(nh4.getNumericCellValue());
                monitor.setTotal_phosphorus(p.getNumericCellValue());
                if(N.getCellType() == Cell.CELL_TYPE_STRING){
                    monitor.setTotal_N(0);
                }else {
                    monitor.setTotal_N(N.getNumericCellValue());
                }
                subStatistics.setAvgValues(monitor);
            } else  {
                MonitorStatistics monitor = new MonitorStatistics();
                if (oxy == null){
                    break ;
                }
                monitor.setDissolvedOxy(oxy.getNumericCellValue());
                monitor.setPermanganate(kmn.getNumericCellValue());
                monitor.setFixedName(fixedName.getStringCellValue());
                if(hisox.getCellType() == Cell.CELL_TYPE_STRING){
                    monitor.setCod(0);
                }else {
                    monitor.setCod(hisox.getNumericCellValue());
                }
                monitor.setNh3_n(nh4.getNumericCellValue());
                monitor.setTotal_phosphorus(p.getNumericCellValue());
                if(N.getCellType() == Cell.CELL_TYPE_STRING){
                    monitor.setTotal_N(0);
                }else {
                    monitor.setTotal_N(N.getNumericCellValue());
                }

                List<MonitorStatistics> monitorStatistics = subStatistics.getMonitors();
                if (subStatistics.getMonitors() == null){
                    subStatistics.setMonitors(new ArrayList<MonitorStatistics>());
                }
                subStatistics.getMonitors().add(monitor);
            }
            i++;
        }
        return riverOwners;
    }


    public EnumState.WaterQualityEnum checkQuilty(String quilty){
        switch (quilty){
            case "Ⅰ类": return EnumState.WaterQualityEnum.LEVEL1;
            case "I类": return EnumState.WaterQualityEnum.LEVEL1;
            case "Ⅱ类": return EnumState.WaterQualityEnum.LEVEL2;
            case "II类": return EnumState.WaterQualityEnum.LEVEL2;
            case "IV类": return EnumState.WaterQualityEnum.LEVEL4;
            case "Ⅳ类": return EnumState.WaterQualityEnum.LEVEL4;
            case "III类" : return EnumState.WaterQualityEnum.LEVEL3;
            case "Ⅲ类" : return EnumState.WaterQualityEnum.LEVEL3;
            case "V类" : return EnumState.WaterQualityEnum.LEVEL5;
            case "Ⅴ类" : return EnumState.WaterQualityEnum.LEVEL5;
            case "劣V类": return EnumState.WaterQualityEnum.LEVEL5_DEEP;
            case "劣Ⅴ类": return EnumState.WaterQualityEnum.LEVEL5_DEEP;
            default: return null;
        }
    }


    public void createExcel(List<RiverOwner> ownerList,String fileDir) throws IOException {
        //创建workbook
        HSSFWorkbook workbook = new HSSFWorkbook();
        //添加Worksheet（不添加sheet时生成的xls文件打开时会报错)
        HSSFSheet sheet1 = workbook.createSheet("output");
        //新建文件
        FileOutputStream out = null;
        try {
            //添加表头
            HSSFRow title = workbook.getSheet("output").createRow(0);    //创建第一行
            HSSFCell tname = title.createCell(0);
            tname.setCellValue("吴江区级河长");
            HSSFCell tposition = title.createCell(1);
            tposition.setCellValue("职位");
            HSSFCell tmsg = title.createCell(2);
            tmsg.setCellValue("水质信息描述");

            int rowId = 1;
            for (RiverOwner owner : ownerList){
                HSSFRow row = workbook.getSheet("output").createRow(rowId);
                HSSFCell name = row.createCell(0);
                name.setCellValue(owner.getUserName());
                HSSFCell position = row.createCell(1);
                position.setCellValue(owner.getPosition());
                HSSFCell msg = row.createCell(2);
                msg.setCellValue(owner.getMsg());
                rowId ++;
            }
            out = new FileOutputStream(fileDir);
            workbook.write(out);
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
