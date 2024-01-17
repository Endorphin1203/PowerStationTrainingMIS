/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.web.Plan;

import com.tyust.PowerStationTrainingMIS.service.Function1Service;
import com.tyust.PowerStationTrainingMIS.service.Impl.Function1ServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/13
 */
@WebServlet("/deletePlan")
public class DeletePlanServlet extends HttpServlet {
    private Function1Service function1Service = new Function1ServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String planId = request.getParameter("planId");
        function1Service.deletePlan(Long.valueOf(planId));
        response.sendRedirect(request.getContextPath() + "/loginSuccess.html");
    }
}
