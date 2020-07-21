// package com.xy.cr.shiro;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;


public class ShiroUtil {

    public static ShiroUtil create() {
        return new ShiroUtil();
    }

    public static Subject getShiroSubject() {
        Subject subject = null;
        try {
            subject = SecurityUtils.getSubject();
        }catch (Exception e) {

        }
        return subject;

    }

    public static ShiroUser getOnlineUser() {
        Subject subject = getShiroSubject();
        if(subject == null) {
            return new ShiroUser();
        }
        else {
            return (ShiroUser) getShiroSubject().getPrincipal();
        }
    }

    public static int getOnlineUserId() {
        ShiroUser user = getOnlineUser();
        return user == null ? null: user.getId();
    }

    public static String getOnlineUserIp() {
        return getShiroSubject().getSession().getHost();
    }

    public static String getOnlineUserDeptId() {
        return getOnlineUser().getDeptId();
    }

    public static boolean hasAnyRoles(String... roleCodes) {
        Subject subject = getShiroSubject();
        if (subject != null) {
            for (String role : roleCodes) {
                if (subject.hasRole(role.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasRole(String roleCode) {
        Subject subject = getShiroSubject();
        if (subject != null) {
            if (subject.hasRole(roleCode.trim())) {
                return true;
            }
        }
        return false;
    }
}