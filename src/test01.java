import java.util.Scanner;
public class test01
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String account;
        String password;
        do {
            System.out.println("请输入账号和密码，中间用空格间隔:");
            account=input.next();
            password=input.next();
            if(!(account.equals("admin"))) {
                System.out.println("账号输入错误！请重新输入账号和密码");
            }else if(!(password.equals("admin"))) {
                System.out.println("密码输入错误！请重新输入账号和密码");
            }
        }while(!(account.equals("admin")&&password.equals("admin")));
        System.out.println("成功登陆！！！");
    }
}
