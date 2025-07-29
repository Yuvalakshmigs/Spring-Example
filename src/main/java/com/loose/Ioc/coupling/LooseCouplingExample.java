package com.loose.Ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoclooseCouplingExample.xml");

        //        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(databaseProvider);

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");

        System.out.println(userManagerWithDB.getUserInfo());

//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
//        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithWebServiceDatabase");

        System.out.println(userManagerWithWS.getUserInfo());

//        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
//        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);

        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");

        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
