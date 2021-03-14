package com.company;

public class Model extends Phone{

    private int modelId;

    public Model(){}

    public Model(int modelId){
        this.modelId = modelId;
    }
    public int getModelId(){
        return modelId;
    }
}
