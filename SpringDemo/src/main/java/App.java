import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		// 绝对路径
		String XMLPath = "D:\\Workspace\\spring-framework-master\\SpringDemo\\src\\main\\webapp\\WEB-INF\\applicationContext.xml";
        // 相对路径
		String XMLPath2 = "/SpringDemo/src/main/webapp/WEB-INF/applicationContext.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(XMLPath2);
		ILogin login = (ILogin) applicationContext.getBean("loginService");
		String result = login.loginCheck("boy", "123");
		System.out.println("result="+result);
	}
}

