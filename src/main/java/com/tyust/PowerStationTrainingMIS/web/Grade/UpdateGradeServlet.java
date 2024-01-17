/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.web.Grade;

import com.tyust.PowerStationTrainingMIS.service.Function2Service;
import com.tyust.PowerStationTrainingMIS.service.Impl.Function2ServletImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/14
 */
@WebServlet("/updateGrade")
public class UpdateGradeServlet extends HttpServlet {
    private Function2Service function2Service = new Function2ServletImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long gId = Long.valueOf(request.getParameter("gu_id"));
        String sName = request.getParameter("gu_name");
        String pMajor = request.getParameter("gu_major");
        int attendGrade = Integer.parseInt(request.getParameter("gu_attendGrade"));
        int testGrade = Integer.parseInt(request.getParameter("gu_testGrade"));
        function2Service.updateGrade(gId,sName,pMajor,attendGrade,testGrade);
        response.sendRedirect(request.getContextPath() + "/successUpdateGrade.html");
    }
}
