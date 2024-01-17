/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.web.Plan;

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
@WebServlet("/showPlan")
public class showPlan extends HttpServlet {
    private Function1Service function1Service = new Function1ServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pTime = request.getParameter("p_time");
        String pMajor = request.getParameter("p_major");
        String pName = request.getParameter("p_name");
        List<Plan> plans = function1Service.selectPlan(pTime, pMajor, pName);
       /* Long id = plans.get(0).getId();*/
        request.setAttribute("planList",plans);
        request.getRequestDispatcher("/part1Update.jsp").forward(request,response);
    }
}
