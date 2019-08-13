import java.util.Scanner; //to import java.util.Scanner package
public class Railway_Reservation_Management_System //class declaration
{
    Scanner sc = new Scanner(System.in);
    int choice;
    String fs,ds,jd,rd,cl,tt,jt;
    char ch='N';
    String trt[]={"Superfast(SF)","Express(E)","Mail(M)"};
    String cla[]={"1AC","2AC","3AC","SL"};
    String st[]={"New Delhi (NDS)","Mumbai Central (BCT)","Bengaluru (BNC)","Kolkata (KOAA)","Ahmedabad (ADI)"}; //variable declaration
    void input() //input method
    {
        System.out.println("================================================================================================================"
            +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
            +"\n\n"+"\t\t\t\tTrains/Fare/Accomodation Availibility between Stations"+"\n"+"List of Available Stations :- \n"+"New Delhi (NDS)\nMumbai Central (BCT) \nBengaluru (BNC) \nKolkata (KOAA) \nAhmedabad (ADI)\n\nPlease Enter the Source/Boarding Station & Destination \nEg: Enter 'Mumbai Central' OR 'BCT' for Mumbai");
        while(ch=='N' || ch=='n')
        {
            System.out.print("From : ");
            fs=sc.nextLine();
            System.out.print("To : ");
            ds=sc.nextLine();
            System.out.print("Journey Date (DD/MM/YYYY) : ");
            jd=sc.nextLine();
            System.out.print("Class (1AC/2AC/3AC/SL) : ");
            cl=sc.nextLine();
            System.out.print("Train Type [Superfast(SF)/Express(E)/Mail(M)] : ");  
            tt=sc.nextLine();
            System.out.print("Enter 1 for One-Way Journey and 2 for Return Journey : ");
            jt=sc.nextLine();
            System.out.print("Are you sure? Enter 'Y' to proceed and 'N' to re-enter details\n");
            ch=sc.nextLine().charAt(0); //to store user's choice in variable ch
            if(ch=='N' || ch=='n')//re-displaying input screen if user wishes to re-enter details
            {
                System.out.print("\f");
                System.out.println("================================================================================================================"
                    +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
                    +"\n\n"+"\t\t\t\tTrains/Fare/Accomodation Availibility between Stations"+"\n"+"List of Available Stations :- \n"+"New Delhi (NDS)\nMumbai Central (BCT) \nBengaluru (BNC) \nKolkata (KOAA) \nAhmedabad (ADI)\n\nPlease Enter the Source/Boarding Station & Destination \nEg: Enter 'Mumbai Central' OR 'BCT' for Mumbai");
            }
            else //getting out of loop if user wishes to continue
                break;
        }

        //to convert the details entered by the user in capitals and full names  
        if(fs.equalsIgnoreCase("NDS")||fs.equalsIgnoreCase("New Delhi"))
            fs=st[0];
        if(fs.equalsIgnoreCase("BCT")||fs.equalsIgnoreCase("Mumbai Central"))
            fs=st[1];
        if(fs.equalsIgnoreCase("BNC")||fs.equalsIgnoreCase("Bengaluru"))
            fs=st[2];
        if(fs.equalsIgnoreCase("KOAA")||fs.equalsIgnoreCase("Kolkata"))
            fs=st[3];
        if(fs.equalsIgnoreCase("ADI")||fs.equalsIgnoreCase("Ahmedabad"))
            fs=st[4];

        if(ds.equalsIgnoreCase("NDS")||ds.equalsIgnoreCase("New Delhi"))
            ds=st[0];
        if(ds.equalsIgnoreCase("BCT")||ds.equalsIgnoreCase("Mumbai Central"))
            ds=st[1];
        if(ds.equalsIgnoreCase("BNC")||ds.equalsIgnoreCase("Bengaluru"))
            ds=st[2];
        if(ds.equalsIgnoreCase("KOAA")||ds.equalsIgnoreCase("Kolkata"))
            ds=st[3];
        if(ds.equalsIgnoreCase("ADI")||ds.equalsIgnoreCase("Ahmedabad"))
            ds=st[4];

        if(cl.equalsIgnoreCase("1AC"))
            cl=cla[0];
        if(cl.equalsIgnoreCase("2AC"))
            cl=cla[1];
        if(cl.equalsIgnoreCase("3AC"))
            cl=cla[2];
        if(cl.equalsIgnoreCase("SL"))
            cl=cla[3];

        if(tt.equalsIgnoreCase("sf"))
            tt=trt[0];
        if(tt.equalsIgnoreCase("e"))
            tt=trt[1];
        if(tt.equalsIgnoreCase("m"))
            tt=trt[2];

        if(jt.equals("1"))
            jt="One Way Journey";
        if(jt.equals("2"))
            jt="Return Journey";
    }

