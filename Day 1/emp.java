public class emp {  
    int id;  
    String name;  
    address add;  
      
    public emp(int id, String name,address add) {  
        this.id = id;  
        this.name = name;  
        this.add=add;  
    }  
      
    void display(){  
    System.out.println(id+" "+name);  
    System.out.println(add.city+" "+add.state+" "+add.country);  
    }  
      
    public static void main(String[] args) {  
    address add1=new address("chennai","Tamilnadu","india");  
    address add2=new address("bengaluru","Karnataka","india");  
      
    emp e=new emp(111,"varun",add1);  
    emp e2=new emp(112,"arun",add2);  
          
    e.display();  
    e2.display();  
          
    }  
    }  