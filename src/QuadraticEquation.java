 class QuadraticEquation{
    public double a, b, c;
    public QuadraticEquation(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDelta(){
        return this.b*this.b-(4*this.a*this.c);
    }
    public double getExperience1(){
        return -(this.b-Math.sqrt(this.b*this.b-(4*this.a*this.c)))/2*this.a;
    }
     public double getExperience2(){
         return -(this.b+Math.sqrt(this.b*this.b-(4*this.a*this.c)))/2*this.a;
    }
     public double getExperience3() {
         return -this.b/(2*this.a);
     }

}

