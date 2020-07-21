// https://github.com/1781285851/SSMshiro/tree/264c2f5ffe19d181a492e7f98e7e2990536dd532
import org.apache.shiro.SecurityUtils;

public class UserUtils {
    public static String getUserRoleId(){
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("T1")){
            return "1";
        }else if (subject.hasRole("T2")){
            return "2";
        }
        return null;
    }

    public static boolean isAgentUser(){
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        return subject.hasRole("1");
    }

    public static boolean isChannelUser(){
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        return subject.hasRole("2");
    }

    public static boolean isAfterSale(){
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        return subject.hasRole("4");
    }

    public static boolean isFinance(){
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        return subject.hasRole("5") || subject.hasRole("6");
    }


    public static  Boolean  checkUserPermission(){
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("superadmin") || subject.hasRole("0")){
            return true;
        }
        return false;
    }

    public static  Boolean  checkUserPermissionByParams(String params){
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole(params)){
            return true;
        }
        return false;
    }
}
