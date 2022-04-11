package dev.study.devspringprj.mybatistest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mybatisController {

    @Autowired
    private BoardMapper boardMapper;
    
    @GetMapping("/board/list")
    public List<Board> getBoardList() {
        return boardMapper.selectList();
    }
    
}