    void display()
    {
        System.out.print("\f");
        System.out.println("================================================================================================================"
            +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
            +"\n\n"+"\t\t\t\tTrains/Fare/Accomodation Availibility between Stations");
        System.out.println("You have entered the following details :"); //displaying a small ticket with the details entered earlier
        System.out.println("\nFrom : "+fs+"\nTo: "+ds+"\nJourney Date : "+jd+"\nClass : "+cl+"\nTrain Type : "+tt+"\nJourney Type :"+jt);
        System.out.print("Press Enter to Search for Trains");
        String s = sc.nextLine();
        System.out.print("Please Wait.");
        for(int i=1;i<3;i++)//loop to create a delay in displaying output
        {
            try //try and catch for tackling exception
            {
                Thread.sleep(1000); //thread.sleep function used to create a delay of 1000 miliseconds

            }
            catch(InterruptedException e) //to catch the exception and pass it to the Java Exception Handler
            {
                System.out.print("");
            }
            System.out.print(".");
        }
    }

    public static void main(String[]args) //main function
    {
        Railway_Reservation_Management_System obj = new Railway_Reservation_Management_System(); //object creation to call methods of class Railway_Reservation_Management_System
        obj.input();
        obj.display();
        obj.d();
        obj.inp();
        obj.avail();
        obj.fare();                           

    }
    String tname[]={"Punjab Mail","Golden Temple ML","Swaraj Exp","Dehradun Exp","Duronto Exp","Mumbai Rajdhani","Paschim Exp","Coimbatore Exp","Udyan Exp","Karnataka Exp","Hawrah Exp","Kolkata Rajdhani","Poorva Exp","Shatabdi Exp","Lok Shakti Exp","Saurashtra Mail"};
    String tno[]={"12138","12904","12472","19020","12263","12951","12217","11013","11301","12628","12810","12302","12304","12001","22927","22945"};
    String class_type[]={"3AC,SL", "1AC,2AC,3AC", "1AC,2AC,3AC,SL", "SL", "3AC,SL", "1AC,2AC,3AC", "2AC,3AC,SL", "2AC,3AC,SL", "1AC,2AC,3AC", "2AC,SL", "2AC,3AC,SL", "1AC,2AC,3AC", "3AC,SL", "1AC,2AC,3AC,SL", "1AC,2AC,3AC", "2AC,SL"};
    String ttype[]={"Mail(M)", "Mail(M)", "Express(E)", "Express(E)", "Express(E)", "Superfast(SF)", "Express(E)", "Express(E)", "Express(E)", "Express(E)", "Express(E)", "Superfast(SF)", "Express(E)", "Express(E)", "Express(E)", "Mail(M)"};
    String dtime[]={"05:15","07:20","21:50","00:05","22:20","17:00","10:40","07:40","20:30","22:00","19:40","16:30","08:15","14:40","21:20","23:00"};
    String atime[]={"16:15","18:40","11:30","22:20","09:20","08:35","19:40","06:20","18:50","20:00","14:50","07:40","20:30","21:20","06:50","10:40"};    
    int c=0; // variable declaration
    void d() //'d' function to display the list of trains available between the stations specified by user 
    {
        System.out.println("\f================================================================================================================"
            +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
            +"\n\n");
        System.out.println("\t\t\t\tTrains Between "+fs+" and "+ds);     

        //to display Train no, Train name, Train Type, Departure time, Arrival Time and the Classes offered by available trains 
        if(fs.equals("New Delhi (NDS)"))
        {
            if(cl.equals("3AC") || cl.equals("SL"))
            {
                if(tt.equals("Mail(M)"))
                {
                    System.out.println("\nTrain No. - "+tno[0]+"\n"+"Train Name - "+tname[0]+"\n"+"Train Type - "+ttype[0]+"\n"+"Departure Time - "+dtime[0]+"\n"+"Arrival Time - "+atime[0]+"\n"+"Class - "+class_type[0]);
                    c=1;
                }
            }

            if(cl.equals("1AC") || cl.equals("2AC") || cl.equals("3AC")) 
            {
                if(tt.equals("Mail(M)")&& jt.equals("One Way Journey"))
                {
                    System.out.println("\nTrain No. - "+tno[1]+"\n"+"Train Name - "+tname[1]+"\n"+"Train Type - "+ttype[1]+"\n"+"Departure Time - "+dtime[1]+"\n"+"Arrival Time - "+atime[1]+"\n"+"Class - "+class_type[1]);
                    c=1;
                }
            }

            if(cl.equals("1AC") || cl.equals("2AC") || cl.equals("3AC") || cl.equals("SL"))
            {
                if(tt.equals("Express(E)"))
                {
                    System.out.println("\nTrain No. - "+tno[2]+"\n"+"Train Name - "+tname[2]+"\n"+"Train Type - "+ttype[2]+"\n"+"Departure Time - "+dtime[2]+"\n"+"Arrival Time - "+atime[2]+"\n"+"Class - "+class_type[2]);
                    c=1;
                }
            }

            if(cl.equals("SL"))
            {
                if(tt.equals("Express(E)") && jt.equals("One Way Journey"))
                {
                    System.out.println("\nTrain No. - "+tno[3]+"\n"+"Train Name - "+tname[3]+"\n"+"Train Type - "+ttype[3]+"\n"+"Departure Time - "+dtime[3]+"\n"+"Arrival Time - "+atime[3]+"\n"+"Class - "+class_type[3]);
                    c=1;
                }
            }
        }

        if(fs.equals("Mumbai Central (BCT)"))
        {
            if(cl.equals("3AC") || cl.equals("SL"))
            {
                if(tt.equals("Express(E)") && jt.equals("One Way Journey"))
                {
                    System.out.println("\nTrain No. - "+tno[4]+"\n"+"Train Name - "+tname[4]+"\n"+"Train Type - "+ttype[4]+"\n"+"Departure Time - "+dtime[4]+"\n"+"Arrival Time - "+atime[4]+"\n"+"Class - "+class_type[4]);
                    c=1;
                }
            }

            if(cl.equals("1AC") || cl.equals("2AC") || cl.equals("3AC"))
            {
                if(tt.equals("Superfast(SF)"))
                {
                    System.out.println("\nTrain No. - "+tno[5]+"\n"+"Train Name - "+tname[5]+"\n"+"Train Type - "+ttype[5]+"\n"+"Departure Time - "+dtime[5]+"\n"+"Arrival Time - "+atime[5]+"\n"+"Class - "+class_type[5]);
                    c=1;
                }
            }

            if(cl.equals("2AC") || cl.equals("3AC") || cl.equals("SL"))
            {
                if(tt.equals("Express(E)"))
                {
                    System.out.println("\nTrain No. - "+tno[6]+"\n"+"Train Name - "+tname[6]+"\n"+"Train Type - "+ttype[6]+"\n"+"Departure Time - "+dtime[6]+"\n"+"Arrival Time - "+atime[6]+"\n"+"Class - "+class_type[6]);
                    c=1;
                }
            }
        }

        if(fs.equals("Bengaluru (BNC)"))
        {
            if(cl.equals("2AC") || cl.equals("3AC") || cl.equals("SL"))
            {
                if(tt.equals("Express(E)"))
                {
                    System.out.println("\nTrain No. - "+tno[7]+"\n"+"Train Name - "+tname[7]+"\n"+"Train Type - "+ttype[7]+"\n"+"Departure Time - "+dtime[7]+"\n"+"Arrival Time - "+atime[7]+"\n"+"Class - "+class_type[7]);
                    c=1;
                }
            }

            if(cl.equals("1AC") || cl.equals("2AC") || cl.equals("3AC"))
            {
                if(tt.equals("Express(E)") && jt.equals("One Way Journey"))
                {
                    System.out.println("\nTrain No. - "+tno[8]+"\n"+"Train Name - "+tname[8]+"\n"+"Train Type - "+ttype[8]+"\n"+"Departure Time - "+dtime[8]+"\n"+"Arrival Time - "+atime[8]+"\n"+"Class - "+class_type[8]);
                    c=1;
                }
            }

            if(cl.equals("2AC") || cl.equals("SL"))
            {
                if(tt.equals("Express(E)"))
                {
                    System.out.println("\nTrain No. - "+tno[9]+"\n"+"Train Name - "+tname[9]+"\n"+"Train Type - "+ttype[9]+"\n"+"Departure Time - "+dtime[9]+"\n"+"Arrival Time - "+atime[9]+"\n"+"Class - "+class_type[9]);
                    c=1;
                }
            }
        }

        if(fs.equals("Kolkata (KOAA)"))    
        {
            if(cl.equals("2AC") || cl.equals("3AC") || cl.equals("SL"))
            {
                if(tt.equals("Express(E)"))
                {
                    System.out.println("\nTrain No. - "+tno[10]+"\n"+"Train Name - "+tname[10]+"\n"+"Train Type - "+ttype[10]+"\n"+"Departure Time - "+dtime[10]+"\n"+"Arrival Time - "+atime[10]+"\n"+"Class - "+class_type[10]);
                    c=1;
                }
            }

            if(cl.equals("1AC") || cl.equals("2AC") || cl.equals("3AC"))
            {
                if(tt.equals("Superfast(SF)"))
                {
                    System.out.println("\nTrain No. - "+tno[11]+"\n"+"Train Name - "+tname[11]+"\n"+"Train Type - "+ttype[11]+"\n"+"Departure Time - "+dtime[11]+"\n"+"Arrival Time - "+atime[11]+"\n"+"Class - "+class_type[11]);
                    c=1;
                }
            }

            if(cl.equals("3AC") || cl.equals("SL"))
            {
                if(tt.equals("Express(E)") && jt.equals("One Way Journey"))
                {
                    System.out.println("\nTrain No. - "+tno[12]+"\n"+"Train Name - "+tname[12]+"\n"+"Train Type - "+ttype[12]+"\n"+"Departure Time - "+dtime[12]+"\n"+"Arrival Time - "+atime[12]+"\n"+"Class - "+class_type[12]);
                    c=1;
                }
            }
        }

        if(fs.equals("Ahmedabad (ADI)"))    
        {
            if(cl.equals("1AC") || cl.equals("2AC") || cl.equals("3AC") || cl.equals("SL") )
            {
                if(tt.equals("Express(E)"))
                {
                    System.out.println("\nTrain No. - "+tno[13]+"\n"+"Train Name - "+tname[13]+"\n"+"Train Type - "+ttype[13]+"\n"+"Departure Time - "+dtime[13]+"\n"+"Arrival Time - "+atime[13]+"\n"+"Class - "+class_type[13]);
                    c=1;
                }
            }

            if(cl.equals("1AC") || cl.equals("2AC") || cl.equals("3AC"))
            {
                if(tt.equals("Express(E)"))
                {
                    System.out.println("\nTrain No. - "+tno[14]+"\n"+"Train Name - "+tname[14]+"\n"+"Train Type - "+ttype[14]+"\n"+"Departure Time - "+dtime[14]+"\n"+"Arrival Time - "+atime[14]+"\n"+"Class - "+class_type[14]);
                    c=1;
                }
            }

            if(cl.equals("2AC") || cl.equals("SL") && tt.equals("Mail(M)"))
            {
                if(jt.equals("One Way Journey"))
                {
                    System.out.println("\nTrain No. - "+tno[12]+"\n"+"Train Name - "+tname[12]+"\n"+"Train Type - "+ttype[12]+"\n"+"Departure Time - "+dtime[12]+"\n"+"Arrival Time - "+atime[12]+"\n"+"Class - "+class_type[12]);
                    c=1;
                }
            }
        }

        if(c==0) //if no trains are found to display a sorry message and exit
        {
            System.out.println("SORRY !! No Trains Found !");
            System.exit(1); //to quit the program that is to reset java virtual machine 
        }
    }

