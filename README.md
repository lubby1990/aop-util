# aop-util
a construct to help you uing aop

how to use . example :
public class Test {
    public static void main(String[] args) {
        //your service
        ILogin login = new Login();
        //your advice which you wang to do before or after method execute.
        IAdvice advice = new MyAdvice();
        //get a proxy Instance 
        ILogin proxy = DynamicProxy.newProxyInstance(login, advice);
        //using proxy and it works.
        proxy.login();
    }
}
