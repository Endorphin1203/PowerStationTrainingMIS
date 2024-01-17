/*
 *WuShengYan 拥有本软件版权2023 并保留所有权利
 *Copyright 2023, TYUST.CS.SE.212003.
 *All rights reserved.
 */
package com.tyust.PowerStationTrainingMIS.web.Stuff;

import com.tyust.PowerStationTrainingMIS.pojo.Stuff;
import com.tyust.PowerStationTrainingMIS.service.Function3Service;
import com.tyust.PowerStationTrainingMIS.service.Impl.Function3ServiceImpl;
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
 * @date 2023/12/15
 */
@WebServlet("/selectStuff")
public class SelectStuffServlet extends HttpServlet {
    private Function3Service function3Service = new Function3ServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sNo = request.getParameter("s_no");
        String pMajor = request.getParameter("p_major");
        String sName = request.getParameter("s_name");
        List<Stuff> stuffs = function3Service.selectStuff(sNo, pMajor, sName);
        request.setAttribute("stuffList",stuffs);
        request.getRequestDispatcher("/part3Select.jsp").forward(request,response);
    }
}
