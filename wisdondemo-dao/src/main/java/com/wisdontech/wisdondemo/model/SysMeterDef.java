package com.wisdontech.wisdondemo.model;

public class SysMeterDef extends SysMeterDefKey {
    private String meterType;

    private String meterBand;

    private Short meterFlag;

    private Integer screenCount;

    private Integer screenGap;

    private Long maxValue;

    private Integer measureId;

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType == null ? null : meterType.trim();
    }

    public String getMeterBand() {
        return meterBand;
    }

    public void setMeterBand(String meterBand) {
        this.meterBand = meterBand == null ? null : meterBand.trim();
    }

    public Short getMeterFlag() {
        return meterFlag;
    }

    public void setMeterFlag(Short meterFlag) {
        this.meterFlag = meterFlag;
    }

    public Integer getScreenCount() {
        return screenCount;
    }

    public void setScreenCount(Integer screenCount) {
        this.screenCount = screenCount;
    }

    public Integer getScreenGap() {
        return screenGap;
    }

    public void setScreenGap(Integer screenGap) {
        this.screenGap = screenGap;
    }

    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }
}