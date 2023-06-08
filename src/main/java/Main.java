import Repository.impl.AccountUserRepositoryImpl;
import entitty.AccountUser;
import service.impl.AccountUserServiceImpl;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        AccountUser accountUser = new AccountUser("king", "ali", "nasseri");
        AccountUser accountUser1 = new AccountUser("queen", "zahra", "hajiabadi");
        AccountUser accountUser3 = new AccountUser("jack", "amir", "nakhei");
        AccountUser accountUser4 = new AccountUser("ace", "nima", "zahedi");

        AccountUserServiceImpl accountUserService = new AccountUserServiceImpl
                (new AccountUserRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
            accountUserService.save(accountUser);
        System.out.println(accountUserService.searchByUserName("king"));

    }
}