    String trno;
    char cha='n';
    int f=0,i; //variable declaration
    void inp() //inp() function to input user's choice of train to travel
    {
        while(cha=='N' || cha=='n')
        {
            if(c==1)
            {
                System.out.print("\nEnter the train no. to check Availibility of seats : ");
                trno=sc.nextLine(); //to accept and store train number entered by user 
            }
            if(c==1)
            {

                for(i=0;i<15;i++) //for loop to check whether the train no entered exists or not
                {
                    if(trno.equals(tno[i])) 
                    {
                        f=1; //value of '1' assigned to f if exists
                        break;
                    }
                }
                if(f==0) //if wrong train number is enetered, to ask for re-entering
                    System.out.print("Wrong Train No. No such number exists. Kindly re-enter the train no");
                if(f==1) //to ask for user's confirmation
                {
                    System.out.print("You have entered "+trno+"  -  "+tname[i]+" Are you sure? Enter 'Y' to confirm or 'N' to re-enter no  ");
                    cha=sc.nextLine().charAt(0); //to store user's choice
                }
            }
        }

        System.out.print("Processing.");

        for(int j=1;j<3;j++) //loop to create a delay in displaying output
        {
            try //try and catch for tackling exception
            {
                Thread.sleep(1000); //thread.sleep function used to create a delay of 1000 miliseconds
            }
            catch(InterruptedException e)  //to catch the exception and pass it to the Java Exception Handler
            {
                System.out.print("");
            }
            System.out.print(".");
        }
    }

