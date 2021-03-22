package com.javapointers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class KhoaHocController {
    @RequestMapping(value="/khoa-hoc", method = RequestMethod.GET)
    public String Index(){
        return "khoahoc";
    }

    @RequestMapping(value="/them-khoa-hoc", method = RequestMethod.POST)
    public String ThemKhoaHoc(@RequestParam(value = "tenKhoaHoc") String tenKhoaHoc, @RequestParam(value = "thoiGianBatDau") String thoiGianBatDau, @RequestParam(value = "thoiGianKetThuc") String thiGianKeThuc, @RequestParam(value = "diaDiem") String diaDiem, @RequestParam(value = "duToan") String duToan, HttpSession session, HttpServletResponse response, HttpServletRequest request){
        return "SUCCESSED";
    }


    @RequestMapping(value="/cap-nhat-khoa-hoc", method = RequestMethod.PUT)
    public String CapNhatKhoaHoc(@RequestParam(value = "maKhoaHoc") String maKhoaHoc,@RequestParam(value = "tenKhoaHoc") String tenKhoaHoc, @RequestParam(value = "thoiGianBatDau") String thoiGianBatDau, @RequestParam(value = "thoiGianKetThuc") String thiGianKeThuc, @RequestParam(value = "diaDiem") String diaDiem, @RequestParam(value = "duToan") String duToan, HttpSession session, HttpServletResponse response, HttpServletRequest request){
        return "SUCCESSED";
    }

    @RequestMapping(value="/xoa-khoa-hoc", method = RequestMethod.DELETE)
    public String CapNhatKhoaHoc(@RequestParam(value = "maKhoaHoc") String maKhoaHoc, HttpSession session, HttpServletResponse response, HttpServletRequest request){
        return "SUCCESSED";
    }
}
