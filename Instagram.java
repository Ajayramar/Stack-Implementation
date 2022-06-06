package com.zoho;

import java.util.Scanner;
import java.util.Stack;

public class Instagram
{
    static Stack userList=new Stack();

    static Scanner input=new Scanner(System.in);

    protected void register()
    {
        input.nextLine();
        System.out.print("Enter User Name: ");

        String userName=input.nextLine();

        System.out.print("Enter password: ");

        String password=input.nextLine();

        userList.push(new User(userName,password));

        System.out.println();
    }

    protected void getRecentRegisterUser()
    {
        System.out.println("Recent Registered User :"+userList.pop());
        System.out.println();
    }
}
