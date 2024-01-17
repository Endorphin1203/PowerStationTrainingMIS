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
@WebServlet("/addStuff")
public class AddStuffServlet extends HttpServlet {
    private Function3Service function3Service = new Function3ServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sName = request.getParameter("s_name");
        String sNo = request.getParameter("s_no");
        String sSex = request.getParameter("s_sex");
        char sex = sSex.charAt(0);
        String sBirth = request.getParameter("s_birth");
        Long pId = Long.valueOf(request.getParameter("p_id"));
        String pMajor = request.getParameter("p_major");
        String post = request.getParameter("post");
        function3Service.insertStuff(sName,sNo,sex,sBirth,pId,pMajor,post);
        response.sendRedirect(request.getContextPath() + "/successAddStuff.html");
    }
}
