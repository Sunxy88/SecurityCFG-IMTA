// https://github.com/julangeryi/WY-Web/tree/b9b5b24ef11fb89f60a88b4db4e1d47156496c34
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tgwy.entity.User;



@Controller
public class LoginController {

    @RequestMapping("login")
    public String main(User user, HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
        try {
            subject.login(token);
            Session session = subject.getSession();
            session.setAttribute("upLoadUser", user.getUserName());
            if (subject.hasRole("res")) {
                session.setAttribute("userRole", "res");
            } else if (subject.hasRole("mon")) {
                session.setAttribute("userRole", "mon");
            } else if (subject.hasRole("inf")) {
                session.setAttribute("userRole", "inf");

            } else if (subject.hasRole("rep")) {
                session.setAttribute("userRole", "rep");

            } else if (subject.hasRole("aux")) {
                session.setAttribute("userRole", "aux");

            } else if(subject.hasRole("admin")){
                session.setAttribute("userRole", "admin");
            } else{
                session.setAttribute("userRole", "norole");
            }
            return "jsp/main";
        } catch (Exception e) {
            System.out.println("Failed");
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "Wrong username or password");
            return "login";
        }
    }

    @RequestMapping("logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()){
            subject.logout();
        }
        return "login";
    }

}