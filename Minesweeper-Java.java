import java.util.Random;
import java.util.Scanner;

class MyClass
{
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public boolean game;
    public String[][] Board = new String[10][10];
    public String[][] Cells = new String[10][10];

    public MyClass()
    {

        for(int a=0;a<10;a++)
        {
            for(int b = 0; b < 10; b++)
            {
                Cells[a][b] = "-";
                Board[a][b] = " ";
            }
        }
        game = true;
    }

    public void New()
    {
        for (int a = 0; a < 10; a++)
        {
            for (int b = 0; b < 10; b++)
            {
                Cells[a][b] = "-";
                Board[a][b] = " ";
            }
        }
    }
    public void Terminate(int c, int d)
    {


        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_WHITE+"\f");

        System.out.println("  a b c d e f g h i j");

        for(int a = 0; a < 10; a++)
        {
            for(int b = 0; b < 10; b++)
            {
                if(b==0)
                {
                    System.out.print(a+" ");
                }
                if(a==d&&b==c)
                {
                    System.out.print(ANSI_RED_BACKGROUND+ANSI_BLACK+Board[b][a]+" ");
                }
                else if (Board[b][a].equals(Cells[b][a]))
                {

                    System.out.print(ANSI_YELLOW_BACKGROUND+ANSI_BLACK+Board[b][a]+" ");
                }
                else {
                    if (Board[b][a].equals(Cells[b][a]))
                    {

                        System.out.print(ANSI_WHITE_BACKGROUND+ANSI_BLACK+Board[b][a]+" ");
                    }
                    else
                    {
                        if(Board[b][a].equals("M")) {

                            System.out.print(ANSI_BLACK_BACKGROUND + ANSI_WHITE + Board[b][a] + " ");
                        }
                        else{
                            System.out.print(ANSI_BLACK_BACKGROUND + ANSI_WHITE + Cells[b][a] + " ");
                        }
                    }
                }

            }
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_WHITE);
        }
        game = false;
    }

    public void TakeInput()
    {
        System.out.println("Choose Box(e.g. b5): ");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int a=0;a<10;a++)
        {
            if (input.equalsIgnoreCase("a" + Integer.toString(a)))
            {
                Cells[0][a] = Board[0][a];
                if (Board[0][a].equals("M"))
                {

                    Terminate(0,a);

                }
            }
            if (input.equalsIgnoreCase("b" + Integer.toString(a)))
            {
                Cells[1][a] = Board[1][a];
                if (Board[1][a].equals("M"))
                {

                    Terminate(1,a);
                }
            }
            if (input.equalsIgnoreCase("c" + Integer.toString(a)))
            {
                Cells[2][a] = Board[2][a];
                if (Board[2][a].equals("M"))
                {

                    Terminate(2,a);
                }
            }
            if (input.equalsIgnoreCase("d" + Integer.toString(a)))
            {
                Cells[3][a] = Board[3][a];
                if (Board[3][a].equals("M"))
                {

                    Terminate(3,a);
                }
            }
            if (input.equalsIgnoreCase("e" + Integer.toString(a)))
            {
                Cells[4][a] = Board[4][a];
                if (Board[4][a].equals("M"))
                {

                    Terminate(4,a);
                }
            }
            if (input.equalsIgnoreCase("f" + Integer.toString(a)))
            {
                Cells[5][a] = Board[5][a];
                if (Board[5][a].equals("M"))
                {

                    Terminate(5,a);
                }
            }
            if (input.equalsIgnoreCase("g" + Integer.toString(a)))
            {
                Cells[6][a] = Board[6][a];
                if (Board[6][a].equals("M"))
                {

                    Terminate(6,a);
                }
            }
            if (input.equalsIgnoreCase("h" + Integer.toString(a)))
            {
                Cells[7][a] = Board[7][a];
                if (Board[7][a].equals("M"))
                {

                    Terminate(7,a);
                }
            }
            if (input.equalsIgnoreCase("i" + Integer.toString(a)))
            {
                Cells[8][a] = Board[8][a];
                if (Board[8][a].equals("M"))
                {

                    Terminate(8,a);
                }
            }
            if (input.equalsIgnoreCase("j" + Integer.toString(a)))
            {
                Cells[9][a] = Board[9][a];
                if (Board[9][a].equals("M"))
                {

                    Terminate(9,a);
                }
            }
        }

    }

    public void CreateBoard()
    {

        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_WHITE+"\f");

        System.out.println("  a b c d e f g h i j");


        for(int a = 0; a < 10; a++)
        {
            for(int b = 0; b < 10; b++)
            {
                if(b==0)
                {
                    System.out.print(a+" ");
                }
                if (Cells[b][a].equals(Board[b][a]))
                {

                    System.out.print(ANSI_WHITE_BACKGROUND+ANSI_BLACK+Cells[b][a]+" ");
                }
                else
                {

                    System.out.print(ANSI_BLACK_BACKGROUND+ANSI_WHITE+Cells[b][a]+" ");
                }
            }
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_WHITE);
        }

    }

    public void PutMines()
    {
        Random A = new Random();
        int end = 0;
        while(end<15)
        {
            int b = A.nextInt(10);
            int c = A.nextInt(10);
            if (Board[b][c].equals(" "))
            {
                Board[b][c] = "M";
                end++;
            }

        }
        for(int a = 0; a < 10; a++)
        {
            for(int b = 0; b < 10; b++)
            {
                int c = 0;
                if (!(Board[a][b].equals("M")))
                {
                    if (a != 0&&Board[a - 1][b].equals("M"))
                    {
                        c++;
                    }
                    if (a != 9&&Board[a + 1][b].equals("M"))
                    {
                        c++;
                    }
                    if (a != 0 && b != 0&&Board[a - 1][b-1].equals("M"))
                    {
                        c++;
                    }
                    if (a != 9 && b != 0&&Board[a + 1][b-1].equals("M"))
                    {
                        c++;
                    }
                    if (b != 0&&Board[a ][b-1].equals("M"))
                    {
                        c++;
                    }
                    if (a != 0 && b != 9&&Board[a - 1][b+1].equals("M"))
                    {
                        c++;
                    }
                    if (a != 9 && b != 9&&Board[a + 1][b+1].equals("M"))
                    {
                        c++;
                    }
                    if (b != 9&&Board[a][b+1].equals("M"))
                    {
                        c++;
                    }
                    Board[a][b] = Integer.toString(c);
                }
            }
        }

    }

    public static void main(String[] args)
    {
        boolean retry;
        MyClass A = new MyClass();

        do
        {
            A.New();
            A.PutMines();

            retry = false;
            while (A.game)
            {
                A.CreateBoard();
                A.TakeInput();
            }

            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_WHITE+"\nDo you want to play again?(y/n)");
            Scanner scan = new Scanner(System.in);
            if (scan.nextLine().equals("y"))
            {
                retry = true;
                A.game = true;
            }
        } while (retry);


        
    }
}
