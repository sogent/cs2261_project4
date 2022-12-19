package edu.umsl;
import java.util.*;


public class newGame
{
    static int S;
    static int head,tail;

    public static void main(String agrs[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int movechoice;

            System.out.println("*************Let us start the Game called Hydra Vs Knight PyPy*******************\n\n");
            System.out.println("The only way to kill Hydra is to cut off all H heads and all T tails.");

            System.out.println("Please Read Below Rules");


            System.out.println("Your Moves Are");
            System.out.println("***************************");
            System.out.println("First move ,you can cut off exactly one of Hydra’s heads.\n"+
                    "Second move, you can cut off exactly one of Hydra’s tails.\n"+
                    "Third move, you can cut off exactly two of Hydra’s heads.\n"+
                    "Fourth move, you can cut off exactly two of Hydra’s tails.");
            System.out.println("***************************");
            System.out.println("Be Remember , you cannot use above moves when there are not enough heads or tails");



            System.out.println("\n\nIf you cuts off exactly one head, a new head grows immediately.");
            System.out.println("If you cuts off exactly one tail, two new tails grow immediately.");
            System.out.println("If you cuts off exactly two tails, a new head grows immediately.");
            System.out.println("If you cuts off exactly two heads, nothing happens.\n\n");


            //Prompt for how many heads and how many tails to start the Hydra.
            System.out.print("Choose how Many Heads to start the Hydra : ");
            head=sc.nextInt();
            System.out.print("Choose how Many Tails to start the Hydra : ");
            tail=sc.nextInt();


            while(head>0 || tail>0)
            {

                System.out.println("Press 1: First move ,you can cut off exactly one of Hydra’s heads.\n"+
                        "Press 2: Second move, you can cut off exactly one of Hydra’s tails.\n"+
                        "Press 3: Third move, you can cut off exactly two of Hydra’s heads.\n"+
                        "Press 4: Fourth move, you can cut off exactly two of Hydra’s tails.\n"+
                        "Press 5: For Quit !!");

                System.out.print("\nChoose Move :");

                movechoice=sc.nextInt();

                if(movechoice>0 && movechoice<6)
                {

                    if(movechoice==5)
                    {S=-1;
                        break;
                    }
                    else if(movechoice==1)
                    {
                        if(head>0)
                        {
                            S++;
                        }
                        else
                        {
                            System.out.println("Cannot perfomed this move , No Hydra head left!");
                        }

                    }
                    else if(movechoice==2)
                    {
                        if(tail>0)
                        {
                            S++;
                            tail++;
                        }
                        else
                        {
                            System.out.println("Cannot perfomed this move , No Hydra tail left!");
                        }

                    }
                    else if(movechoice==3)
                    {
                        if(head>=2)
                        {
                            S++;
                            head=head-2;
                        }
                        else
                        {
                            System.out.println("Cannot perfomed this move !!");
                        }

                    }

                    else
                    {
                        if(tail>1)
                        {
                            S++;
                            tail=tail-2;
                            head++;
                        }
                        else
                        {
                            System.out.println("Cannot perfomed this move , No Hydra head left!");
                        }

                    }

                }
                else
                {
                    System.out.println("Invalid Moves");
                }
                System.out.println("\n****************\nHydra Head="+head+" Tail="+tail+" Remains\n****************\n");

            }

            if(S==-1)
                System.out.println("If it is impossible to kill Hydra!!");
            else
            {
                System.out.println("You killed hydra in "+S+" moves");
            }

        }
        catch(Exception e)
        {
            System.out.println("Error is "+e);
        }
    }
}