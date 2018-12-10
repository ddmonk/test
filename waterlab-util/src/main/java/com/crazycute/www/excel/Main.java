package com.crazycute.www.excel;


import com.crazycute.www.excel.pojo.excel.RiverOwner;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length != 3){
            System.out.println( "请输入3个参数");
        }
        ExcelHandler excelRead = ExcelHandler.getInstance();
        List<RiverOwner> ownerList = excelRead.readExcel(args[0],Integer.parseInt(args[1]));
        for (RiverOwner owner : ownerList){
            owner.setMsg(BuildEMS.buildMsg(owner));
        }
        excelRead.createExcel(ownerList,args[2]);
    }
}
