package com.example.demo.model;

public class CodeVo {
    private Integer code;
    private String name;
    private Integer parentcode;
    private String remark;
    private Integer status;
    private Integer rowindex;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentcode() {
        return parentcode;
    }

    public void setParentcode(Integer parentcode) {
        this.parentcode = parentcode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRowindex() {
        return rowindex;
    }

    public void setRowindex(Integer rowindex) {
        this.rowindex = rowindex;
    }
}
