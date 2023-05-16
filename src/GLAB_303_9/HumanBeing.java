package GLAB_303_9;

public class HumanBeing {
    private float weight;
    private float height;
    private float bmi;

    public HumanBeing(float weight, float height, float bmi){
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    public HumanBeing(){

    }

    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getWeight(){
        return  weight;
    }
    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return height;
    }

    public void setBmi(float bmi){
        this.bmi = bmi;
    }
    public float getBmi(){
        return bmi;
    }
}

