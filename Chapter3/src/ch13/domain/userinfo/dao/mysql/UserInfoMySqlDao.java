package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert INTO MySQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update INTO MySQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserOnfi(UserInfo userInfo) {
        System.out.println("DELETE FROM MySQL DB userID = " + userInfo.getUserId());
    }
}
