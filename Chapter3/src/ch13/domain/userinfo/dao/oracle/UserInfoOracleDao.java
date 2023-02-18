package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("INSERT INTO ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update INTO ORACLE DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserOnfi(UserInfo userInfo) {
        System.out.println("Delete FROM ORACLE DB userID = " + userInfo.getUserId());
    }
}
