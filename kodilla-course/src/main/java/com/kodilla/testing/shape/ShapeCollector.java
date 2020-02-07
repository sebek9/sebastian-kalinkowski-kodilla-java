package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public boolean addFigure(Shape shape){
        shapeList.add(shape);
        return true;
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeList.contains(shape)){
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        Shape shape = null;
        if(n >= 0 && n < shapeList.size() ){
            shape = shapeList.get(n);
        }
        return shape;
    }
    public boolean showFigures(){
        boolean result = false;
        if(0 < shapeList.size() ){
            for (Shape n:shapeList) {
                System.out.println(n.getShapeName());
                result=true;
            }
        }
        return result;
    }
    int size() {
        return shapeList.size();
    }

}