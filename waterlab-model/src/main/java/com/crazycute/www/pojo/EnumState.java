package com.crazycute.www.pojo;

public class EnumState{
    public enum WaterQualityEnum {
        LEVEL1("Ⅰ",1),
        LEVEL2("Ⅱ",2),
        LEVEL3("Ⅲ",3),
        LEVEL4("Ⅳ",4),
        LEVEL5("Ⅴ",5),
        LEVEL5_DEEP("劣Ⅴ",6);

        // 定义私有变量
        private int nCode;
        private String name;

        WaterQualityEnum(String name, int nCode){
            this.name = name;
            this.nCode = nCode;
        }

        public int getState() {
            return this.nCode;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum WaterType{
        RIVER,
        LAKE
    }

}


