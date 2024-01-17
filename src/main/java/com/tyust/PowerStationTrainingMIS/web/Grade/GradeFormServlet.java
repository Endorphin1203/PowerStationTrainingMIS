/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.web.Grade;

import com.tyust.PowerStationTrainingMIS.pojo.Grade;
import com.tyust.PowerStationTrainingMIS.service.Function2Service;
import com.tyust.PowerStationTrainingMIS.service.Impl.Function2ServletImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
@WebServlet("/gradeForm")
public class GradeFormServlet extends HttpServlet {
    private Function2Service function2Service = new Function2ServletImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long gradeId = Long.valueOf(request.getParameter("gradeId"));
        List<Grade> grades = function2Service.selectByGradeId(gradeId);
        System.out.println(grades);
        request.setAttribute("gradeList",grades);
        request.getRequestDispatcher("/part2Update.jsp").forward(request,response);
    }
}
