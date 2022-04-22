package Ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

class Book
{
    private String BookCode;
    private String BookName;
    private String Publisher;
    private int Amount;

    public String getBookName()
    {
        return BookName;
    }

    void BookAdd(String BookCode, String BookName, String Publisher, int Amount)
    {
        this.BookCode = BookCode;
        this.BookName = BookName;
        this.Publisher = Publisher;
        this.Amount = Amount;
    }

    void BookInfo()
    {
        System.out.println("코드: " + BookCode);
        System.out.println("제목: " + BookName);
        System.out.println("출판사: " + Publisher);
        System.out.println("수량: " + Amount);
    }
}


public class C02ClassArrayMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int bookCount = 0;
        Book[] book = new Book[100];

        for(int i = 0; i < book.length; i++)
        {
            book[i] = new Book();
        }

        while(true)
        {
            System.out.println("--------BOOKStore--------");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 검색");
            System.out.println("3. 전체 도서 확인");
            System.out.println("4. 종료");
            System.out.println("--------BOOKStore--------");
            System.out.print("번호 입력 : ");

            try
            {
                num = input.nextInt();
            }
            catch(InputMismatchException e)
            {
                input.next();
            }

            switch(num)
            {
                case 1:
                    System.out.println("코드, 제목, 출판사, 수량을 입력하세요");
                    String code = input.next();
                    String name = input.next();
                    String pub = input.next();
                    int amount = input.nextInt();
                    book[bookCount].BookAdd(code, name, pub, amount);
                    bookCount++;
                    break;
                case 2:
                    if(book[0].getBookName() == null)
                    {
                        System.out.println("등록된 책이 없습니다");
                        break;
                    }
                    System.out.println("조회할 책의 이름을 입력하세요");
                    String name2 = input.next();
                    try
                    {
                        for(int i = 0; i < book.length; i++)
                        {
                            if(book[i].getBookName().equals(name2))
                            {
                                System.out.println("---" + (i + 1) + "번 책 ---");
                                book[i].BookInfo();
                                break;
                            }
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("없는 책입니다.");
                        break;
                    }
                    break;
                case 3:
                    for(int i = 0; i < book.length; i++)
                    {
                        if(book[0].getBookName() == null)
                        {
                            System.out.println("등록된 책이 없습니다");
                            break;
                        }
                        else if(book[i].getBookName() != null)
                        {
                            System.out.println("---" + (i + 1) + "번 책 ---");
                            book[i].BookInfo();
                        }
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(-1);
                    break;

                default:
                    System.out.println("Error: 1~4까지의 숫자만 입력해주세요");
            }
        }
    }
}
