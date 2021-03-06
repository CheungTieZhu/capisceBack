package com.capisceBack.dao;
import com.capisceBack.model.OtherUser;
import com.capisceBack.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserDao {
    User userLogin(@Param("userName")String userName,@Param("password")String password);
    void updateLoginTime(@Param("userMap")HashMap userMap);
    void userRegister(@Param("userMap")HashMap userMap);
    void userLogOut(@Param("userMap")HashMap userMap);
    User getUserInfo(@Param("userName")String userName,@Param("userToken")String userToken);
    List<OtherUser> getOtherUserInfo(@Param("data")Map<String, Object> data);
    void userHeadImgEdit(@Param("userName")String userName,@Param("headImgUrl")String headImgUrl);
    void notificationUserHeadImgEdit(@Param("userName")String userName,@Param("headImgUrl")String headImgUrl);
    List<String> getUserCompany(@Param("userName")String userName);
    void synchronizedCompanyTable(@Param("company")String company,@Param("userName")String userName,@Param("headImgUrl")String headImgUrl);
    void editUserRealName(@Param("userName")String userName,@Param("realName")String realName);
    void synchronizedCompanyTableRealName(@Param("company")String company,@Param("userName")String userName,@Param("realName")String realName);
    void editOrginalTable(@Param("userName")String userName,@Param("realName")String realName);
}
