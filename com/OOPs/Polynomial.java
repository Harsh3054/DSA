package com.OOPs;

public class Polynomial {
    private int[] data;
    private int maxDegree;

    public Polynomial(){
        data=new int[5];
        maxDegree= Integer.MIN_VALUE;
    }

    public void setIndex(int index,int element){
        while(index>=data.length){
            restructure();
        }
        if(index<data.length){
            // if(getIndex(index)==0){
            // data[index]=element;
            // }
            // else{
            //     data[index]=getIndex(index)+element;
            // }
            data[index]=element;
            if(index>maxDegree){
                maxDegree=index;
            }
        }
    }


    private void restructure() {
        int[] temp=data;
        data=new int[data.length*2];
        for(int i=0;i< temp.length;i++){
            data[i]=temp[i];
        }
    }


    public int getIndex(int index){
        return data[index];
    }


    public void setCoefficient(int degree, int coeff){
        setIndex(degree,coeff);
    }


    public int getCoefficient(int degree){
        while(degree>=data.length){
            restructure();
        }
        return getIndex(degree);
    }
    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */



    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for(int i=0;i<data.length;i++){
            if(data[i]!=0){
                System.out.print(data[i]+"x"+i+" ");
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    //problem
    public Polynomial add(Polynomial p){
        int degree1=this.maxDegree;
        int degree2=p.maxDegree;
        int maxdegreecurrentfunction=Math.max(degree1,degree2);
        Polynomial P=new Polynomial();

        for (int i=0;i<=maxdegreecurrentfunction;i++)
        {
            int sum=0;
            if (i<=degree1)
            {
                sum += this.getCoefficient(i);
            }
            if (i<=degree2)
            {
                sum += p.getCoefficient(i);
            }
            P.setCoefficient(i,sum);
        }

        return P;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        int degree1=this.maxDegree;
        int degree2=p.maxDegree;
        int maxdegree=Math.max(degree1,degree2);
        int mindegree=Math.min(degree1,degree2);
        Polynomial P=new Polynomial();
        int i=0;

        for(;i<=mindegree;i++){
            P.setCoefficient(i,this.getCoefficient(i)- p.getCoefficient(i));
        }

        for(;i<=maxdegree;i++) {
            if (degree1 == maxdegree) {
                P.setCoefficient(i,getCoefficient(i));
            }
            else{
                P.setCoefficient(i, -(p.getCoefficient(i)));
            }
        }
        return P;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        int degree1=this.maxDegree;
        int degree2=p.maxDegree;
        Polynomial P=new Polynomial();
        for(int i=0;i<=degree1;i++){

            if(this.getCoefficient(i)!=0){

                for(int j=0;j<=degree2;j++){

                    if(p.getCoefficient(j)!=0){
                        int currCoeff=this.getCoefficient(i)*p.getCoefficient(j);
                        if(P.getCoefficient(i+j)==0){
                            P.setCoefficient(i+j,this.getCoefficient(i)*p.getCoefficient(j));
                        }
                        else{
                            P.setCoefficient(i+j,P.getCoefficient(i+j)+currCoeff);
                        }
//                        if(P.getCoefficient(i+j)!=0){
//                            P.setCoefficient(i+j,P.getCoefficient(i+j)+(this.getCoefficient(i)*p.getCoefficient(j)));
//                        }
                    }
                }
            }
        }
        return P;
    }
}
