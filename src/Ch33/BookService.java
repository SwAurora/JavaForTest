package Ch33;

public class BookService implements Service
{
    //도서 등록
    //도서 수정
    //도서 삭제
    @Override
    public void Insert()
    {
        System.out.println("도서 등록!");
    }

    @Override
    public void Update()
    {
        System.out.println("도서 수정!");
    }

    @Override
    public void Delete()
    {
        System.out.println("도서 삭제!");
    }
}
