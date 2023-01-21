package dev.study.devspringprj.mybatistest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Board {
    String idx;
    String parentIdx;
    String title;
    String contents;
    String hitCnt;
    String delGb;
    String creaDtm;
    String creaId;
}
