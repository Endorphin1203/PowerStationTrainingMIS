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
@WebServlet("/updateStuff")
public class UpdateStuffServlet extends HttpServlet {
    private Function3Service function3Service = new Function3ServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String suName = request.getParameter("su_name");
        String suNo = request.getParameter("su_no");
        String puMajor = request.getParameter("pu_major");
        List<Stuff> stuffs = function3Service.selectStuff(suNo, puMajor, suName);
        Long s_id = stuffs.get(0).getS_id();
        String suSex = request.getParameter("su_sex");
        char sex = suSex.charAt(0);
        String suBirth = request.getParameter("su_birth");
        Long puId = Long.valueOf(request.getParameter("pu_id"));
        String post = request.getParameter("su_post");
        function3Service.updateStuff(s_id,suName,suNo,sex,suBirth,puId,puMajor,post);
        response.sendRedirect(request.getContextPath() + "/successUpdateStuff.html");
    }
}