    String clas,status; //variable declaration
    void avail() //avail function to display the availibility of seats  
    {
        int w=(int)(Math.random()*3); //Math.random() function used to generate any random number between 0 to 2 

        //to store the status - availble,waiting or rac depending upon the no generated above     
        if(w==0)
            status="Available";
        if(w==1)
            status="Waiting";
        if(w==2)
            status="Reservation against Cancellation(RAC)";
        int n=(int)(Math.random()*100); //use of Math.random() to randomly generate any no of seats from 0 to 99
        System.out.println("\f================================================================================================================"
            +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
            +"\n\n");

        System.out.println("Current Status:"+"\n"+status+" "+n); //to display the status 
    }

    String input; //variable declaration
    void fare() //fare() function to display the fare of one ticket of the class specified by the user earlier in void input  
    {
        System.out.println("Press any key to check fares");
        String a=sc.nextLine();
        System.out.println("\tFare Enquiry");
        if(cl.equals("1AC"))
        {
            System.out.println("\nFare/Charges"+"\t\t1 AC");
            System.out.println("============================================\nBase Price"+"\t\tRs 4000"+"\nCatering Charges"+"\tRs. 350"+"\nService Tax"+"\t\tRs. 200"+"\n--------------------------------------------\nTotal Amount \t\tRs 4550");
        }

        if(cl.equals("2AC"))
        {
            System.out.println("\nFare/Charges"+"\t\t2 AC");
            System.out.println("============================================\nBase Price"+"\t\tRs 2250"+"\nCatering Charges"+"\tRs. 300"+"\nService Tax"+"\t\tRs. 115"+"\n--------------------------------------------\nTotal Amount \t\tRs 2665");
        }

        if(cl.equals("3AC"))
        {
            System.out.println("\nFare/Charges"+"\t\t3 AC");
            System.out.println("============================================\nBase Price"+"\t\tRs 1500"+"\nCatering Charges"+"\tRs. 250"+"\nService Tax"+"\t\tRs.  75"+"\n--------------------------------------------\nTotal Amount \t\tRs 1825");
        }

        if(cl.equals("SL"))
        {
            System.out.println("\nFare/Charges"+"\t\tSL");
            System.out.println("============================================\nBase Price"+"\t\tRs 500"+"\nCatering Charges"+"\tRs. --"+"\nService Tax"+"\t\tRs. --"+"\n--------------------------------------------\nTotal Amount \t\tRs 500");
        }

        System.out.println("To check all fares press 'A' or 'N' to proceed");
        input=sc.nextLine(); //to store user's choice
        if(input.equalsIgnoreCase("A")) //to display fares of all coaches
        {
            System.out.println("\nFare/Charges"+"\t\t1 AC\t\t2 AC\t\t3 AC\t\tSL");
            System.out.println("=========================================================================================\nBase Price"+"\t\tRs 4000\t\tRs 2250\t\tRs 1500\t\tRs 500"+"\nCatering Charges"+"\tRs. 350\t\tRs. 300\t\tRs. 300\t\t--"+"\nService Tax"+"\t\tRs. 200\t\tRs. 115\t\tRs. 75\t\t-- "+"\n-----------------------------------------------------------------------------------------\nTotal Amount \t\tRs 4550\t\tRs 2665\t\tRs 1825\t\tRs 500 ");
        }

        System.out.println("Press any key to start Booking Procedures....");
        String b = sc.nextLine();
        Payment obj1= new Payment(); //object creation of class Payment  
        obj1.pay(cl); //to pass the value of variable 'cl' (which stores user's choice of class) to pay() function of class Payment as it will be required later to calculate the fees to be paid
    }
}

