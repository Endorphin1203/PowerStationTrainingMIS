/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.web.Plan;

import com.tyust.PowerStationTrainingMIS.Exception.FailAddException;
import com.tyust.PowerStationTrainingMIS.Exception.FailUpdateException;
import com.tyust.PowerStationTrainingMIS.pojo.Plan;
import com.tyust.PowerStationTrainingMIS.service.Function1Service;
import com.tyust.PowerStationTrainingMIS.service.Impl.Function1ServiceImpl;
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
 * @date 2023/12/13
 */
@WebServlet({"/updatePlan"})
public class UpdatePlanServlet extends HttpServlet {
    private Function1Service function1Service = new Function1ServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String pTime = request.getParameter("p_time");
        String pMajor = request.getParameter("p_major");
        String pName = request.getParameter("p_name");


        */
        String puName = request.getParameter("pu_name");
        String puTime = request.getParameter("pu_time");
        String puMajor = request.getParameter("pu_major");
        List<Plan> plans = function1Service.selectPlan(puTime, puMajor, puName);
        Long id = plans.get(0).getId();
        String puAim = request.getParameter("pu_aim");
        String puContain = request.getParameter("pu_contain");
        int puPeriod = Integer.parseInt(request.getParameter("pu_period"));
        String puTeacher = request.getParameter("pu_teacher");

        try {
            function1Service.updatePlan(id,puName,puTime,puMajor,puAim,puContain,puPeriod,puTeacher);
        } catch (FailUpdateException e) {
            response.sendRedirect(request.getContextPath() + "/errorUpdate.html");
        }
        response.sendRedirect(request.getContextPath() + "/successUpdatePlan.html");
    }
}
