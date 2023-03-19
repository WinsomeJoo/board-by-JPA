package com.study.board.controller;


import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")     // localhost:8080/board/write <-- 어떤 url로 접근할것인지 지정하는 어노테이션
    public String boarWriteForm(){
        return "boardwrite";      //return 어떤 뷰파일(html 파일로 보내 줄것인가)
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){

        boardService.write(board);
        return "";
    }


}
