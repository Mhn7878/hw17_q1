import Repository.impl.AccountUserRepositoryImpl;
import Repository.impl.CommentRepositoryImpl;
import Repository.impl.LikesRepositoryImpl;
import Repository.impl.TweetRepositoryImpl;
import entitty.AccountUser;
import entitty.Likes;
import entitty.Tweet;
import service.impl.AccountUserServiceImpl;
import service.impl.CommentServiceImpl;
import service.impl.LikesServiceImpl;
import service.impl.TweetServiceImpl;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {

        AccountUserServiceImpl accountUserService = new AccountUserServiceImpl
                (new AccountUserRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));

        TweetServiceImpl tweetService = new TweetServiceImpl
                (new TweetRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));

        LikesServiceImpl likesService = new LikesServiceImpl(
                new LikesRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));

        CommentServiceImpl commentService = new CommentServiceImpl(
                new CommentRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
        AccountUser accountUser = new AccountUser("king", "ali", "nasseri");
        AccountUser accountUser1 = new AccountUser("queen", "zahra", "hajiabadi");
        AccountUser accountUser3 = new AccountUser("jack", "amir", "nakhei");
        AccountUser accountUser4 = new AccountUser("ace", "nima", "zahedi");
        Tweet tweet = new Tweet("life", accountUser1);
        Tweet tweet1 = new Tweet("good", accountUser3);
        Tweet tweet2 = new Tweet("hard", accountUser1);
        Tweet tweet3 = new Tweet("bye", accountUser);
        Tweet tweet4 = new Tweet("hello", accountUser4);
        Likes likes1 = new Likes(tweet1, accountUser3);
        Likes likes2 = new Likes(tweet1, accountUser3);
        Likes likes3 = new Likes(tweet2, accountUser1);
        accountUserService.save(accountUser1);
        accountUserService.save(accountUser);
        accountUserService.save(accountUser3);
        accountUserService.save(accountUser4);
        tweetService.save(tweet1);
        tweetService.save(tweet);
        tweetService.save(tweet2);
        tweetService.save(tweet3);
        tweetService.save(tweet4);
        likesService.save(likes1);
        likesService.save(likes3);
        likesService.save(likes2);
        likesService.remove(likes2);

        tweetService.addLikes(likes1);
        tweetService.addLikes(likes2);
        tweetService.addLikes(likes3);

        System.out.println(accountUserService.searchByUserName("king"));
        System.out.println(tweetService.findByUserAccount(accountUser1));
        System.out.println(tweetService.findAll());


    }
}
