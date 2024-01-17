/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.web.Stuff;

import com.tyust.PowerStationTrainingMIS.service.Function3Service;
import com.tyust.PowerStationTrainingMIS.service.Impl.Function3ServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author wushengyan
 * @version 1.0
 * @date 2023/12/15
 */
@WebServlet("/deleteStuff")
public class DeleteStuffServlet extends HttpServlet {
    private Function3Service function3Service = new Function3ServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long stuffId = Long.valueOf(request.getParameter("stuffId"));
        function3Service.deleteStuff(stuffId);
        response.sendRedirect(request.getContextPath() + "/loginSuccess.html");
    }
}
