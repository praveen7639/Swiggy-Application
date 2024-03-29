import java.util.Scanner;
class Swiggy  
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		boolean did_sign_up_done=false;
		long db_contact=0,db_pwd=0,db_age=0;
		//false means no,true means yes
		System.out.println("\t\t\tWelcome Swiggy");
		System.out.println("1.Signup\n2.login");
		int select=sc.nextInt();//1 or 2
		switch (select)
		{
		case 1:{//signup
		System.out.println("\t\t\tenter the contact");
		db_contact=sc.nextLong();
		System.out.println("\t\t\tenter the password");
		db_pwd=sc.nextLong();
		System.out.println("\t\t\tenter the age");
		db_age=sc.nextLong();
		did_sign_up_done=true;//After taking all the db inputs we can say signup success
		if (did_sign_up_done)
		{
		System.out.println("\t\t\tpls do login");
        System.out.println("\t\t\tEnter the Contact");
        long entered_contact=sc.nextLong();
		System.out.println("\t\t\tEnter the password");
        long entered_password=sc.nextLong();
		if (entered_contact==db_contact && entered_password==db_pwd)
		{
		System.out.println("\t\t\tlogin success");
		System.out.println("Select the hotel");
		System.out.println("1.bhuhari\n2.a2b");
		int click=sc.nextInt();
		switch (click)
		{
		case 1:{
		 System.out.println("\t\t\twelcome to bhuhari");
		 System.out.println("select the dish");
		 System.out.println("1.mutton biriyani\n2.chicken biriyani");
		 int dish=sc.nextInt();
		 switch (dish)
		 {
		 case 1:{
		System.out.println("select the quantity");
		int quantity=sc.nextInt();
		double per_plate=320;
		double total_bill=quantity*per_plate;
		System.out.println("Select the payment mode");
		System.out.println("1.google_pay\n2.phone_pay");
		int pay=sc.nextInt();
		if (pay==1)
		{
		System.out.println("enter the bill:" + total_bill);
		double entered_bill=sc.nextDouble();
		if (entered_bill==total_bill)
	    {
        int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println("\t\t\tEnter the otp");
		Thread.sleep(3000);
		System.out.println(sys_otp);
		int entered_otp=sc.nextInt();
		if (sys_otp==entered_otp)
		{
		System.out.println("processing........");
		Thread.sleep(3000);
		System.out.println("\t\t\torder recived succesfully.....");
		}else{
		System.out.println("\t\t\torder failded.....");
		}
		}
		}
		if (pay==2)
			{
		System.out.println("enter the bill:" + total_bill);
		double entered_bill=sc.nextDouble();
		if (entered_bill==total_bill)
	    {
        int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println("\t\t\tEnter the otp");
		Thread.sleep(3000);
		System.out.println(sys_otp);
		int entered_otp=sc.nextInt();
		if (sys_otp==entered_otp)
		{
		System.out.println("processing........");
		Thread.sleep(3000);
		System.out.println("\t\t\torder recived succesfully.....");
		}else{
		System.out.println("\t\t\torder failded.....");
		}
		}
			}
		break;
		}

        case 2:{
		System.out.println("select the quantity");
		int quantity=sc.nextInt();
		double per_plate=220;
		double total_bill=quantity*per_plate;
		System.out.println("Select the payment mode");
		System.out.println("1.google_pay\n2.phone_pay");
		int pay=sc.nextInt();
		if (pay==1)
		{
		System.out.println("enter the bill:" + total_bill);
		double entered_bill=sc.nextDouble();
		if (entered_bill==total_bill)
	    {
        int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println("\t\t\tEnter the otp");
		Thread.sleep(3000);
		System.out.println(sys_otp);
		int entered_otp=sc.nextInt();
		if (sys_otp==entered_otp)
		{
		System.out.println("processing........");
		Thread.sleep(3000);
		System.out.println("\t\t\torder recived succesfully.....");
		}else{
		System.out.println("\t\t\torder failded.....");
		}
		}
		}
		if (pay==2)
			{
		System.out.println("enter the bill:" + total_bill);
		double entered_bill=sc.nextDouble();
		if (entered_bill==total_bill)
	    {
        int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println("\t\t\tEnter the otp");
		Thread.sleep(3000);
		System.out.println(sys_otp);
		int entered_otp=sc.nextInt();
		if (sys_otp==entered_otp)
		{
		System.out.println("processing........");
		Thread.sleep(3000);
		System.out.println("\t\t\torder recived succesfully.....");
		}else{
		System.out.println("\t\t\torder failded.....");
		}
		}
		}
		break;
		  }
	     }
	    }
		

		case 2:{
		 System.out.println("\t\t\twelcome to A2B");
		 System.out.println("select the dish");
		 System.out.println("1.idly_vada\n2.Dosa");
		 int dish=sc.nextInt();
		 switch (dish)
		 {
		 case 1:{
		System.out.println("select the quantity");
		int quantity=sc.nextInt();
		double per_plate=70;
		double total_bill=quantity*per_plate;
		System.out.println("Select the payment mode");
		System.out.println("1.google_pay\n2.phone_pay");
		int pay=sc.nextInt();
		if (pay==1)
		{
		System.out.println("enter the bill:" + total_bill);
		double entered_bill=sc.nextDouble();
		if (entered_bill==total_bill)
	    {
        int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println("\t\t\tEnter the otp");
		Thread.sleep(3000);
		System.out.println(sys_otp);
		int entered_otp=sc.nextInt();
		if (sys_otp==entered_otp)
		{
		System.out.println("processing........");
		Thread.sleep(3000);
		System.out.println("\t\t\torder recived succesfully.....");
		}else{
		System.out.println("\t\t\torder failded.....");
		}
		}
		}
		if (pay==2)
			{
		System.out.println("enter the bill:" + total_bill);
		double entered_bill=sc.nextDouble();
		if (entered_bill==total_bill)
	    {
        int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println("\t\t\tEnter the otp");
		Thread.sleep(3000);
		System.out.println(sys_otp);
		int entered_otp=sc.nextInt();
		if (sys_otp==entered_otp)
		{
		System.out.println("processing........");
		Thread.sleep(3000);
		System.out.println("\t\t\torder recived succesfully.....");
		}else{
		System.out.println("\t\t\torder failded.....");
		}
		}
			}
		break;
		}

        case 2:{
		System.out.println("select the quantity");
		int quantity=sc.nextInt();
		double per_plate=120;
		double total_bill=quantity*per_plate;
		System.out.println("Select the payment mode");
		System.out.println("1.google_pay\n2.phone_pay");
		int pay=sc.nextInt();
		if (pay==1)
		{
		System.out.println("enter the bill:" + total_bill);
		double entered_bill=sc.nextDouble();
		if (entered_bill==total_bill)
	    {
        int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println("\t\t\tEnter the otp");
		Thread.sleep(3000);
		System.out.println(sys_otp);
		int entered_otp=sc.nextInt();
		if (sys_otp==entered_otp)
		{
		System.out.println("processing........");
		Thread.sleep(3000);
		System.out.println("\t\t\torder recived succesfully.....");
		}else{
		System.out.println("\t\t\torder failded.....");
		}
		}
		}
		if (pay==2)
			{
		System.out.println("enter the bill:" + total_bill);
		double entered_bill=sc.nextDouble();
		if (entered_bill==total_bill)
	    {
        int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println("\t\t\tEnter the otp");
		Thread.sleep(3000);
		System.out.println(sys_otp);
		int entered_otp=sc.nextInt();
		if (sys_otp==entered_otp)
		{
		System.out.println("processing........");
		Thread.sleep(3000);
		System.out.println("\t\t\torder recived succesfully.....");
		}else{
		System.out.println("\t\t\torder failded.....");
		}
		}
		}
		break;
		  }
	     }
	    }
       }
      }
     }
    }
   }
  }
 }
