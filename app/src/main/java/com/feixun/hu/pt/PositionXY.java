package com.feixun.hu.pt;

/**
 * Created by ruanpeiying on 16/7/20.
 */
public class PositionXY {
    private float x_coordinate;
    private float y_coordinate;

    public PositionXY() {
    }

    @Override
    public String toString() {
        return "PositionXY{" +
                "x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                '}';
    }

    public PositionXY(float x_coordinate, float y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public float getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(float x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public float getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(float y_coordinate) {
        this.y_coordinate = y_coordinate;
    }
}
