package dev.study.devspringprj.mybatistest;

import lombok.Data;

@Data
public class Board {
    String idx;
    String parentIdx;
    String title;
    String contents;
    String hitCnt;
    String delGb;
    String creaDtm;
    String creaId;

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getParentIdx() {
        return parentIdx;
    }

    public void setParentIdx(String parentIdx) {
        this.parentIdx = parentIdx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getHitCnt() {
        return hitCnt;
    }

    public void setHitCnt(String hitCnt) {
        this.hitCnt = hitCnt;
    }

    public String getDelGb() {
        return delGb;
    }

    public void setDelGb(String delGb) {
        this.delGb = delGb;
    }

    public String getCreaDtm() {
        return creaDtm;
    }

    public void setCreaDtm(String creaDtm) {
        this.creaDtm = creaDtm;
    }

    public String getCreaId() {
        return creaId;
    }

    public void setCreaId(String creaId) {
        this.creaId = creaId;
    }
}
