package Ch33;

public class MemberService implements Service
{
    //회원 조회
    //회원 수정
    //회원 삭제
    @Override
    public void Insert()
    {
        System.out.println("회원 가입!");
    }

    @Override
    public void Update()
    {
        System.out.println("회원 수정!");
    }

    @Override
    public void Delete()
    {
        System.out.println("회원 탈퇴!");
    }
}
