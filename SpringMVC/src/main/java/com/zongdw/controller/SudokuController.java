/**
 * 
 */
package com.zongdw.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zongdw.entity.SudokuEntity;

/**
 * @author david.zong
 *
 */
@Controller
public class SudokuController {
	@RequestMapping("/sudoku")
	public String Sudoku(){
		return "sudoku";
	}
	@RequestMapping("/sudokuCal")
	public String SudokuCal(HttpServletRequest request){
//		System.out.println(entity.getA1());
//		System.out.println(entity.getA2());
//		model.addAttribute("entity",entity);
//		return "sudokuResult";
		System.out.println(request.getParameter("list"));
		return null;
	}
}
