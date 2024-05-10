interface spotify
{
    public void play();
    public void stream();
}

interface youtube
{
    public void search();
    public void live();
    public void upload();
}

class user1 implements spotify,youtube
{
    public void play()
    {
        System.out.println("Marry on a cross is playing");
    }
    
    public void stream()
    {
    System.out.println("Ghost is streaming");
    }
    public void search()
    {
        System.out.println("search i18solution");
    }
    public void live()
    {
        System.out.println("i18solution is on live");
    }
    public void upload()
    {
        System.out.println("java tutorial video is uploaded");
    }
}

class user2 extends user1 
{
    public void play()
    {
        System.out.println("Hall of fame is playing");
    }
    
    public void stream()
    {
    System.out.println("Script is streaming");
    }
     public void search()
    {
        System.out.println("user2 searched how to use ubuntu");
    }
}

class user3 extends user2
{
    public void play()
    {
        System.out.println("Bone is playing");
    }
    
    public void stream()
    {
    System.out.println("Imagine dragons is streaming");
    }
}
class user4 extends user3
{
    public void play()
    {
        System.out.println("Arima is playing");
    }
    
    public void stream()
    {
    System.out.println("ARRahman is streaming");
    }
}

public class multipleinterface
{
	public static void main(String[] args) {
	    user1 u1 = new user1();
	    u1.play();
	    u1.stream();
	    u1.search();
	    u1.upload();
	    u1.live();
	    user2 u2 = new user2();
	    u2.play();
	    u2.stream();
	    u2.search();
	    user3 u3 = new user3();
	    u3.play();
	    u3.stream();
	    user4 u4 = new user4();
	    u4.play();
	    u4.stream();
	
	}
}
