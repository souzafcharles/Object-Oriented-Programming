package souza.charles;

public class UserAccount {
    private String email;
    private String userName;
    private UserAccount[]  followers = new UserAccount[1000];
    private Post[] posts = new Post[1000];
    private Post[] timeline = new Post[10];

    private int lastfollowersIndex, lastPostIndex, lastTimelineIndex = 0;


    public UserAccount(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }

    public void post(String quote){
        Post newPost = new Post(quote, this);
        posts[lastPostIndex++] = newPost;

        for (int i = 0; i < lastfollowersIndex; i++) {
            UserAccount follower = followers[i];
            follower.updateTimeLine(newPost);
        }
    }

    public void updateTimeLine(Post post){
        timeline[lastTimelineIndex% 10] = post;
        lastTimelineIndex++;

    }
    public boolean deletePost (int index) {
        if (index <= 0 || posts[index] == null) return false;
        for (int i = index + 1; i < lastPostIndex - 1; i++) {
            posts[i] = posts[i + 1];
            posts[lastPostIndex--] = null;
        }
        return true;
    }

    public void acceptFollower(UserAccount follower){
        followers[lastfollowersIndex++] = follower;
    }

    public void bloockFollower(UserAccount follower){
        for (int i = 0; i < lastfollowersIndex; i++) {
            if (follower == followers[i]){
                for (int j = i; j < lastfollowersIndex - 1; j++){
                    followers[j] = followers[j-1];
                }
                followers[lastfollowersIndex--] = null;
                return;
            }
        }
    }

    public void clapPost(int index){
        if (index < 0 || posts[index] == null) return;
            posts[index].clap();
    }

    public void booPost(int index){
        if (index < 0 || posts[index] == null) return;
            posts[index].boo();
    }

    public String getPostAsString(){
        String result = "";
        for (int i = (lastPostIndex % 10)  - 1; i > 0;  i--) {
            Post post = posts[i];
            result += post.getAsString() + "\n";
        }
        return result;
    }

    public String getTimeLineAsString(){
        return null;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }
}
