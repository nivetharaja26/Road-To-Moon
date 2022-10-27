class HelloWorld {
    
    double rval;
    double ival;
    
    public HelloWorld(double rval,double ival){
        this.rval=rval;
        this.ival=ival;
        
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        HelloWorld num1=new HelloWorld(5.6,7.2),num2=new HelloWorld(5.1,4.3),temp;
        
        temp=sum(num1,num2);
        
        System.out.print(temp.rval + " + " + temp.ival + "i");
    }
    
    public static HelloWorld sum(HelloWorld num1,HelloWorld num2)
    {
        HelloWorld temp=new HelloWorld(0.0,0.0);
        
        temp.rval=num1.rval+num2.rval;
        temp.ival=num1.ival+num2.ival;
        
        return temp;
    }
}
