package dev.study.devspringprj.mybatistest;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    List<Board> selectList();
}
