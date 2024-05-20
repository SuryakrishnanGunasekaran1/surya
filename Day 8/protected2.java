 class protected2 {

    String  userid,password;

   protected protected2(String uid, String pw)
    {
        userid = uid;
        password = pw; 
        this.login(userid,password);
    }

    protected void login(String u , String pa)
    {
        
        if( userid.equals("gsk@gmail") &&  password.equals("1234qwer"))
        {
            System.out.println("login successfully");
        }
        else{
            System.out.println("userid or password is wrong");
        }

    }
    
}

