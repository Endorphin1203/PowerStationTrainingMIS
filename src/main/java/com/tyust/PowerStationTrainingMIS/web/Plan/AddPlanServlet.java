/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.web.Plan;

import com.tyust.PowerStationTrainingMIS.Exception.FailAddException;
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
 * @date 2023/12/10
 */
@WebServlet("/addPlan")
public class AddPlanServlet extends HttpServlet {
    private Function1Service function1Service = new Function1ServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pName = request.getParameter("p_name");
        String pTime = request.getParameter("p_time");
        String pMajor = request.getParameter("p_major");
        String pAim = request.getParameter("p_aim");
        String pContain = request.getParameter("p_contain");
        int pPeriod = Integer.parseInt(request.getParameter("p_period"));
        String pTeacher = request.getParameter("p_teacher");
        try {
            function1Service.insertPlan(pName,pTime,pMajor,pAim,pContain,pPeriod,pTeacher);
        } catch (FailAddException e) {
            response.sendRedirect(request.getContextPath() + "/errorAdd.html");
        }
        response.sendRedirect(request.getContextPath() + "/successAddPlan.html");
    }
}
