package com.zoho;

public class AccessInstagram extends Instagram
{
    void access()
    {
        AccessInstagram accessInstagram=new AccessInstagram();

        boolean stopProgress=true;

        while(stopProgress)
        {
            option();
            int key=input.nextInt();

            switch(key){
                case 1:
                    accessInstagram.register();
                    break;
                case 2:
                    accessInstagram.getRecentRegisterUser();
                    break;
                case 3:
                    stopProgress=false;
                    break;
            }
        }
    }

    void option(){
        System.out.println("1.Register ");
        System.out.println("2.Get Recent User ");
        System.out.println("3.Exit ");
    }
}
