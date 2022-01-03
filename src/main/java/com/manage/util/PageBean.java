package com.manage.util;

import lombok.Data;

import java.util.List;

/**
 * @Author suYan
 * @Date 2022/1/2 21:36
 */

public class PageBean<T> {
    //第几页
    private Integer pageNum;

    // 每页条数
    private Integer pageSize;

    private List<T> datas;

    // 总共几页
    private Integer totalNum;

    // 总的条数
    private Integer totalSize;

    public PageBean(Integer pageNum, Integer pageSize) {
        if(pageNum <= 0){
            this.pageNum = 1;
        }else{
            this.pageNum = pageNum ;
        }
        if(pageSize <= 0){
            this.pageSize = 10;
        }else{
            this.pageSize = pageSize;
        }
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalNum = (totalSize%pageSize==0)?(totalSize/pageSize):(totalSize/pageSize+1);
        this.totalSize = totalSize;
    }


    // 开始索引
    public Integer getStartIndex(){
        return (this.pageNum-1)*this.pageSize;
    }


    @Override
    public String toString() {
        return "PageBean{" +
                "pageno=" + pageNum +
                ", pagesize=" + pageSize +
                ", datas=" + datas +
                ", totalno=" + totalNum +
                ", totalsize=" + totalSize +
                '}';
    }
}