class Booking //class declaration
{
    String pname[]=new String[50];
    String page[]=new String[50];
    char pgen[]=new char[50];
    char pbp[]=new char[50];
    String id[]=new String[50];
    String mob[]=new String[50];
    Scanner sc = new Scanner(System.in);
    int l,mark=1;
    char letter; //variable declaration
    int book() //book() method to accept details related to booking tickets 
    {
        char ct='M';
        int i=0,k=0;
        while(ct=='M' || ct=='m'||ct=='R'||ct=='r')
        {
            System.out.println("\f================================================================================================================"
                +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
                +"\n\n");
            System.out.println("\tPassenger Details");
            mark=1;
            System.out.println("\nPassenger No "+(i+1));
            System.out.print("Name - ");
            pname[i]=sc.nextLine();
            System.out.print("Age - ");
            page[i]=sc.nextLine();
            System.out.print("Gender (M/F) - ");
            pgen[i]=sc.nextLine().charAt(0);
            System.out.print("Berth Preference [Upper(U)/Middle(M)/Lower(L)] - ");
            pbp[i]=sc.nextLine().charAt(0);
            System.out.print("ID card No - ");
            id[i]=sc.nextLine();
            System.out.print("Mobile No - ");
            mob[i]=sc.nextLine();

            pname[i]=pname[i].toUpperCase();
            l=page[i].length();
            for(k=0;k<l;k++)//to verify whether the details entered are valid and in proper format
            {
                letter=page[i].charAt(k);
                if(Character.isDigit(letter)==false)
                    mark=0; //assigning the value of '0' to the flag variable mark to signify invalid details
            }
            if(pgen[i]=='m')
                pgen[i]='M';
            else if(pgen[i]=='f')
                pgen[i]='F';
            else if(pgen[i]=='M' || pgen[i]=='F' )
            {}
            else
                mark=0;  

            if(pbp[i]=='u')
                pbp[i]='U';
            else if(pbp[i]=='m')
                pbp[i]='M';
            else if(pbp[i]=='l')
                pbp[i]='L';
            else if(pbp[i]=='L' || pbp[i]=='M' || pbp[i]=='U')
            {}
            else
                mark=0;

            if(mark==0) 
            {
                System.out.println("Invalid Entry. Please re-enter valid details"); 
                ct='R';
            }

            if(mark==1) //if details entered are valid and in proper format to ask for entry of more details, wish to re-enter details and to proceed 
            {
                System.out.println("\nFor More Enteries press 'M' and to proceed press 'N'and to Re-enter details press 'R'");
                ct=sc.nextLine().charAt(0); //to store user's choice
                i++; //incrementing value of counter variable i to count the no of passengers travelling 
            }
            if(ct=='R'||ct=='r')
                i=0;

        }

        System.out.println("\f================================================================================================================"
            +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
            +"\n\n");
        System.out.println("\t\t\t\tPASSENGER DETAILS\nS.No\tName\t\t\tAge\tGender\tBerth Preference");
        for(int a=0;a<i;a++) //for loop to display the passenger details entered
        {
            System.out.println((a+1)+".\t"+pname[a]+"\t\t"+page[a]+"\t"+pgen[a]+"\t\t"+pbp[a]);
        }

        System.out.println("Press any key to proceed");
        String m=sc.nextLine();
        return i; //to return the no of persons travelling stored in 'i' to the caller function that is void pay() aof class Payment
    }

    void cap() //function to generate a random captcha
    {
        String s1="",s2;
        int flag=0; //flag variable to check whether the captcha entered is right or wrong 
        while(flag==0)
        {

            for(int j=1;j<=6;j++)
            {
                s1+=(char)((Math.random()*26)+65); //Math.random() function used to generate 6 random upper case letters and store it in string s1
            }
            System.out.println("Enter the following Captcha : "+s1);
            s2=sc.nextLine();
            if(s2.equals(s1)) //to check if the captcha enetered matches the one that is displayed/generated 
            {
                flag=1;
                break;
            }
            else
                flag=0;
            if(flag==0) 
                System.out.print("Wrong Captcha entered!! Please try again.");
            s1="";
        }

        System.out.println("To proceed towards PAYMENT press any key");
        String d=sc.nextLine();
    }
}

class Payment //class declaration
{
    Scanner sc = new Scanner(System.in);
    String cardno,nameb,expd,cvv,cardn,s1="",otp,or_otp="",point="S",in="0";
    int le,len,y=0,totamt,amt; //variable declaration
    void pay(String coach) // void pay() functon receives and stores the class preference in variable String coach and pay() method is used to do task related to payment
    {
        Booking obj2 = new Booking(); //object creation of class Booking 
        int noofp=obj2.book(); //to call book() function of class Booking and store the value returned in int noofp 
        obj2.cap(); 

        System.out.println("\f================================================================================================================"
            +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
            +"\n\n");

        //to store fare of coach in variable amt     
        if(coach.equals("1AC"))
            amt=4550;
        if(coach.equals("2AC"))
            amt=2665;
        if(coach.equals("3AC"))
            amt=1825;
        if(coach.equals("SL"))
            amt=500;

        totamt=amt*noofp; //to calculate the total amount to be paid    
        System.out.println("Your Total Amount = Rs "+totamt); //to display the total amount to be paid
        System.out.println("\t\t\t\tPAYMENT OPTIONS");
        System.out.println("1. Credit Card\n2. Debit Card\n3. Cash\nEnter your choice (1/2/3)");
        String choice=sc.nextLine();
        Payment obj3=new Payment(); //object creation of class Payment
        if(choice.equals("1") || choice.equals("2"))
        {
            while(in.equals("0") || in.equals("2")) //loop to accept details related to payment through credit/debit card
            {
                System.out.println("\f================================================================================================================"
                    +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
                    +"\n\n\t\t\t\tCREDIT CARD\n");
                System.out.println("Enter Card No [eg: 1234 5678 1234 5678]");
                cardno=sc.nextLine();
                System.out.println("Name of Bank issuing card [eg: HDFC Bank/SBI Bank]");
                nameb=sc.nextLine();
                System.out.println("Enter expiry date (MM/YY) [eg: for dec 2020, enter 12/20]");
                expd=sc.nextLine();
                System.out.println("Enter CVV No [i.e. The 3-digit No at the back of the card");
                cvv=sc.nextLine();
                System.out.println("Enter the Name on card");
                cardn=sc.nextLine();

                //to verify whether the details entered are valid and in proper format
                cardno+=' ';
                le=cardno.length();
                if(le!=20)
                    in="1"; //if length of cardno(with spaces) entered is not equal to 20, then to assign the value of '1' to flag variable 'in' which signifies invalid  
                else
                {
                    for(y=0;y<le;y++)
                    {

                        while(cardno.charAt(y)!=' ')//loop to confirm whether the cardno entered consists of only nos and spaces and there is a space after every 44
                        {
                            if(Character.isDigit(cardno.charAt(y))==false && Character.isWhitespace(cardno.charAt(y))==false)
                                in="1";
                            s1+=cardno.charAt(y);
                            y++;
                        }

                        len=s1.length();
                        if(len!=4) 
                            in="1";
                        s1="";
                    }
                }

                le=cvv.length();
                if(le!=3) //to check if the length of cvv no is 3 or not 
                    in="1";
                if(in.equals("1")) //if the details entered are invalid, to display appropriate message 
                {
                    System.out.println("Invalid Credentials. Please enter valid details");
                    in="2";
                }
                else
                    break;
            }

            while(point.equals("S")) 
            {
                System.out.println("\f================================================================================================================"
                    +"\n"+"\t\t\t\t\tWELCOME TO "+nameb+"\n"+"================================================================================================================"
                    +"\n\n");
                System.out.println("Name : "+cardn+"\nAmount to be paid = "+totamt);

                System.out.print("Your One Time Password (OTP) is [");
                for(int z=1;z<=4;z++) //loop to display OTP of 4 digits
                {
                    int p=(int)(Math.random()*10); //Math.random() function used to generate randomm no between 0 and 9 
                    String q=Integer.toString(p); //to convert no generated into string
                    or_otp+=q; //to store the digit and hence opt in the variable or_otp
                    System.out.print(p);
                }

                System.out.print("]\n");
                System.out.print("\n\n\nPlease Enter your OTP [Note: In order to resend OTP type 'S'] : ");
                otp=sc.nextLine(); //to store otp entered by user
                if(otp.equals(or_otp)) //if otp entered matches the otp generated then to redirect to indian railways page 
                {
                    point="N";
                    System.out.print("Redirecting to Indian Railways Please Wait.");
                    for(int j=1;j<3;j++)
                    {
                        try
                        {
                            Thread.sleep(1000);
                        }
                        catch(InterruptedException e)
                        {
                            System.out.print("");
                        }
                        System.out.print(".");
                    }
                }

                if(otp.equalsIgnoreCase("S"))
                {
                    point="S";
                    or_otp="";
                }
            }
            
            obj3.thanks();  //to call thanks() method using obj3 
        }
        if(choice.equals("3"))
            {
                obj3.thanks();  //to call thanks() method using obj3
            }

    }

    void thanks() //method to display acknowledgement/thank you page
    {
        System.out.println("\f================================================================================================================"
            +"\n"+"\t\t\t\t\tWELCOME TO THE INDIAN RAILWAYS"+"\n"+"================================================================================================================"
            +"\n\n\t\t\t\t\t THANK YOU FOR BOOKING\n");
        System.out.println("Your Railway Ticket has been successfully booked/reserved.\nThank you for choosing Indian Railways\nHope to see you again!!");
    }
}

